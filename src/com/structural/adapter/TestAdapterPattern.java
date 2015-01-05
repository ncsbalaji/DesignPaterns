package com.structural.adapter;

import java.util.ArrayList;

public class TestAdapterPattern {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		new PrintableListAdapter().printList(list);
	}

}
