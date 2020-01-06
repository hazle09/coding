package javaTraining;

import java.util.Scanner;

public class baekjoon10871 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int x=s.nextInt();
		
		int arr[]=new int[n];
		
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int k=0;k<arr.length;k++) {
			if(arr[k]<x) {
			System.out.print(arr[k]+" ");
		}
		}
		
		s.close();
	}

}
