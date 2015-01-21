package com.roadom.sort.sorter;


/**
 * 冒泡
 * 交换相邻的元素
 * 每趟都将冒出一个最大元素至最右 
 */
public class Bubble implements Sorter{

	@Override
	public void sort() {
		for(int n=0; n<arr.length; n++){
			boolean isAllRight = true;
			for(int m=0; m<arr.length-n; m++){
				if(m!=arr.length-1){
					if(arr[m]>arr[m+1]){
						int temp = arr[m];
						arr[m] = arr[m+1];
						arr[m+1] = temp;
						isAllRight = false;
					}
				}
			}
			if(isAllRight){
				break;
			}
		}
	}

}
