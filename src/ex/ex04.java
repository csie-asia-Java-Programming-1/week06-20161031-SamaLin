﻿package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String m=scn.nextLine();
		String arr[]=m.split(" ");
		square(arr);
		
	}
	public static void square(String arr[])
	{
		double v1=0;
		for(int i=0;i<arr.length;i++)
		{
			v1=Integer.valueOf(arr[i]);
			v1=(double)Math.pow(v1,2);
			System.out.println(Math.round(v1));
		}
	}

}