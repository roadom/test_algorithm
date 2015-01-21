package com.roadom.sort;

import org.junit.Test;




public class Util {
	
	public static int[] getArr(int num){
		int[] result = new int[num];
		
		for(int i=0; i<num; i++){
			result[i] = (int) Math.round(Math.random()*num*5);
		}
		return result;
	}
	
	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(", ");	
			}else{
				System.out.println();
			}
		}
	}
	
	
	@Test
	public void test() throws Exception {
		int[] arr = getArr(10);
		print(arr);
	}
}
