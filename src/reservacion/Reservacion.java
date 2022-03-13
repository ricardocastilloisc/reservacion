package reservacion;

public class Reservacion {
	
	private String IdentificadorReserva;
	private String NombreHotel;
	private String Ciudad;
	private String NombreCliente;
	private String ApellidoClientel;
	private String FechaReserva;
	private String FechaCheckIn;
	private String FechaCheckOut;
	private int NumeroTarjetaCredito;
	
	public String getIdentificadorReserva() {
		return IdentificadorReserva;
	}
	public void setIdentificadorReserva(String identificadorReserva) {
		IdentificadorReserva = identificadorReserva;
	}
	public String getNombreHotel() {
		return NombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		NombreHotel = nombreHotel;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getNombreCliente() {
		return NombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}
	public String getApellidoClientel() {
		return ApellidoClientel;
	}
	public void setApellidoClientel(String apellidoClientel) {
		ApellidoClientel = apellidoClientel;
	}
	public String getFechaReserva() {
		return FechaReserva;
	}
	public void setFechaReserva(String fechaReserva) {
		FechaReserva = fechaReserva;
	}
	public String getFechaCheckIn() {
		return FechaCheckIn;
	}

	public void setFechaCheckIn(String fechaCheckIn) {
		FechaCheckIn = fechaCheckIn;
	}
	public String getFechaCheckOut() {
		return FechaCheckOut;
	}
	public void setFechaCheckOut(String fechaCheckOut) {
		FechaCheckOut = fechaCheckOut;
	}
	public int getNumeroTarjetaCredito() {
		return NumeroTarjetaCredito;
	}
	public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
		NumeroTarjetaCredito = numeroTarjetaCredito;
	}
	
	public String getInformacionReservacion() {
		return "\nDatos de reservación:\n" + "Identificador  de la reservación: " + this.IdentificadorReserva + "\n"
				+ "Nombre del hotel:  " + this.NombreHotel + "\n" + "Ciudad: " + this.Ciudad + "\n"
				+ "Nombre del cliente: " + this.NombreCliente + "\n" + "Apellido cliente: " + this.ApellidoClientel
				+ "\n" + "Fecha de reserva: " + this.FechaReserva + "\n" + "Fecha de check-in: " + this.FechaCheckIn
				+ "\n" + "Fecha de check-out: " + this.FechaCheckOut + "\n" + "Número de tarjeta de crédito: "
				+ this.NumeroTarjetaCredito;
	}
}
