package package1;

public class Demo {

	public static void main(String[] args) {
		MyClassGanjilGenap gg = new MyClassGanjilGenap() ;
		
		MyClassFibonacci f = new MyClassFibonacci() ;
		
		gg.start();
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f.start();

	}

}
