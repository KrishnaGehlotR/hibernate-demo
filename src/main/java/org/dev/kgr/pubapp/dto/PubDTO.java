package org.dev.kgr.pubapp.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class PubDTO.
 */
@Entity
public class PubDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8763434154553224484L;

	/** The pub id. */
	@Id
	private int pubId;

	/** The pub name. */
	private String pubName;

	/** The drink type. */
	private String drinkType;

	/** The entry fee. */
	private double entryFee;

	/** The entry type. */
	private long entryType;

	/**
	 * Instantiates a new pub DTO.
	 */
	public PubDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	/**
	 * Gets the pub id.
	 *
	 * @return the pub id
	 */
	public int getPubId() {
		return pubId;
	}

	/**
	 * Sets the pub id.
	 *
	 * @param pubId the new pub id
	 */
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	/**
	 * Gets the pub name.
	 *
	 * @return the pub name
	 */
	public String getPubName() {
		return pubName;
	}

	/**
	 * Sets the pub name.
	 *
	 * @param pubName the new pub name
	 */
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	/**
	 * Gets the drink type.
	 *
	 * @return the drink type
	 */
	public String getDrinkType() {
		return drinkType;
	}

	/**
	 * Sets the drink type.
	 *
	 * @param drinkType the new drink type
	 */
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	/**
	 * Gets the entry fee.
	 *
	 * @return the entry fee
	 */
	public double getEntryFee() {
		return entryFee;
	}

	/**
	 * Sets the entry fee.
	 *
	 * @param entryFee the new entry fee
	 */
	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	/**
	 * Gets the entry type.
	 *
	 * @return the entry type
	 */
	public long getEntryType() {
		return entryType;
	}

	/**
	 * Sets the entry type.
	 *
	 * @param entryType the new entry type
	 */
	public void setEntryType(long entryType) {
		this.entryType = entryType;
	}
}