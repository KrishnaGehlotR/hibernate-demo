package org.dev.kgr.foodapp.dto;

import java.util.List;

import org.dev.kgr.foodapp.dao.FoodDTO;
import org.dev.kgr.utility.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class FoodDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveFood(FoodDTO foodDTO) {

		Session session = null;
		Transaction transaction = null;

		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			foodDTO.setAmount(foodDTO.getPrice() * foodDTO.getQuantity());
			session.save(foodDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public FoodDTO getFoodById(int primaryKey) {
		FoodDTO foodDTO = null;

		try (Session session = factory.openSession();) {
			foodDTO = session.get(FoodDTO.class, new Integer(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return foodDTO;
	}

	public void updateFoodPriceById(double price, int primaryKey) {
		FoodDTO foodDTO = null;
		Transaction transaction = null;

		try (Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			foodDTO = session.load(FoodDTO.class, new Integer(primaryKey));
			foodDTO.setPrice(price);
			session.update(foodDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	public String getFoodTypeByName(String foodName) {
		String foodType = null;
		String hqlQuery = "SELECT food.foodType FROM FoodDTO food WHERE food.foodName=:name";

		try (Session session = factory.openSession();) {
			Query query = session.createQuery(hqlQuery);
			query.setParameter("name", foodName);
			foodType = (String) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return foodType;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<FoodDTO> getAllFoods() {
		List<FoodDTO> foods = null;
		String hqlQuery = "SELECT food FROM FoodDTO food";

		try (Session session = factory.openSession();) {
			Query query = session.createQuery(hqlQuery);
			foods = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return foods;
	}

	@SuppressWarnings("rawtypes")
	public int updateFoodPriceByFoodType(String foodType, double price) {
		int noOfRecordsUpdated = 0;
		Transaction tx = null;
		String hqlQuery = "Update FoodDTO food SET price=:fprice WHERE foodType=:fType";
		try (Session session = factory.openSession();) {
			tx = session.beginTransaction();
			Query query = session.createQuery(hqlQuery);
			query.setParameter("fType", foodType);
			query.setParameter("fprice", price);
			noOfRecordsUpdated = query.executeUpdate();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		return noOfRecordsUpdated;
	}
}