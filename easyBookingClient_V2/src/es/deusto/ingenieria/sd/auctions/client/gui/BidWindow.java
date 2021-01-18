package es.deusto.ingenieria.sd.auctions.client.gui;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
import es.deusto.ingenieria.sd.auctions.server.data.dto.ArticleDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.CategoryDTO;

public class BidWindow {
	private static NumberFormat numberFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
	public BidController controller;
	
	public BidWindow(BidController controller) {
		this.controller = controller;
	}

	public void getCategories() {
		System.out.println(" - Getting all the categories...");
		
		List<CategoryDTO> categories = this.controller.getCategories();
		
		for (CategoryDTO category : categories) {
			System.out.println("    * " + category.getName());
		}
	}

	public void getArticles() { 
		String category = "iPad";
		
		System.out.println(" - Getting the products for the category '" + category + "'");
		
		List<ArticleDTO> articles = this.controller.getArticles(category);
		
		for (ArticleDTO article : articles) {
			System.out.println("    * " + article.getNumber() + " - " + article.getTitle() + " - " + numberFormatter.format(article.getActualPrice()));
		}
	}
	
	public void makeBid() {
		long article = 1l;
		float bid = 11.0f;
		
		System.out.println(" - Making a bid of " + numberFormatter.format(bid) + " for the article '" + article + "'");
		
		boolean bidResult = this.controller.makeBid(article, bid);
		
		System.out.println("    * Make bid result: " + bidResult);		
	}	
}