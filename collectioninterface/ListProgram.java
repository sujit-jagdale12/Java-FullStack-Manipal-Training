package com.collectioninterface;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void demoList() {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(12);
		list.add(3);
		list.add(8);
		
		list.remove(3);
		
		System.out.println(list);
	}
	public static void main(String[] args) {
		demoList();
	}
}
