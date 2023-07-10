import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

//class Person1{
//private String name;
//private int age;
//public Person1(String n, int a) {
//	name = n;
//	age = a;
//}
//@Override
//public int hashCode() {
//	return age;
//}
//@Override
//public boolean equals(Object obj) {
//	if(age == ((Person1)obj).age)
//	return true;
//	else
//		return false;
//}
//@Override
//public String toString() {
//	return String.valueOf(name);
//}
//} 만든거

//class Num{
//	private int num;
//	public Num(int n) {num = n;}
//	
//	@Override
//	public String toString() {
//		return String.valueOf(num);
//	}
//	@Override
//	public int hashCode() {
//		System.out.println("해시코드 호출");
//		return num % 3; // num 도 되는데?
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("이퀄즈 호출");
//		if(num == ((Num)obj).num)
//		return true;
//		else
//			return false;
//	}
//}

//class Person{
//	   private String name;
//	   private int age;
//	   
//	   public Person(String name , int age) {
//	      this.name = name;
//	      this.age = age;      
//	   }
//	   
//	   @Override
//	   public int hashCode() {      
//	      return age;
//	   }
//	   
//	   
//	   @Override
//	   public boolean equals(Object obj) {
//	      
//	      Person person = (Person) obj;
//	      
//	      if( (this.name.equals(person.name)) && (this.age == person.age))
//	         return true;
//	      
//	      
//	      return false;
//	   }
//	   
//	   @Override
//	   public String toString() {
//	      return name + "(" + age + "세)";
//	   }
//	}

//class Num {
//	int num;
//	
//	Num(int num) {
//		this.num = num;
//	}
//	
//	@Override
//	public String toString() {
//		return String.valueOf(num);
//	}
//	
//	@Override
//	public int hashCode() {
//		return num % 2;  //출력 순서를 맞추려면 이렇게 변경하면 된다는것까지 알았는데 정확히 왜인지는 모르겠다.
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(this.num == ((Num)obj).num)
//			return true;
//		else 
//			return false;
//	}
//}

public class J230703 {

	public static void main(String[] args) {
//	Queue<String> que = new LinkedList<>();
//	que.offer("box");
//	que.offer("Toy");
//	que.offer("Robot");
//	
//	//무엇이 다음에 나올지 확인
//	System.out.println("next:"+que.peek());
//	
//	//첫번째,두번째 인스턴스 꺼내기
//	System.out.println(que.poll());	
//	System.out.println(que.poll());
//	
//	//무엇이 다음에 나올지 확인
//	System.out.println("next"+que.peek());
//	
//	//마지막 인스턴스 꺼내기
//	System.out.println(que.poll());
//	
//		TreeSet<Integer> tree = new TreeSet<>();
//		tree.add(3); tree.add(1);
//		tree.add(2); tree.add(4);
//		System.out.println("인스턴스 수:"+tree.size());
//		
//		//for-each문에 의한 반복
//		for (Integer n : tree) {
//			System.out.print(n.toString()+'\t');
//			System.out.println();
//		}
//		//Iterator 반복자에 의한 반복
//		for(Iterator<Integer>itr = tree.iterator(); itr.hasNext();)
//				System.out.print(itr.next().toString()+'\t');
//				System.out.println();
	
	
	
//		HashSet<Num> set = new HashSet<>();
//		set.add(new Num(7799));
//		set.add(new Num(9955));
//		set.add(new Num(7799));
//
//		System.out.println("인스턴스 수: " + set.size());
//
//		for (Num n : set)
//			System.out.print(n.toString() + '\t');
//
//		System.out.println();
		
		
//		Set<Integer> lotto = new HashSet<>();
//		
//		while(lotto.size() != 6) {   // lotto의 크기가 6과 다를때까지 반복된다는 뜻
//		int num = (int)(Math.random()*45)+1;	
//		lotto.add(num);
//		
//		}
//		System.out.println(lotto);	
		
		
//	      HashSet<Person> hSet = new HashSet<Person>();
//	      hSet.add(new Person("LEE", 10));
//	      hSet.add(new Person("LEE", 10));
//	      hSet.add(new Person("PARK", 35));
//	      hSet.add(new Person("PARK", 35));
//
//	      System.out.println("저장된 데이터 수: " + hSet.size());
//	      System.out.println(hSet);

//		//동등비교
//		Set<Num> set = new HashSet<>();
//		
//		set.add(new Num(3));
//		set.add(new Num(3));
//		
//		System.out.println(set.size());

//		Set<String> set = new HashSet<>();
//		set.add("Toy"); set.add("Box");
//		set.add("Robot"); set.add("Box");
//		System.out.println("인스턴스 수 :"+set.size());
//		
//		//반복자를 이용한 전체 출력
//		for(Iterator<String>itr = set.iterator(); itr.hasNext();)
//			System.out.print(itr.next()+'\t');
//		System.out.println();
//		
//		//for-each문을 이용한 전체 출력
//		for (String s : set)
//			System.out.print(s + '\t');
//		System.out.println();

//		LinkedList<Integer>list = new LinkedList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		int n;
//		for(Iterator<Integer> itr = list.listIterator();itr.hasNext();) {
//			n = itr.next();
//			System.out.print(n + "\t");
//		}
//		System.out.println();
		
//		ArrayList<Circle2> circleList = new ArrayList<>();
//		
//		for (int i = 1; i <= 10; i++) {
//			circleList.add(new Circle2(i));
//		}
//		double sum = 0;
//		for (Circle2 circle2 : circleList) {
//			sum += circle2.getArea();
//			System.out.println(sum);
//		}
		
//		ArrayList<Circle2> circleList = new ArrayList<>();
//		
//		circleList.add(new Circle2(10));
//		circleList.add(new Circle2(20));
//		circleList.add(new Circle2(30));
//		
//		double sum = 0;
//		for (Circle2 circle2 : circleList) {
//			sum += circle2.getArea();
//			System.out.println(sum);
//		}

//		List<String> list = new ArrayList<>();
//		
//			list.add("Spring");
//			list.add("summer");
//			list.add("fall");
//			list.add("winter");
//			
//			int sum = 0;
//			for(int i =0; i <= list.size();i++) {
//				String str = list.get(i);
//				sum = sum+str.length();
//				System.out.println(sum);
//			}
//			
////			int count = 0; 다른 방법
////			for (String word : list) {
////            count += word.length();
////		        }
////	  System.out.println("문자 수: " + count);

//		List<Integer> numlist = new ArrayList<>();
//		
//		for(int i = 1; i <=10; i++) {
//		numlist.add(i);
//		}
//		
//		int sum = 0;
//		for (Integer num : numlist) {
//			sum = sum + num;
//			System.out.println(sum);
//		} 
	// 1부터 10까지 합구하기
	
	}
}
