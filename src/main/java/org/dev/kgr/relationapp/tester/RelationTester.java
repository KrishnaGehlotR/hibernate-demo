package org.dev.kgr.relationapp.tester;

import org.dev.kgr.relationapp.dao.HusbandDAO;
import org.dev.kgr.relationapp.dao.WifeDAO;
import org.dev.kgr.relationapp.dto.HusbandDTO;
import org.dev.kgr.relationapp.dto.WifeDTO;

public class RelationTester {

	public static void main(String[] args) {

		HusbandDTO husbandDTO = new HusbandDTO();
		WifeDTO wifeDTO = new WifeDTO();

		husbandDTO.setName("Rahul");
		husbandDTO.setAge(28);
		husbandDTO.setHeight(5.8);

		wifeDTO.setName("Priya");
		wifeDTO.setHeight(5.6);
		wifeDTO.setSalary(49999);
		
		WifeDAO wifeDAO = new WifeDAO();
		wifeDAO.saveWife(wifeDTO);

		husbandDTO.setWifeDTO(wifeDTO);
		HusbandDAO husbandDAO = new HusbandDAO();
		husbandDAO.saveWife(husbandDTO);
	}
}