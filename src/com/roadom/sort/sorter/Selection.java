package com.roadom.sort.sorter;

/**
 * ѡ��
 * ÿ�˶���δ����������ѡ����С��һ���ӵ���һλ
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
