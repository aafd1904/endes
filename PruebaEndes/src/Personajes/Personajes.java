package Personajes;

public class Personajes {
	private String nombre;
	private String sexo;
	private int habilidadEspada;
	private int puntosDefensa;
	private int velocidad;
	private String ataqueEspecial;
	private boolean heroe=false;
	
	public Personajes() {
	}

	public Personajes(String nombre, String sexo, int habilidadEspada, int puntosDefensa, int velocidad,
			String ataqueEspecial, boolean heroe) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.habilidadEspada = habilidadEspada;
		this.puntosDefensa = puntosDefensa;
		this.velocidad = velocidad;
		this.ataqueEspecial = ataqueEspecial;
		this.heroe = heroe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getHabilidadEspada() {
		return habilidadEspada;
	}

	public void setHabilidadEspada(int habilidadEspada) {
		this.habilidadEspada = habilidadEspada;
	}

	public int getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(int puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(String ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public boolean isHeroe() {
		return heroe;
	}

	public void setHeroe(boolean heroe) {
		this.heroe = heroe;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", sexo=" + sexo + ", habilidadEspada=" + habilidadEspada
				+ ", puntosDefensa=" + puntosDefensa + ", velocidad=" + velocidad + ", ataqueEspecial=" + ataqueEspecial
				+ ", heroe=" + heroe + "]";
	}
	
	
	
}

