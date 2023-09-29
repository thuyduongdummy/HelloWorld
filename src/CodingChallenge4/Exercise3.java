package CodingChallenge4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter your password: ");
            password = scanner.next();
            }
        while(!password.equals("shark50"));
        System.out.print("ACCESS APPROVED!");
        }
    }

