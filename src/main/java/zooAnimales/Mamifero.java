package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {

    }  
    
    public Mamifero(String nombre, int edad, String habitat, String genero,
    		boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    public int cantidadMamiferos() {
    	return listado.size();
    }
    public Mamifero crearCaballo(String nombre, int edad, String genero) {
    	caballos++;
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        listado.add(caballo);
        return caballo;
    }

    public Mamifero crearLeon(String nombre, int edad, String genero) {
    	leones++;
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        listado.add(leon);
        return leon;
    }
    public int cantidadMamifero() {
        return listado.size(); 
    }

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
    
}
