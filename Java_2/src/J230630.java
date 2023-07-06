import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//class Apple {
//    public String toString() {
//        return "I am an apple.";
//    }    
//}
//
//class Orange {
//    public String toString() {
//        return "I am an orange.";
//    }
//}
//
//class Box<Orange>{
//	private Orange ob;
//	
//	public void set(Orange o) {
//		ob = o;
//	}
//	public Orange get() {
//		return ob;
//	}
//}
//
//
//class Box1<Apple>{
//	private Apple ob;
//	
//	public void set(Apple o) {
//		ob = o;
//	}
//	public Apple get() {
//		return ob;
//	}
//}

//제네릭 문법 = 데이터 타입을 파라미터화 시킴
//class DBox<L,R>{
//	private L left;
//	private R right;
//	
//	public void set(L o, R r) {
//		left = o;
//		right = r;
//	}
//
//	@Override
//	public String toString() {
//		return left + " & " + right; // 아무것도 안넣으면 null&null
//	} // Orange(객체)를 넣으면 toString을 거쳐서 문자열로 맞춤
//	
//}

//class Box<T extends Number>{
//	private T ob;
//	
//	public void set(T o) {
//		ob = o;
//	}
//	public T get() {
//		return ob;
//	}


//class BoxFactory{
//	public static <T> Box<T> makeBox(T o){
//		Box<T> box = new Box<T>();	
//		box.set(o);
//		return box;
//		
//	}
//}

//public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {      
//    T temp;
//    
//    temp = box1.get();
//    box1.set(box2.get());
//    box2.set(temp);
// }
//}

	//스왑의 기본
//	int a = 10;
//	int b = 20;
//	
//	int temp;
//	
//	temp = a;
//	a = b;
//	b = temp;

//class MyLinkedList{
//	int num;
//	MyLinkedList myLinkedList;
//	
//}

public class J230630 {


	public static void main(String[] args) {
//		MyLinkedList my1 = new MyLinkedList();
//		my1.num = 10;
//
//		MyLinkedList my2 = new MyLinkedList();
//		my1.num = 11;
//		
//		my1.myLinkedList = my2;		
//		my2.myLinkedList = new MyLinkedList();
		
//		List<String> list = new ArrayList<>();
//		List<String> list = new LinkedList<>();
//		
//		list.add("Toy");
//		list.add("Box");
//		list.add("Robot");
//		
//		//인스턴스 참조
//		for(int i = 0; i < list.size();i++) 
//			System.out.print(list.get(i)+'\t');
//		
//		//아래와 위는 동일
//		for (String str : list) {
//			System.out.print(str + '\t');}
//		
//		System.out.println();
//		
//
//		
//		list.remove(0);
//		
//		for(int i = 0; i < list.size();i++)
//			System.out.print(list.get(i)+'\t');
//		System.out.println();
		
	

//	       Box<Integer> box1 = new Box<>();
//	       box1.set(99);   //오토 박싱 
//
//	       Box<Integer> box2 = new Box<>();
//	       box2.set(55);   //오토 박싱 
//
//	       System.out.println(box1.get() + " & " + box2.get());
//	       swapBox(box1, box2); // 제네릭 메서드로 만들기
//	       System.out.println(box1.get() + " & " + box2.get());
//		
		
//		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
//		System.out.println(sBox.get());
//		
//		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
//		System.out.println(dBox.get());
		
		
		
//		Box<Integer> iBox = new Box<>();
//		iBox.set(24);
//		
//		Box<Double> dBox = new Box<>();
//		dBox.set(5.97);
//		
//		System.out.println(iBox.get());
//		System.out.println(dBox.get());
		
//		DBox<String, Integer> box = new DBox<String, Integer>();
//		box.set("Apple", 25);
//		System.out.println(box);
		
		
//		Box1<Apple> aBox = new Box1<Apple>();
//		Box<Orange> oBox = new Box<Orange>();
//		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//		
//		Apple ap = aBox.get();
//		Orange og = oBox.get();
//		
//		System.out.println(ap);
//		System.out.println(og);

	}

}
