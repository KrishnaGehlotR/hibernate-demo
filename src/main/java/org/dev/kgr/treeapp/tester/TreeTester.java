package org.dev.kgr.treeapp.tester;

import java.util.ArrayList;
import java.util.List;

import org.dev.kgr.treeapp.dao.TreeDAO;
import org.dev.kgr.treeapp.dto.LeafDTO;
import org.dev.kgr.treeapp.dto.TreeDTO;

public class TreeTester {

	public static void main(String[] args) {

		TreeDTO treeDTO = new TreeDTO();
		treeDTO.setName("Neem");
		treeDTO.setHeight(120.5);
		treeDTO.setYears(50);

		LeafDTO leafDTO1 = new LeafDTO();
		leafDTO1.setColor("Green");
		leafDTO1.setShape("Rectangle");
		leafDTO1.setWeight(2.9);

		LeafDTO leafDTO2 = new LeafDTO();
		leafDTO2.setColor("Light Green");
		leafDTO2.setShape("Triangle");
		leafDTO2.setWeight(1.5);

		List<LeafDTO> leafList = new ArrayList<LeafDTO>();
		leafList.add(leafDTO1);
		leafList.add(leafDTO2);

		leafDTO1.setTreeDto(treeDTO);
		leafDTO2.setTreeDto(treeDTO);

		treeDTO.setLeafDTO(leafList);

		TreeDAO treeDAO = new TreeDAO();
		treeDAO.saveTree(treeDTO);
	}
}
