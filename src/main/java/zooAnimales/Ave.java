package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public Ave() {
    	this(null,0,null,null,null);
    }  
    
    public Ave(String nombre, int edad, String habitat, String genero,
            String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero) {
    	halcones++;
        Ave halcon = new Ave (nombre, edad,"montanas", genero, "cafe glorioso");
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
    	aguilas++;
        Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(aguila);
        return aguila;
    }

    public static int cantidadAves() {
        return aguilas+halcones; 
    }

    public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    public String movimiento() {
    	return "volar";
    }


    
}
