package com.arquitecturajava.json1;

public class Principal {

	public static void main(String[] args) {

		String json= "{\"nombre\":\"pedro\"}";
		LeerJSonPersona leer = new LeerJSonPersona();
		Persona persona = leer.getPersona(json);
		System.out.println(persona.getNombre());

	}

}
