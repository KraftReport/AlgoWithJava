package com.bubblesort.demo;

public class BubbleDemo {

	  public static void main(String[] args) {
		
		  
		  int arr[] = {9,3,4,2,7,3,1};
		  
		  bubblesort(arr);
		  
		  for(int i :arr) {
			  System.err.print(i+ ".");
		  }
		  
		    
	}
	  
	  public static void bubblesort(int arr[]) {
		  
		  for(int i=0; i<arr.length-1; i++) {
			  for(int j=0; j<arr.length-i-1; j++) {
				  if(arr[j]>arr[j+1]) {
					  int temp = arr[j+1];
					  arr[j+1] = arr[j];
					  arr[j]= temp;
				  }
			  }
		  }
	  }
}
