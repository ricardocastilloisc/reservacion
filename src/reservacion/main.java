package reservacion;

import java.util.Scanner;
import reservacion.Reservacion;
import reservacion.Email;
import reservacion.Fax;


public class main {
	
	static Reservacion reservacion;
	
	static Email email;
	
	static Fax fax;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se crea clase puede ser una array para efectos practicos pues solo por
		// concepto es de una ejecución
		reservacion = new Reservacion();

		// clase de email
		email = new Email();

		// clase fax
		fax = new Fax();

		// Se crea la clase de escaneo que es para recibier los datos

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese del identificador  de la reservación:");
		reservacion.setIdentificadorReserva(scanner.nextLine());

		System.out.println("Ingrese del nombre del hotel:");
		reservacion.setNombreHotel(scanner.nextLine());

		System.out.println("Ingrese de la ciudad:");
		reservacion.setCiudad(scanner.nextLine());

		System.out.println("Ingrese del nombre del cliente:");
		reservacion.setNombreCliente(scanner.nextLine());

		System.out.println("Ingrese del apellido del cliente:");
		reservacion.setApellidoClientel(scanner.nextLine());

		System.out.println("Ingrese la fecha de reserva:");
		reservacion.setFechaReserva(scanner.nextLine());

		System.out.println("Ingrese la fecha de check-in:");
		reservacion.setFechaCheckIn(scanner.nextLine());

		System.out.println("Ingrese la fecha de check-out:");
		reservacion.setFechaCheckOut(scanner.nextLine());

		System.out.println("Ingrese el número de tarjeta de crédito:");
		reservacion.setNumeroTarjetaCredito(Integer.parseInt(scanner.nextLine()));

		System.out.println("\n\nSe enviará correo eléctronico");

		System.out.println("Ingrese remitente:");

		email.setRemitente(scanner.nextLine());

		System.out.println("Ingrese destinatario:");

		email.setDestinatario(scanner.nextLine());

		email.enviarEmail(reservacion.getInformacionReservacion());

		System.out.println("\n\nSe enviará fax");

		System.out.println("Ingrese remitente:");

		fax.setRemitente(scanner.nextLine());

		System.out.println("Ingrese destinatario:");

		fax.setDestinatario(scanner.nextLine());

		fax.enviarFax(reservacion.getInformacionReservacion());

	}

}
