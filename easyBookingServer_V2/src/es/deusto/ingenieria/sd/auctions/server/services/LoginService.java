package es.deusto.ingenieria.sd.auctions.server.services;

import es.deusto.ingenieria.sd.auctions.server.data.User;
import es.deusto.ingenieria.sd.auctions.server.db.DBManager;

public class LoginService {
	
	private static LoginService instance;
	
	private LoginService() { }
	
	public static LoginService getInstance() {
		if (instance == null) {
			instance = new LoginService();
		}
		
		return instance;
	}

	public User login(String email, String password) {
		User user = DBManager.getInstance().getUser(email);
		
		if (user != null && user.chekPassword(password)) {
			return user;
		} else {
			return null;
		}
	}
}