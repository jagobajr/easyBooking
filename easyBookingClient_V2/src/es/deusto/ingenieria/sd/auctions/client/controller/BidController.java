package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;
import es.deusto.ingenieria.sd.auctions.server.data.dto.ArticleDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.CategoryDTO;

public class BidController {
	public ServiceLocator serviceLocator;
	
	public BidController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator; 
	}

	public List<CategoryDTO> getCategories() {
		try {
			return this.serviceLocator.getService().getCategories();
		} catch (RemoteException e) {
			System.err.println("# Error getting all categories: " + e);
			return null;
		}
	}

	public List<ArticleDTO> getArticles(String category) {
		try {
			return this.serviceLocator.getService().getArticles(category);
		} catch (RemoteException e) {
			System.err.println("# Error getting articles of a category: " + e);
			return null;
		}
	}

	public boolean makeBid(long article, float bid) {
		try {
			return this.serviceLocator.getService().makeBid(article, bid);
		} catch (RemoteException e) {
			System.err.println("# Error making a bid: " + e);
			return false;
		}
	}
}