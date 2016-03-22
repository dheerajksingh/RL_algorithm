package com.search;

public class BinarySearch {

    int lwrIndex,upprIndex;
    int arr[];

    public BinarySearch(int size){
        arr = new int[size];
    }
   
    public void insert(int elmt){
        arr[upprIndex++]=elmt;
    }
   
    public boolean searchNum(int elmn, int lwrIndex , int upprIndex){
        int midindex = (lwrIndex+upprIndex)/2;
       
        if(elmn<arr[midindex]){
            upprIndex =midindex-1;
        }else if(elmn>arr[midindex]){
            lwrIndex=midindex+1;
        }else{
            return true;
        }
       
        if (lwrIndex>upprIndex){
           
            return false;
        }
       
        return searchNum(elmn , lwrIndex , upprIndex);
    }
   
    public static void main(String args[]){
        BinarySearch binarySearch =new BinarySearch(10);
       
        for(int j=0;j<10;j++){
        binarySearch.insert(j);
        }
       
        System.out.println(binarySearch.searchNum(11,0,9));
       
       
    }

}