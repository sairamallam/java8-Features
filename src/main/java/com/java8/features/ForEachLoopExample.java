package com.java8.features;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopExample {
	
	
	static List<Integer> li=new ArrayList<>();
	public  void sampleForEach() {
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.forEach((n)->{System.out.println("n= "+n);});
		
	}
	
	public static void main(String args[]) {
		
		ForEachLoopExample few=new ForEachLoopExample();
		few.sampleForEach();
		
	}

}
