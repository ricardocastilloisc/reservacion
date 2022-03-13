package reservacion;

public class Fax {
	private String Remitente;
	private String Destinatario;
	
	public String getRemitente() {
		return Remitente;
	}
	public void setRemitente(String remitente) {
		Remitente = remitente;
	}
	public String getDestinatario() {
		return Destinatario;
	}
	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}
	
	public void enviarFax(String informacionReservacion) {

		String mensaje = "\n\nSe envía la información por fax " + "de : " + this.Remitente + " a :  "
				+ this.Destinatario + "\n\n" + "La siguiente información" + informacionReservacion;

		System.out.println(mensaje);
	}
}
