package com.company;

public class Main {

    //utility function used for flipping the array.
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //flip the array.
    //{1,2,3,4,5}=>Flipped array is-
    //{5,4,3,2,1}
    public static void flipArray(int[] arr,int i,int j){
        if(i==j){
            return;
        }
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    //Utility function to find the largest number.
    public static int max(int[] arr,int index){
        int max=Integer.MIN_VALUE;
        int returnIndex=0;
        for (int i=0;i<=index;i++){
           if(max<arr[i]){
               max=arr[i];
               returnIndex=i;
           }
        }
        return returnIndex;
    }


    //Pancake Sorting:
    // for every i from n-1 to 0 do:
    // 1. find the max element in [0,n-1] ==> flip the array from [0,indexOf(maxElement)]
    // 2. flip the array from [0,i]
    public static void pancakeSort(int[] arr){
        for (int i=arr.length-1;i>0;i--){
            int maxIndex =  max(arr,i);
            flipArray(arr,0,maxIndex);
            flipArray(arr,0,i);
        }
    }



    public static void main(String[] args) {

        int[] a={23, 10, 20, 11, 12, 6, 7};
        for (int i:a) System.out.print(i+" ");
        System.out.println();
        pancakeSort(a);
        System.out.println();
        for (int i:a) System.out.print(i+" ");
    }

}
