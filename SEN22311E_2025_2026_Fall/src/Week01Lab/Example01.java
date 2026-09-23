package Week01Lab;

public class Example01 {
    static void main() {
        int A[]={1,2, 5,6,3,8};
        int B[]={7,5,3};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length ; j++) {
                if (A[i]==B[j]){
                    System.out.println(A[i]);
                    break;
                }
            }
        }
    }
}
