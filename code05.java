public class Std {
    public static void main(String[] args) {
        int n = 10;
        int i, j, count = 0;

        for (i = 2; count < n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(i + " ");
                count++;
            }
        }
    }