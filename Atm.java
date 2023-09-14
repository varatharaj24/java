package atm;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        int password, amount;
        long mobilenumber;
        System.out.print("enter your name:");
        name = in.next();

        System.out.print("enter your password:");
        password = in.nextInt();

        System.out.print("enter your amount:");
        amount = in.nextInt();

        System.out.print("enter your mobilenumber:");
        mobilenumber = in.nextLong();

        System.out.println("\n------result-----\n");
        System.out.println("user name" + name);
        System.out.println("user mobilenumber" + mobilenumber);
        System.out.println("password" + password);
        System.out.println("amount" + amount);

    }
}
