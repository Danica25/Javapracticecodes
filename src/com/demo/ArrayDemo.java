package com.demo;

public class ArrayDemo {
    //jagged arrays
    public static void main(String[] args){
        int d[][]={
                {1,2,3,4},
        {3,4},
        {5,6,7,8,9},
        };
int a[]={0,9,8,55,2,45};
 for(int k: a){//enhanced loop for 1d array
     System.out.print(" "+k);
 }
 System.out.println(" ");
 for(int k[] : d){//enhanced loop for jagged and 2d arrays
     for(int l:k){
         System.out.print(" "+l);
     }
     System.out.println();
 }
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(" "+d[i][j]);
            }
            System.out.println(" ");
        }
    }
}
