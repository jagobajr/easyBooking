package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Usuario {

		private String correo;
		private Aeropuerto aeropuertoPred;
		private String nom_usuario;
		private String pass;
		
		
		
		public Usuario(String correo, Aeropuerto aeropuertoPred, String nom_usuario, String pass) {
			super();
			this.correo = correo;
			this.aeropuertoPred = aeropuertoPred;
			this.nom_usuario = nom_usuario;
			this.pass = pass;
		}
		
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public Aeropuerto getAeropuertoPred() {
			return aeropuertoPred;
		}
		public void setAeropuertoPred(Aeropuerto aeropuertoPred) {
			this.aeropuertoPred = aeropuertoPred;
		}
		public String getNom_usuario() {
			return nom_usuario;
		}
		public void setNom_usuario(String nom_usuario) {
			this.nom_usuario = nom_usuario;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		
		
		
		
		
		
}
