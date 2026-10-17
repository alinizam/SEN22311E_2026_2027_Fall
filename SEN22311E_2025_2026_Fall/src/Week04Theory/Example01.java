/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example01 {
    public static void main(String[] args) {
        int A[]={1, 2, 3, 5, 6, 1, 1, 1,9};
        System.out.println(getTotal(A, 0, A.length-1)); 
   }
    static int getTotal(int A[],int start,int end){
        if(start+1==end){
            return A[start]+A[end];
        }
        if(start==end){
            return A[start];
        }
        if (A.length==0){
           return 0;
       } 
       //(2)conquer            //(1) divide       
       int leftSum=getTotal(A, start, (start+end)/2);
       int rigthSum=getTotal(A, (start+end)/2+1, end);
       //(3)combine
       return leftSum+rigthSum;
    }
}
