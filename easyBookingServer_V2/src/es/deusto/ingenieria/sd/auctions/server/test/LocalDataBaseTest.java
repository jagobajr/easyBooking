package es.deusto.ingenieria.sd.auctions.server.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.Article;
import es.deusto.ingenieria.sd.auctions.server.data.Bid;
import es.deusto.ingenieria.sd.auctions.server.data.Category;
import es.deusto.ingenieria.sd.auctions.server.data.User;
import es.deusto.ingenieria.sd.auctions.server.db.DBManager;

public class LocalDataBaseTest {

	public static void main(String[] args) {		
		try {								
			List<Category> categories = DBManager.getInstance().getCategories();
			System.out.println(" - Retreiving categories ...");
			System.out.println("   - " + categories.size() + " categories retreived!");
						
			Category category = DBManager.getInstance().getCategory(categories.get(0).getName());			
			System.out.println(" - Retreiving articles of the category " + categories.get(0).getName() + " ...");
			ArrayList<Article> articles = DBManager.getInstance().getArticles(category.getName());		
			System.out.println("   - " + articles.size() + " articles retreived!");
			
			System.out.println(" - Retreiving user by email ...");
			User user = DBManager.getInstance().getUser("sample@gmail.com");
			System.out.println("   - " + user + " retreived!");
			
			System.out.println(" - Retreiving article by number ...");
			Article article = DBManager.getInstance().getArticle(articles.get(0).getNumber());
			System.out.println(article + "retreived!");
			
			System.out.println(" - Making a bid ...");
			Bid newBid = new Bid();		
			newBid.setDate(Calendar.getInstance().getTime());			
			newBid.setPrice(article.getInitialPrice()+1);
			newBid.setUser(user);
			newBid.setArticle(article);
		
			article.addBid(newBid);
			user.addBid(newBid);
			
			System.out.println(" - Storing the bid...");
			DBManager.getInstance().storeObjectInDB(newBid);
			
			System.out.println(" - Deleting data...");
			DBManager.getInstance().deleteData();
		} catch (Exception ex) {
			System.out.println(" $ Entities Test Error :" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}