package demo;

import java.util.ArrayList;

class Test {
	private static boolean flag;
	public static void main(String[] args) {
		StringBuilder strb = new StringBuilder();
		System.out.println("Capacity: " + strb.capacity());
		strb = strb.append("abc + xyz");
		System.out.println(strb.toString());
		System.out.println(strb);
		System.out.println("Length: " + strb.length());

		//
		if (flag)
			System.out.println("true");
		else
			System.out.println("false");

		//
		String[] str = { "", "", "" };
		str[0] += "*";
		System.out.println(str[0]);
		
		//
		ArrayList<Object> list = new  ArrayList<>();
		if(list.isEmpty())
			System.out.println("NULL");
		else
			System.out.println("Not NULL");
		
		//
		boolean flags = false;
		if(!flags)
			flags = true;
		if(flags) {
			System.out.println("True");
			flags = true;
		}
		if(flags)
			System.out.println("Done!");
	}
}