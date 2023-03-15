package org.dev.kgr.treeapp.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class LeafDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8558309175586784114L;

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column
	private int leafId;

	@Column
	private String color;

	@Column
	private double weight;

	@Column
	private String shape;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH })
	@JoinColumn
	private TreeDTO treeDto;

	public LeafDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	/**
	 * @return the leafId
	 */
	public int getLeafId() {
		return leafId;
	}

	/**
	 * @param leafId the leafId to set
	 */
	public void setLeafId(int leafId) {
		this.leafId = leafId;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @return the treeDto
	 */
	public TreeDTO getTreeDto() {
		return treeDto;
	}

	/**
	 * @param treeDto the treeDto to set
	 */
	public void setTreeDto(TreeDTO treeDto) {
		this.treeDto = treeDto;
	}
}
