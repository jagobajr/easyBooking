package es.deusto.ingenieria.sd.auctions.client;

import es.deusto.ingenieria.sd.auctions.client.controller.BidController;
import es.deusto.ingenieria.sd.auctions.client.controller.LoginController;
import es.deusto.ingenieria.sd.auctions.client.gui.BidWindow;
import es.deusto.ingenieria.sd.auctions.client.gui.LoginDialog;
import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;

public class MainProgram {

	public static void main(String[] args) {	
		ServiceLocator serviceLocator = new ServiceLocator();
		serviceLocator.setService(args[0], args[1], args[2]);
		
		LoginController loginController = new LoginController(serviceLocator);
		LoginDialog loginDialog = new LoginDialog(loginController);			
		loginDialog.login();
		
		BidController bidController = new BidController(serviceLocator);			
		BidWindow bidWindow = new BidWindow(bidController);
		bidWindow.getCategories();
		bidWindow.getArticles();
		bidWindow.makeBid();			
	}
}
