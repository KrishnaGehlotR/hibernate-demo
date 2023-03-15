package org.dev.kgr.pubapp.tester;

import org.dev.kgr.pubapp.dao.PubDAO;
import org.dev.kgr.pubapp.dto.PubDTO;

/**
 * The Class PubTester.
 */
public class PubTester {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		PubDTO pubDTO = new PubDTO();
		pubDTO.setPubId(1);
		pubDTO.setPubName("Cubes");
		pubDTO.setEntryFee(999.99);
		pubDTO.setEntryType(1);
		pubDTO.setDrinkType("Water");

		PubDAO pubDAO = new PubDAO();
		pubDAO.save(pubDTO);
	}
}