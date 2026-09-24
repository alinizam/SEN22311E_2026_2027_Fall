package Week01Theory;

public class Example02 {
    static void main() {
        // 10 1010
        int i = 10;
        int count=0;
        while (i>0){
            count++;
           // i=i/2;
            i=i>>1;
        }
        System.out.println(count);
    }
}
