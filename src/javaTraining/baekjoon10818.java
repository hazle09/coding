package javaTraining;

import java.util.Scanner;

public class baekjoon10818 {
	
	
	 public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int max=0;
		int min=0;
		
		max=-1000000;
		min=1000000;
		
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] =s.nextInt();
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
	}
	
		System.out.println(min+" "+max);
		
	
	/*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[];
		int number = scanner.nextInt();
		int min = 0;
		int max = 0;
		
		max = -1000000;
		min = 1000000;
		
		arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();	
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		System.out.print(min + " " + max);
		
		*/
	}
}
