
public abstract class CompaPeso implements Comparable<Nombre> {
	
	public int compare(Nombre a, Nombre b){
		return(int)(a.getPeso()-b.getPeso());
	}
	
}
