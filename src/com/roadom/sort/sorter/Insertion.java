package com.roadom.sort.sorter;

/**
 * ����
 * �����з�Ϊ���ң����Ϊ�����Ҳ�Ϊ����ÿһ�˴�������ȡ����һ�������뵽��������б��С�
 * �ȶ������Ԫ�ز�����
 * ʱ�临�Ӷȣ�O(n^2)
 */
public class Insertion implements Sorter{

	@Override
	public void sort() {
		for(int m=1; m<arr.length; m++){	//�Ҳ�
			for(int n=0; n<m; n++){			//���
				if(arr[m]<arr[n]){		//�����׸������Աȣ����뵽���ʵ�λ��
					int temp = arr[m];
					arr[m] = arr[n];
					arr[n] = temp;
				}
			}
		}
	}
	
}
