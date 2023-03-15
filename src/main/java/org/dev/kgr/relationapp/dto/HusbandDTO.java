package org.dev.kgr.relationapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "husbandTable")
public class HusbandDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8145221207765810977L;

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "husbandId")
	private int husbandId;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "height")
	private double height;

	@OneToOne
	@JoinColumn(name = "wifeId")
	private WifeDTO wifeDTO;
	
	public HusbandDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	/**
	 * @return the husbandId
	 */
	public int getHusbandId() {
		return husbandId;
	}

	/**
	 * @param husbandId the husbandId to set
	 */
	public void setHusbandId(int husbandId) {
		this.husbandId = husbandId;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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

	/**
	 * @return the wifeDTO
	 */
	public WifeDTO getWifeDTO() {
		return wifeDTO;
	}

	/**
	 * @param wifeDTO the wifeDTO to set
	 */
	public void setWifeDTO(WifeDTO wifeDTO) {
		this.wifeDTO = wifeDTO;
	}
}