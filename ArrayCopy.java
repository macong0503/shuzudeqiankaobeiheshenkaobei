package com.fs.test;

public class ArrayCopy {
	
	

	public static void main(String[] args) {
		
		//�����ǳ������a,b��������ͬʱָ��ͬһ������
		int a[]={1,2,3,4,5};
		int b[]=a;
		for(int x:b){
			System.out.print(x + "\t");
		}
		System.out.println();
		
		//�������� �ɿ���ȫ��Ҳ�ɿ���ȫ��
		String m[]={"a","b","c"};
		String n[]=new String[3];
		/*
		 * src:��ʾԴ����
		 * srcPos:��ʾԭ�����п�������ʼλ��
		 * dest:Ŀ������
		 * destPos��Ŀ�����鿪ʼ���Ԫ�ص�λ��
		 * length����ʾ�����ĳ���
		 */
		System.arraycopy(m, 1, n, 0,2);
		
		for(String y:n){
			System.out.print(y + "\t");
		}
		System.out.println();
		
	}

}