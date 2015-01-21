package com.roadom.sort.sorter;

/**
 * ϣ��
 * ���ȶ���ֵ��ͬ��Ԫ�����˳����ܻᱻ���� ʵ����һ�ַ������
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
