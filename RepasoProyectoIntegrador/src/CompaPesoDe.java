
public abstract class CompaPesoDe implements Comparable<Nombre>{
	public int compare(Nombre a, Nombre b){
		return(int)(b.getPeso()-a.getPeso()*-1);
	}

}
