package bean;

public class Mascota {
	
	private int idMascota; 
	private int rutDueño;
	private String tipoMascota; 
	private int edad; 
	private String nombreMascota;
	
	public Mascota(int idMascota, int rutDueño, String tipoMascota, int edad, String nombreMascota) {
		this.idMascota = idMascota;
		this.rutDueño = rutDueño;
		this.tipoMascota = tipoMascota;
		this.edad = edad;
		this.nombreMascota = nombreMascota;
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

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	
	
}
