package es.deusto.ingenieria.sd.auctions.client.controller;

import java.rmi.RemoteException;

import es.deusto.ingenieria.sd.auctions.client.remote.ServiceLocator;

public class LoginController {
	
	public ServiceLocator serviceLocator;

	public LoginController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String email, String password) {
		try {
			return this.serviceLocator.getService().login(email, password);
		} catch (RemoteException e) {
			System.err.println("# Error during login: " + e);
			return false;
		}
	}
}