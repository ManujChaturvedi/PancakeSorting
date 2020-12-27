package com.company;

public class Main {

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

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
