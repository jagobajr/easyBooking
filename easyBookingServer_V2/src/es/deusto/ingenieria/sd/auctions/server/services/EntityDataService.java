package es.deusto.ingenieria.sd.auctions.server.services;

import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.dto.AeropuertoAssembler;
import es.deusto.ingenieria.sd.auctions.server.data.dto.AerolineaDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.AerolineaAssembler;
import es.deusto.ingenieria.sd.auctions.server.data.dto.AeropuertoDTO;
import es.deusto.ingenieria.sd.auctions.server.db.DBManager;

public class EntityDataService {
	
	private static EntityDataService instance;

	private EntityDataService() { }
	
	public static EntityDataService getInstance() {
		if (instance == null) {
			instance = new EntityDataService();
		}

		return instance;
	}

	public List<AeropuertoDTO> getCategories() {
		return AerolineaAssembler.getInstance().entityToDTO(DBManager.getInstance().getCategories());
	}

	public List<AerolineaDTO> getArticles(String category) {
		return AeropuertoAssembler.getInstance().entityToDTO(DBManager.getInstance().getArticles(category));
	}
}