package es.deusto.ingenieria.sd.auctions.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.Article;
import es.deusto.ingenieria.sd.auctions.server.data.Bid;

public class AeropuertoAssembler {
	
	private static AeropuertoAssembler instance;

	private AeropuertoAssembler() { }
	
	public static AeropuertoAssembler getInstance() {
		if (instance == null) {
			instance = new AeropuertoAssembler();
		}

		return instance;
	}

	public AerolineaDTO entityToDTO(Article article) {
		AerolineaDTO dto = new AerolineaDTO();
		
		dto.setNumber(article.getNumber());
		dto.setTitle(article.getTitle());
		
		ArrayList<Bid> bids = new ArrayList<Bid>(article.getBids());
		
		if (bids.isEmpty()) {
			dto.setActualPrice(article.getInitialPrice());
		} else {
			dto.setActualPrice(bids.get(bids.size()-1).getPrice());
		}
				
		return dto;
	}
	
	public List<AerolineaDTO> entityToDTO(List<Article> articles) {
		List<AerolineaDTO> dtos = new ArrayList<>();
		
		for (Article article : articles) {
			dtos.add(this.entityToDTO(article));
		}
		
		return dtos;		
	}
}