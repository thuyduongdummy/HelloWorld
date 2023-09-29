package CodingChalllenge5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] ex3 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter value: ");
            ex3[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += ex3[i];
            System.out.println(sum);
        }
        double mean = sum/ ex3.length;
            System.out.println("mean: ");
        }
    }

