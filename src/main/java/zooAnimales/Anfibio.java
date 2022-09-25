package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {

    }  
    
    public Anfibio(String nombre, int edad, String habitat, String genero,
            String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
    	ranas++;
    	Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    	listado.add(rana);
    	return rana;
    }

    public static Anfibio crearSalamandra (String nombre, int edad, String genero) {
    	salamandras++;
    	Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro", false);
    	listado.add(salamandra);
    	return salamandra;
    }
    public int cantidadAnfibios() {
        return listado.size(); 
    }

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public String movimiento() {
    	return "saltar";
    }
    
    

}