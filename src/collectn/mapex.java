package collectn;
import java.util.HashMap;

public class mapex {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Jaya");
		map1.put(2, "Shinde");
		map1.put(7, "QA");
		map1.put(9, "Automation");
		System.out.println("List is: "+map1);
		System.out.println("Value at 2nd: "+map1.get(2));
		for(Integer numb : map1.keySet()) {
			System.out.println("Key is: "+numb);
			System.out.println("Value is: "+map1.get(numb));
		}
		
	}

}
