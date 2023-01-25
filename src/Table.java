import java.util.Scanner;

public class Table {
    public static void main(String[] args) {


        //Enter the number first based on loop has to run:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");

        int x = sc.nextInt();

        if (x >= 7) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d= %d", x, i, x * i).println();

            }
        } else {
            for (int j = 1; j <= 15; j++)

                System.out.printf("%d * %d= %d", x, j, x * j).println();

        }
    }

}


