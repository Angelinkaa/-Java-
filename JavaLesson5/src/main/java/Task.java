public class Task {

    public static void main(String[] args) {
        System.out.println(exponentiation(4, -2));
        System.out.println(exponentiation(3, 4));
        System.out.println(exponentiation(3, 0));
        System.out.println(exponentiation(5, -3));
        System.out.println(exponentiation(5678979, 25));
        System.out.println(exponentiation(3, 1));
        System.out.println(exponentiation(0, -5));
    }

    private static double exponentiation(double digit, int rank) {
        if (digit == 0) {
            if (rank > 0)
                return 0;
            else
                throw new IllegalArgumentException("Invalid rank " + rank + " for digit = 0");
        }
        if (rank < 0) {
            return 1 / (digit * exponentiation(digit, -rank - 1));
        }
        else if (rank > 0) {
            return digit * exponentiation(digit, rank - 1);
        }
        else {
            return 1;
        }
    }
}
