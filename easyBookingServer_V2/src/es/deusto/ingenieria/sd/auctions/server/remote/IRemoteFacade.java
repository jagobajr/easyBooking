package es.deusto.ingenieria.sd.auctions.server.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.dto.AerolineaDTO;
import es.deusto.ingenieria.sd.auctions.server.data.dto.AeropuertoDTO;

public interface IRemoteFacade extends Remote {	
	public boolean login(String aEmail, String aPassword) throws RemoteException;
	public List<AeropuertoDTO> getCategories() throws RemoteException;
	public List<AerolineaDTO> getArticles(String aCategory) throws RemoteException;
	public boolean makeBid(long aArticle, float aBid) throws RemoteException;	
}