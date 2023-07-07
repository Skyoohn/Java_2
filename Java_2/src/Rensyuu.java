import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

class URLconEx{
	
	public URLconEx() {
		
		String code = null;
		System.out.println("웹주소");
		Scanner sc = new Scanner(System.in);
		String adrress = sc.next();
		
		try {
			URL url = new URL(adrress);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("filee.html",false);
			
			while((code=webData.readLine())!=null) {
				System.out.println(code);
				fw.write(code);
			}
			System.out.println("the end");
			
			fw.close();
			webData.close();
			
		} catch (Exception e) {e.printStackTrace();
		}
	}
	
}

public class Rensyuu {
	public static void main(String[] args) {
		new URLconEx();
				}
		}