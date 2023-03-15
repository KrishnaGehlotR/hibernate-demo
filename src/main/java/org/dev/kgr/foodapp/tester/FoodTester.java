package org.dev.kgr.foodapp.tester;

import java.util.List;

import org.dev.kgr.foodapp.dao.FoodDTO;
import org.dev.kgr.foodapp.dto.FoodDAO;

public class FoodTester {

	public static void main(String[] args) {
		FoodDTO foodDTO = new FoodDTO();
		foodDTO.setFoodType("Kachori");
		foodDTO.setFoodName("Kachori");
		foodDTO.setQuantity(3);
		foodDTO.setPrice(15);

		FoodDAO foodDAO = new FoodDAO();
		foodDAO.saveFood(foodDTO);
		
		String foodName = foodDAO.getFoodTypeByName("Idly");
		System.out.println("Food Name: " + foodName);

		List<FoodDTO> allFoods = foodDAO.getAllFoods();
		for (FoodDTO foodDTO1 : allFoods) {
			System.out.println(foodDTO1.getFoodName());
		}

		int updateFdPrc = foodDAO.updateFoodPriceByFoodType("Breakfast", 50);
		System.out.println("Update Food Price: " + updateFdPrc);
	}
}
