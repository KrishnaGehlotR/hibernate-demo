package org.dev.kgr.relationapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "wifeTable")
public class WifeDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 723861386345547813L;

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "wifeId")
	private int wifeId;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private double salary;

	@Column(name = "height")
	private double height;

	public WifeDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	/**
	 * @return the wifeId
	 */
	public int getWifeId() {
		return wifeId;
	}

	/**
	 * @param wifeId the wifeId to set
	 */
	public void setWifeId(int wifeId) {
		this.wifeId = wifeId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
}