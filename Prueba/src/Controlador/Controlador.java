package Controlador;

import Modelo.Persistencia;
import Vista.Interfaz;

public class Controlador {
	Persistencia p;
	Interfaz i;
	
	public Controlador(){
		p=new Persistencia();
	    i = new Interfaz(p.getDato());
	}
}
