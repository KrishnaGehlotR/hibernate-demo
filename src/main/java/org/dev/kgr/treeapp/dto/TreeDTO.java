package org.dev.kgr.treeapp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TreeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3853694564194238915L;

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column
	private int treeId;

	@Column
	private String name;

	@Column
	private double height;

	@Column
	private double years;

	@OneToMany(mappedBy = "treeDto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<LeafDTO> leafDTO;

	public TreeDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	/**
	 * @return the treeId
	 */
	public int getTreeId() {
		return treeId;
	}

	/**
	 * @param treeId the treeId to set
	 */
	public void setTreeId(int treeId) {
		this.treeId = treeId;
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
	 * @return the years
	 */
	public double getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(double years) {
		this.years = years;
	}

	/**
	 * @return the leafDTO
	 */
	public List<LeafDTO> getLeafDTO() {
		return leafDTO;
	}

	/**
	 * @param leafDTO the leafDTO to set
	 */
	public void setLeafDTO(List<LeafDTO> leafDTO) {
		this.leafDTO = leafDTO;
	}

}
