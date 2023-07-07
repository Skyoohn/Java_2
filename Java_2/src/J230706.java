import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//class InetAdressEx {
//   
//   Scanner scanner;
//   
//   public InetAdressEx() {
//      System.out.println("Host 이름을 입력 하세요.");
//      
//      scanner = new Scanner(System.in);
//      try {
//         InetAddress inetAddress = InetAddress.getByName(scanner.next());
//         
//         System.out.println("Computer NAME : " + inetAddress.getHostName());
//         System.out.println("Computer IP : " + inetAddress.getHostAddress());
//         
//      } catch (Exception e) {
//         System.out.println(e.getMessage());
//      }
//   }
//   
//}

//class URLConEx {
//
//   public URLConEx() {
//      
//      String code = null;
//      System.out.println("웹 주소를 입력 하세요.");
//      Scanner scanner = new Scanner(System.in);
//      String address = scanner.next();
//      
//      try {
//         URL url = new URL(address);
//         URLConnection con = url.openConnection();
//         BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
//         FileWriter fw = new FileWriter("file.html", false);
//         
//         while ((code = webData.readLine()) != null) {
//            System.out.println(code);
//            fw.write(code);
//         }
//         System.out.println("The End");
//         
//         fw.close();
//         webData.close();
//         
//      } catch (Exception e) {
//         e.printStackTrace();
//      } 
//   }
//}
public class J230706 {

	public static void main(String[] args) {
		
		
//		new URLConEx();
		
		
//		new InetAdressEx();
	}
}
