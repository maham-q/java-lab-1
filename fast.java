public class fast {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j == 1 || (i == n / 2 + 1 && j <= n / 2 + 1) || (i == 1 && j <= n / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == (n + 1) / 2) {
                    System.out.print("*");
                } else if (j == 2 && i > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n || i == (n + 1) / 2) && j != n) {
                    System.out.print("*");
                } else if (i < (n + 1) / 2 && j == 1) {
                    System.out.print("*");
                } else if (i > (n + 1) / 2 && j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == (n + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
