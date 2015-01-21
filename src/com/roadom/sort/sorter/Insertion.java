package com.roadom.sort.sorter;

/**
 * 插入
 * 将序列分为左右，左侧为有序，右侧为无序。每一趟从无序中取出第一个，插入到左侧有序列表中。
 * 稳定：相等元素不互换
 * 时间复杂度：O(n^2)
 */
public class Insertion implements Sorter{

	@Override
	public void sort() {
		for(int m=1; m<arr.length; m++){	//右侧
			for(int n=0; n<m; n++){			//左侧
				if(arr[m]<arr[n]){		//将中首个与左侧对比，插入到合适的位置
					int temp = arr[m];
					arr[m] = arr[n];
					arr[n] = temp;
				}
			}
		}
	}
	
}
