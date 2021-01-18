package es.deusto.ingenieria.sd.auctions.server;

import java.rmi.Naming;

import es.deusto.ingenieria.sd.auctions.server.remote.IRemoteFacade;
import es.deusto.ingenieria.sd.auctions.server.remote.RemoteFacade;

public class MainProgram {

	public static void main(String[] args) {	
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		String name = "//" + args[0] + ":" + args[1] + "/" + args[2];		
		
		try {
			IRemoteFacade remoteFacade = RemoteFacade.getInstance();			
			Naming.rebind(name, remoteFacade);
			System.out.println(" * Auction server '" + name + "' started!!");
		} catch (Exception ex) {
			System.err.println(" # Auction Server Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
