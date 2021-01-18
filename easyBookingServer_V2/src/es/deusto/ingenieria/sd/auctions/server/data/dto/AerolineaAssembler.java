package es.deusto.ingenieria.sd.auctions.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.Category;

public class AerolineaAssembler {
	private static AerolineaAssembler instance;

	private AerolineaAssembler() { }
	
	public static AerolineaAssembler getInstance() {
		if (instance == null) {
			instance = new AerolineaAssembler();
		}
		
		return instance;
	}

	public AeropuertoDTO entityToDTO(Category category) {
		AeropuertoDTO dto = new AeropuertoDTO();		
		dto.setName(category.getName());
		return dto;
	}

	public List<AeropuertoDTO> entityToDTO(List<Category> categories) {		
		List<AeropuertoDTO> dtos = new ArrayList<>();
		
		for (Category category : categories) {
			dtos.add(this.entityToDTO(category));
		}
		
		return dtos;
	}
}