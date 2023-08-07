import java.util.Scanner;

public class Rsp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = {"가위","주먹","보"};
		
		for(int i=0;i<10;i++) {
			int num= (int)(Math.random()*3);
			System.out.println("가위,바위,보 중 하나를 입력하세요");
			String b=sc.next();
			System.out.println();
			if(b.equals("가위")) {
				if(num==0) {
					System.out.println("가위 : 유저");
					System.out.println("바위");
					System.out.println("졌습니다.");
				}
				if(num==1) {
					System.out.println("가위 : 유저");
					System.out.println("보");
					System.out.println("이겼습니다.");
				}
				if(num==2) {
					System.out.println("가위 : 유저");
					System.out.println("가위");
					System.out.println("비겼습니다.");
				}
				System.out.println("계속 하시겠습니까? Y/N");
				System.out.println();
				String choice = sc.next();
				
		         if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
			            continue;
			         else
			            break;
			      }
			
			if(b.equals("바위")) {
				if(num==0) {
					System.out.println("바위 : 유저");
					System.out.println("바위");
					System.out.println("비겼습니다.");
				}
				if(num==1) {
					System.out.println("바위 : 유저");
					System.out.println("보");
					System.out.println("졌습니다.");
				}
				if(num==2) {
					System.out.println("바위 : 유저");
					System.out.println("가위");
					System.out.println("이겼습니다.");
				}
				System.out.println("계속 하시겠습니까? Y/N");
				System.out.println();
				String choice = sc.next();
				
		         if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
			            continue;
			         else
			            break;
			      
			}
			if(b.equals("보")) {
				if(num==0) {
					System.out.println("보 : 유저");
					System.out.println("바위");
					System.out.println("이겼습니다.");
				}
				if(num==1) {
					System.out.println("보 : 유저");
					System.out.println("보");
					System.out.println("비겼습니다.");
				}
				if(num==2) {
					System.out.println("보 : 유저");
					System.out.println("가위");
					System.out.println("졌습니다.");
				}
				System.out.println("계속 하시겠습니까? Y/N");
				System.out.println();
				String choice = sc.next();
				
		         if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
			            continue;
			         else
			            break;
			      
			}
		}
	}
}