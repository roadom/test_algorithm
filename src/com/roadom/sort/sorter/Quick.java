package com.roadom.sort.sorter;

import com.roadom.sort.Util;

/**
 * ¿ìËÙ
 *
 */
public class Quick implements Sorter{

	@Override
	public void sort() {
		doSort(arr, 0, arr.length-1);
	}
	
	private void doSort(int[] arr, int lowIndex, int highIndex){
		int tempLow = lowIndex;
		int tempHigh = highIndex;
		while(true){
			for(;highIndex>lowIndex; highIndex--){
				if(arr[lowIndex]>arr[highIndex]){
					int temp = arr[lowIndex];
					arr[lowIndex] = arr[highIndex];
					arr[highIndex] = temp;
					break;
				}
			}
			for(;lowIndex<highIndex; lowIndex++){
				if(arr[lowIndex]>arr[highIndex]){
					int temp = arr[lowIndex];
					arr[lowIndex] = arr[highIndex];
					arr[highIndex] = temp;
					break;
				}
			}
			if(lowIndex>=highIndex){
				break;
			}
		}
		Util.print(arr);
		doSort(arr, tempLow, highIndex);
		doSort(arr, highIndex, tempHigh);
		
	}

}
