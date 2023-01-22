package com.exam.app;

import java.util.Arrays;

public class QuickSort {
	
	
	public static void quick(int arr[],int left,int right) {
		if(left>=right)
			return;
		
		int i=0;int j=right; int pivot;
		while(i<j) {
			pivot=arr[left];
		while(arr[i]<=pivot&&i<right)
		{
			i++;    //Greater no is identify from left partition...(greater than pivot).......
		}
		while(arr[j]>pivot) {
			j--;  //smaller no is identify from right partition (smaller than pivot).....
		}
		if(i<j) {
			swap(arr,i,j);//swapping of smaller no(from right partition to left partition)
			              //to ->left side.. and swapping of larger elemnt th
		}
		}
		swap(arr,j,left);//swap after stopping of loop as...pivot->j (i<j)
		quick(arr, left,j-1);//by j-- by 1 and start revolving upto left side (of)array and search element
		
		quick(arr,j+1,right);//by  adding j+1 means search array at right most side of array
	
			}
public static void swap(int arr[],int a,int b) {
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
}
	
	public static void main(String[] args) {
		QuickSort a=new QuickSort();
		int arr[]= {10,8,6,12,6,15,3,9,5,20};
	
		System.out.println("before swapping"+Arrays.toString(arr));
		quick(arr,0,arr.length-1);
		System.out.println("After swapping.."+Arrays.toString(arr));
	}

}

