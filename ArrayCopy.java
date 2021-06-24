package com.fs.test;

public class ArrayCopy {
	
	

	public static void main(String[] args) {
		
		//数组的浅拷贝：a,b两个引用同时指向同一个数组
		int a[]={1,2,3,4,5};
		int b[]=a;
		for(int x:b){
			System.out.print(x + "\t");
		}
		System.out.println();
		
		//数组的深拷贝 可拷贝全部也可拷贝全部
		String m[]={"a","b","c"};
		String n[]=new String[3];
		/*
		 * src:表示源数组
		 * srcPos:表示原数组中拷贝的起始位置
		 * dest:目标数组
		 * destPos：目的数组开始存放元素的位置
		 * length：表示拷贝的长度
		 */
		System.arraycopy(m, 1, n, 0,2);
		
		for(String y:n){
			System.out.print(y + "\t");
		}
		System.out.println();
		
	}

}