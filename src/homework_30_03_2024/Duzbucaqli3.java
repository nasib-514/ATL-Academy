package homework_30_03_2024;

import java.util.Scanner;

public class Duzbucaqli3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
