package com.test;

public class excptn {
	public static void main(String[] args) {
		int[] arry = {4,8,2};
		
		int num = 10;
		
		
	
		try {
			
			int res=num/0;
			System.out.println(arry[5]);
	}catch(Exception e ) {
		e.printStackTrace();
		System.out.println("After catch");
	}finally {
		System.out.println("Done");
	}
	}

}
