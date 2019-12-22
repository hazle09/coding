package javaTraining;

import java.util.Scanner;

public class baekjoon10818 {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int tmp=0;
		
		int[]arr1=new int[num];
		
		for(int i=0;i<num;i++) {
		arr1[i]=s.nextInt();
	}
		
		for(int k=num-1;k>0;k--) {
		for(int j=0;j<num-1;j++) {
			if(arr1[j]>arr1[j+1]) {
				tmp=arr1[j+1];
				arr1[j+1]=arr1[j];
				arr1[j]=tmp;
			}
		}}
		
		
		System.out.println(arr1[0]+" "+arr1[num-1]);
	}
}
