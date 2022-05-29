package HomeWork;

import java.util.Scanner;

public class AverageRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int sum = 0;
        int b = sc.nextInt();
        for (int i = 0; i <= b; i++) {
            a = (int)(Math.random() * (100));
            sum = sum + a;
        }
        System.out.println(sum/b);
    }
}
