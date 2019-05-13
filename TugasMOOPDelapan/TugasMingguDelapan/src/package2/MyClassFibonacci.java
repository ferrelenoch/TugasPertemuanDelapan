package package2;

public class MyClassFibonacci extends Thread {
	int fibonacci ;
	int angka = 0 ;
	int angka2 = 1;
	String Fibonacci = "" ;
	
	public void run() {
		System.out.println("20 Bilangan Fibonacci: ");
		
		System.out.println(angka + " ");
		System.out.println(angka2 + " ");
		
		for (int i = 1; i < 20; i++) {
			fibonacci = angka + angka2 ;
			angka = angka2 ;
			angka2 = fibonacci ;
			
			Fibonacci = Fibonacci + fibonacci + " ";
			System.out.println(Fibonacci);
		}
	}
}
