package package1;

import java.util.Scanner;

public class MyClassGanjilGenap extends Thread {
	static int input ;
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void run() {
		
		System.out.println("Input your number: ");
		input = scan.nextInt(); scan.nextLine();
		
		if (input % 2 == 0) 
		{
			System.out.println("Genap");
		}else {
			System.out.println("Ganjil");
		}
		
	}
	
}
