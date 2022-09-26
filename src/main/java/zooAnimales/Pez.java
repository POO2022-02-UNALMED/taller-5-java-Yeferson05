package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones=0;
    public static int bacalaos=0;
    private String colorEscamas;
    private int cantidadAletas;
    public Pez() {
        this(null, 0, null, null, null, 0);
    } 
    
    public Pez(String nombre, int edad, String habitat, String genero,
            String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }  
    
    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        listado.add(bacalao);
        return bacalao;
    }

    public static int cantidadPeces() {
        return bacalaos+salmones; 
    }
    
    public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
    public String movimiento() {
    	return "nadar";
    }

    
}