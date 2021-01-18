package es.deusto.ingenieria.sd.auctions.server.services;

import java.util.Calendar;

import es.deusto.ingenieria.sd.auctions.server.data.Article;
import es.deusto.ingenieria.sd.auctions.server.data.Bid;
import es.deusto.ingenieria.sd.auctions.server.data.User;
import es.deusto.ingenieria.sd.auctions.server.db.DBManager;

public class BidService {
	
	private static BidService instance;

	private BidService() { }
	
	public static BidService getInstance() {
		if (instance == null) {
			instance = new BidService();
		}
		
		return instance;
	}

	public boolean makeBid(User user, long articleNumber, float bid) {
		Article article = DBManager.getInstance().getArticle(articleNumber);

		if (article != null && article.isActive()) {
			Bid newBid = new Bid();		
			newBid.setDate(Calendar.getInstance().getTime());
			newBid.setPrice(bid);
			newBid.setArticle(article);
			newBid.setUser(user);		
			article.addBid(newBid);
			user.addBid(newBid);
		
			DBManager.getInstance().storeObjectInDB(newBid);
			
			return true;
		} else {
			return false;
		}
	}
}