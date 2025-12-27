package final_denemeleri;

public class Finaller extends deneme{

	public static void main(String[] args) {
		
		deneme d = new deneme();
		
		System.out.println(a);
		System.out.println(d.a);

		
		System.out.println("program basladi");
		try {
			int a = 2/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		System.out.println("program bitti");
		
		
		
		new Javacalismanotlari().new Z();
		
		
		
	}
	public class Javacalismanotlari {
	    class X {
	        Y b = new Y();

	        X() {
	            System.out.print("X");
	        }
	    }
	    class Y {
	        Y() {
	            System.out.print("Y");
	        }
	    }
	    class Z extends X {
	        Y y = new Y();

	        Z() {
	            System.out.print("Z");
	        }
	    }

}
