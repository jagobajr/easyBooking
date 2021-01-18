package es.deusto.ingenieria.sd.auctions.server.data.dto;

import es.deusto.ingenieria.sd.auctions.server.data.Usuario;

public class UsuarioAssembler {
	private static UsuarioAssembler instance;

	private UsuarioAssembler() { }
	
	public static UsuarioAssembler getInstance() {
		if (instance == null) {
			instance = new UsuarioAssembler();
		}

		return instance;
	}

	public UsuarioDTO entityToDTO(Usuario user) {
		UsuarioDTO dto = new UsuarioDTO();
		
		dto.setEmail(user.getCorreo());
		dto.setNickname(user.getNom_usuario());
		
		return dto;
	}
}