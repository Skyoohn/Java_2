public class test {

	public static void main(String[] args) {
	       for (int i = 0; i < 10; i++) {
	            System.out.print("BLOCK" + i + " ");

	            for (int j = 0; j < 10; j++) {
	                System.out.print((10 * i)+j + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("END");
	    }
	}