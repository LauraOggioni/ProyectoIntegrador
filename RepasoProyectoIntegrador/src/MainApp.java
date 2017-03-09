import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class MainApp extends PApplet {


	public static void main(String[] args){
		PApplet.main("MainApp");
	}
	
	public void settings(){
		size(300,300);
	}
	
	private ArrayList<String> usuarios;
	private ArrayList<String> informacion;
	private ArrayList<String> tonos;
	
	private LinkedList<Nombre>nombres;

	public void setup(){
		usuarios = new ArrayList<>();
		informacion = new ArrayList<>();
		tonos = new ArrayList<>();
		
		nombres = new LinkedList<Nombre>();
		
		String[] usuariosString = loadStrings("../data/usuarios.txt");
		String[] informacionString = loadStrings("../data/informacion.txt");
		String[] tonosString = loadStrings("../data/tonos.txt");
		
	    for (int i = 0; i < nombres.size(); i++) {
			nombres.get(i).nombreColor(this);
		}
	}
	
	public void draw(){
		background(255);
		for (int i = 0; i < nombres.size(); i++) {
			nombres.get(i).pintar(this, i);
		}
	}
	public void keyPressed(){
		if(keyCode == 1){
			Collections.sort(nombres);
		}
		if(keyCode == 2){	
		}
	}
}
