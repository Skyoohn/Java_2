import java.util.HashSet;
import java.util.Set;

public class Rensyuu {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != 6) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
		
		}}