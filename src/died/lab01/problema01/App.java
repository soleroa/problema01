package died.lab01.problema01;

public class App {
	public static void main(String[] args) {
		Punto1 p1= new Punto1(1,1);
		Punto1 p2= new Punto1(2,2);
		Punto1 p3= new Punto1(3,3);
		Recta1 r1= new Recta1(p1,p2);
		Recta1 r2 = new Recta1(p2,p3); 		
		boolean a = Recta1.paralelas(r1, r2);
		
		System.out.println("La pendiente de la recta 1 es:" + r1.pendiente());
		System.out.println("La pendiente de la recta 2 es:" + r2.pendiente());
		if (a==true) {
			System.out.println("Son rectas paralelas");
		}else {
			System.out.println("No son rectas paralelas");
		}
		
	}
}
