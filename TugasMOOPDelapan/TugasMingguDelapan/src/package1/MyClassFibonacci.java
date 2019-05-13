package package1;

public class MyClassFibonacci extends Thread {

	int angka = 0 ;
	int angka2 = 1 ;
	int fibonacci  ;
	
	public void run() {
		do {
			fibonacci = angka + angka2 ;
			angka = angka2 ;
			angka2 = fibonacci ;
			
		} while (fibonacci < MyClassGanjilGenap.input);
			if (fibonacci == MyClassGanjilGenap.input) {
				System.out.println("Fibonacci");
			}else {
				System.out.println("Bukan Fibonacci");
				
			}
		}
	}
	
