package javaTraining;

import java.util.Scanner;

public class baekjoon2750 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int[] arr=new int[num];
		int tmp=0;
		for(int i=0;i<num;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int m=0;m<arr.length-1;m++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
			}
		}}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		s.close();
	}

}
