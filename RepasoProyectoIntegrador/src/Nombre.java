import processing.core.PApplet;

public class Nombre implements Comparable {
	
	
	private String usuario, color, iden;
	private int r,g,b, edad, peso;
	
	private String[] infor;
	
	//constructor
	public Nombre(String usuario, String color, String iden){
		this.usuario = usuario;
		this.infor = infor;
		this.color = color;
	}
	
	public void nombreColor(PApplet app) {
		String[] colores = color.split("/");
		
		for (int i = 0; i < colores.length; i++) {
			
			r= Integer.parseInt(colores[0]);
			g= Integer.parseInt(colores[0]);
			b= Integer.parseInt(colores[0]);
			
		}
	}

	public void pintar(PApplet app, int u) {
		app.fill(r,g,b);
		app.text(usuario, 20, u * 20);
		
	}
	
	public void cargarInformacion(){
		iden= infor[0];
		edad= Integer.parseInt(infor[1]);
		peso= Integer.parseInt(infor[2]);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Nombre){
			return ((Nombre) o).edad-edad;	
		}
		return 0;
	}


	public int getPeso() {
		// TODO Auto-generated method stub
		return 0;
	}
}
