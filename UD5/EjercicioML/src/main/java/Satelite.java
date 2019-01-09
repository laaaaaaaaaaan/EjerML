
public class Satelite {

	public double meridiano;
	public double paralelo;
	public double distancia_tierra;
	public double desplazamiento;

	public Satelite (double m,double p,double d){
		this.meridiano=m;
		this.paralelo=p;
		this.distancia_tierra=d;
	}
	public Satelite (){
		this.meridiano=this.paralelo=this.distancia_tierra=0;
	}

	public void setPosicion(double m,double p,double d){
		this.meridiano=m;
		this.paralelo=p;
		this.distancia_tierra=d;
	}	
	public void printPosicion(){
		System.out.println("El sat�lite se encuentra en el paralelo "+ this.paralelo+ 
		" Meridiano "+this.meridiano+" a una distancia de la tierra de "+this.distancia_tierra+"Kil�metros");
	}
	
	public void variaAltura(double desplazamiento) {
		if (desplazamiento>0)
		{
			System.out.println("tiene que acercarse");
		}
		else {
			System.out.println("tiene que alegarse");
		}
		
		
	}
}

