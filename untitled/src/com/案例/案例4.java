package com.案例;
                   //复制数组，并输出
public class 案例4 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,5,6};
        int arr2[]= new int[arr1.length];
        copy(arr1,arr2);
         printarry(arr1);
         printarry(arr2);

    }
    public static void printarry(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(i==arr.length -1 ? arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }

    public static void copy(int []arr1,int []arr2){
        for(int i=0;i< arr1.length;i++){
            arr2[i]=arr1[i];
        }
    }
}
