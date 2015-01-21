package com.roadom.sort;

import com.roadom.sort.sorter.Quick;
import com.roadom.sort.sorter.Sorter;

public class Main {
	
	public static void main(String[] args) {
		Util.print(Sorter.arr);
		
//		Sorter sorter = new Insertion();
//		Sorter sorter = new Shell();
//		Sorter sorter = new Selection();
//		Sorter sorter = new Bubble();
		Sorter sorter = new Quick();
		
		sorter.sort();
		
		Util.print(Sorter.arr);
	}
}
