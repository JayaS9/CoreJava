package collectn;

import java.util.HashMap;

public class wordOccurance {
	public static void main(String[] args) {
		String str1 = "Clean World Green World Love World";
		
		String[] words = str1.split(" ");
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		for(String singleword : words) {
			if(map1.get(singleword)==null) {
				map1.put(singleword, 1);
			}else {
				map1.put(singleword, map1.get(singleword)+1);
			}
		}
		System.out.println(map1);
	}

}
