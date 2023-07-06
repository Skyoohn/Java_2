import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class J230704 {

	public static void main(String[] args) {
		
//		// 파일 읽기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("읽을 파일: ");
//		String src = sc.nextLine();
//		
//		try(Reader in = new FileReader(src)) {
//			int ch;
//			while(true) {
//				ch = in.read();
//				
//				if(ch == -1)
//					break;
//				System.out.println((char)ch);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		// A to Z 뽑는법
//		try (Writer out = new FileWriter("data.txt")){
//			for(char ch = 'A'; ch<='Z'; ch++) {
//				out.write(ch);
//			}
////			out.write('한');
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		 //외워야 함
//        Scanner sc = new Scanner(System.in);
//        System.out.print("대상 파일: ");
//        String src = sc.nextLine();
//
//        System.out.print("사본 이름: ");
//        String dst = sc.nextLine();
//
//        try(BufferedInputStream in = 
//                   new BufferedInputStream(new FileInputStream(src)) ;
//            BufferedOutputStream out = 
//                   new BufferedOutputStream(new FileOutputStream(dst))) {
//
//            int data;
//            int count = 1;
//            while(true) {
//                data = in.read();             
//                if(data == -1)
//                    break;             
//                out.write(data);
//                System.out.println("횟수"+count++);
//            }
//        }
//        catch(IOException e) {
//            e.printStackTrace();       
//        }
//        System.out.println("카피 되었습니다");
		
//		// 파일 복사하기 (속도 빠름)
//		
//		try(InputStream in = new FileInputStream(src);
//				OutputStream out = new FileOutputStream(dst)){
//			byte buf[] = new byte[1024];
//			int len;
//			int count = 1;
//			
//			while(true) {
//				len = in.read(buf);
//				if(len == -1)
//					break;
//				out.write(buf, 0, len);
//				System.out.println("횟수"+count++);	
//			}}

			
//		// 파일복사 (속도 느림)
//			int data;
//			while(true) {
//				data = in.read();
//				if(data == -1)
//					break;
//				out.write(data);
//			}
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
			
//			throws IOException{
//        OutputStream out = new FileOutputStream("data.dat");
//        out.write(7);
//        out.close();
//        
//        
//        InputStream in = new FileInputStream("data.dat");
//        int dat = in.read();
//        in.close();
//
//        System.out.println(dat);  


//		List<Integer> list = new LinkedList<>();
//		Scanner sc = new Scanner(System.in); // 스캐너가 while 안에 있으면 띄어쓰기로 동작 안됨
//		System.out.println("정수 (-1이 입력될 때까지)>>");		
//		
//		while(true) {
//			// 가로 값이 스캐너로 돌아가기 때문
//			
//			try {
//				int num = sc.nextInt(); // 띄어쓰기가 있으면 값이 한개씩 들어감
//				
//				if(num == -1)
//					break;
//				list.add(num);				
//			} catch (Exception e) {
//				System.out.println("잘못된 입력입니다. 다시 넣어 주세요.");
//				sc = new Scanner(System.in);
//				continue;
//			}
//
//		}
//		// 큰값 구하기
//		
//		//다른 방식, 별로 안좋음
////		int max=Integer.MIN_VALUE;
		
		
//		int max = 0;
//		for (int num : list) {
//			if(num > max)
//				max = num;
//		}
//		
//		System.out.println(list);
//		System.out.println("가장 큰 수는: "+max);
		
//		TreeMap<Integer,String> map = new TreeMap<>();
////		HashMap<Integer,String> map = new HashMap<>();
//		
//		//Key-Value 기반 데이터 저장
//		map.put(45, "Brown");
//		map.put(37, "James");
//		map.put(23, "Martin");
//		
//		//Key만 담고 있는 컬렉션 인스턴스 생성
//		Set<Integer> ks = map.keySet();
//		
//		//전체 key 출력(for-each문 기반)
//		for (Integer n : ks) {
//			System.out.print(n.toString()+'\t');
//			System.out.println();
//		}
//		
//		//전체 value 출력 (for-each문 기반)
//		for (Integer n : ks) {
//			System.out.print(map.get(n).toString()+'\t');
//			System.out.println();
//		}
//		
//		//전체 value 출력(반복자 기반)
//		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
//			System.out.print(map.get(itr.next())+'\t');
//		System.out.println();
//		}
		
//		//데이터 탐색
//		System.out.println("23번: " + map.get(23));
//		System.out.println("37번: " + map.get(37));
//		System.out.println("45번: " + map.get(45));
//		System.out.println();
//		
//		//데이터 삭제
//		map.remove(37);
//		
//		//데이터 삭제 확인
//		System.out.println("37번: "+map.get(37));
		
//		Deque<String> deq = new ArrayDeque<>();
//		
//		//앞으로 넣고
//		deq.offerFirst("1.Box");
//		deq.offerFirst("2.Toy");
//		deq.offerFirst("3.Robot");
//		
//		//앞에서 꺼내기
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
//		System.out.println(deq.pollFirst());
	
	}}