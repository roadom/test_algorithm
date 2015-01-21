package com.roadom.sort.sorter;

/**
 * 选择
 * 每趟都在未排序序列中选择最小的一个扔到第一位
 */
public class Selection implements Sorter {

	@Override
	public void sort() {
		
		for(int n=0; n<arr.length; n++){
			int min = arr[n];
			for(int m=n+1; m<arr.length; m++){
				if(arr[m]<min){
					int temp = min;
					min = arr[m];
					arr[m] = temp;
				}
			}
			if(arr[n]>min){
				arr[n] = min;
			}
		}
		
	}
}
