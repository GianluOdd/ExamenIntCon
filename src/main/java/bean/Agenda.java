package bean;

public class Agenda {

	private int id;
	private int idMascota; 
	private int rutDueño; 
	private String nombreMascota; 
	private int hora; 
	private int fecha;
	
	public Agenda(int id, int idMascota, int rutDueño, String nombreMascota, int hora, int fecha) {
		
		this.id = id;
		this.idMascota = idMascota;
		this.rutDueño = rutDueño;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public int getRutDueño() {
		return rutDueño;
	}

	public void setRutDueño(int rutDueño) {
		this.rutDueño = rutDueño;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
}
