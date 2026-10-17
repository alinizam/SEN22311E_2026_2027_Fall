package Week04Lab;

public class Example01 {
    static void main() {
        int matrix[][] = {{1, 7, 8}, {5, 6, 8}, {6, 9, 12}};
        int key = 11;
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix, i, key)) {
                found = true;
            }
        }
        System.out.println(found);
    }

    static boolean binarySearch(int matrix[][], int column, int key) {
        int low = 0;
        int high = matrix.length - 1;
        while (low < high) {
            int mid = (high - low) / 2;
            if (matrix[mid][column] == key) {
                return true;
            } else if (matrix[mid][column] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
    }
}
