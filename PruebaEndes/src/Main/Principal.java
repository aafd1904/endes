package Main;

import Personajes.Personajes;

public class Principal {

	public static void main(String[] args) {
		
		Personajes personaje1 = new Personajes();
		Personajes personaje2 = new Personajes();
		
		personaje1.setNombre("Link");
		personaje1.setSexo("Masculino");
		personaje1.setHabilidadEspada(170);
		personaje1.setPuntosDefensa(120);
		personaje1.setVelocidad(135);
		personaje1.setAtaqueEspecial("Ataque circular de espada");
		personaje1.setHeroe(true);
		
		personaje2.setNombre("Dark Link");
		personaje2.setSexo("Masculino");
		personaje2.setHabilidadEspada(150);
		personaje2.setPuntosDefensa(135);
		personaje2.setVelocidad(165);
		personaje2.setAtaqueEspecial("Gran ataque circular");
		personaje2.setHeroe(false);
		
		System.out.println(personaje1.toString());
		System.out.println(personaje2.toString());
	}
}
