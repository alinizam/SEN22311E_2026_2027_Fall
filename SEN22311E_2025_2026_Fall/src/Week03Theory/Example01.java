package Week03Theory;

public class Example01 {
    static int multiply(int a, int b) {
        int result = 0;

        while (b > 0) {

            // If b is odd, add a to result
            if ((b & 1)!=0) {
                result += a;
                System.out.println(result+"+"+a +" "+ b);
            }
            // a--> m + b--> n = m*n = n2

            // Double a and halve b
            a <<= 1;
            b >>= 1;
        }

        return result;
    }

    static  void main() {

        int a = 2, b = 5;
        System.out.println(multiply(4,19));

    }

}
