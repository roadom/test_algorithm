package com.roadom.sort.sorter;

/**
 * 希尔
 * 不稳定：值相同的元素相对顺序可能会被打乱 实质是一种分组插入
 *
 */
public class Shell implements Sorter {

	@Override
	public void sort() {
		int len = arr.length;
		while (true) {
			len = len / 2;
			for (int m = 0; m < len; m++) {
				for (int i = m + len; i < arr.length; i = i + len) {
					int temp = arr[i];
					int n;
					for (n = i - len; n >= 0 && arr[n] > temp; n = n - len) {
						arr[n + len] = arr[n];
					}
					arr[n + len] = temp;
				}
			}
			if (len == 1) {
				break;
			}
		}
	}

}
