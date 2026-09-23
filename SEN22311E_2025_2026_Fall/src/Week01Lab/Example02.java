package Week01Lab;

public class Example02 {
    static void main() {
        int A[]={1,2,3,4, 5,6,8,10};
        int B[]={3,4,5,7,10};
        int i=0,j=0;
        while(i<A.length && j<B.length)
            if(A[i]==B[j]){
                System.out.println(A[i]);
                i++;
                j++;
            }else if(A[i]<B[j]){
                i++;
            }else{
                j++;
            }

    }
}
