package died.lab01.problema01;

public class Recta1 {
	private Punto1 p1; 
	private Punto1 p2; 
	float x,y; 
	public Recta1(Punto1 p1, Punto1 p2){
		this.p1=p1;
		this.p2=p2;
	}
	public void Recta(){
		this.x=this.y; 
	}
	public float pendiente() {
		float m= (p2.y-p1.y)/(p2.x-p1.x);
		return m; 
	}
	public static boolean paralelas(Recta1 r1, Recta1 r2){ 
		boolean paralela=false; 
		if(r1.pendiente()==r2.pendiente()) {
			paralela = true; 
		}
		return paralela; 
	}
	

}
