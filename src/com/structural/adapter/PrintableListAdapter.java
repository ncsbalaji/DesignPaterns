package com.structural.adapter;

import java.util.ArrayList;

public class PrintableListAdapter implements PrintableList {

	@Override
	public void printList(ArrayList<String> list) {
		// TODO Auto-generated method stub
		StringBuffer listString = new StringBuffer();
		for(String name : list){
			listString.append(name+"\t");
		}
		PrintString printString = new PrintString();
		printString.print(listString.toString());
	}

}
