package collectn;
import java.util.ArrayList;
import java.util.Collections;


public class arraylistex {
	public static void main(String[] args) {
		
		//This array is limited to data type and given size.
		String[] arr = {"abc", "xyz", "dfg"};
		
		//Collection>>List>>ArrayList
		//list1 is object, ArrayList is object type/class which is imported. ,String. limited to string data.
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Jaya");
		list1.add("Shinde");
		list1.add("Automate");
		System.out.println("List is: "+ list1);
		System.out.println("Size is: "+list1.size());
		list1.remove(1);
		System.out.println("New list is: "+list1);
		System.out.println(list1.get(1));
		//set function replaces data, and add function adds data.
		list1.set(0, "QA");
		System.out.println("Modified list is: "+list1);
		//Collections is java defined parent class and sort as function, sorts in ascending order.
		Collections.sort(list1);
		System.out.println(list1);
		
		for(int index=0; index<list1.size();index++) {
			System.out.println(index);
			System.out.println(list1.get(index));
			if(list1.get(index).equals("Automate")){
				System.out.println("Match found");
				break;
			}
		}
		
//		for(String name : list1) {
//			System.out.println(name);
//		}
		}
	}

