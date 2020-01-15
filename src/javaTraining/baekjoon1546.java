package javaTraining;

import java.util.Scanner;

public class baekjoon1546 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int[] arr=new int[num];
		double[] arr2=new double[num];
		
		int max=0;
		int sum=0;
		double average=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		max=Math.max(max, arr[i]);
		sum+=arr[i];
		}
			
		average=100.0*sum/max/num;
		System.out.printf("%.2f",average);
sc.close();
	}}
