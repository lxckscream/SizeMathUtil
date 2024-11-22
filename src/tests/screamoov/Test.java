package tests.screamoov;

import main.screamoov.SizeUtil;
import main.screamoov.Sizes;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            long value = Long.parseLong(str);
            for (Sizes size : Sizes.values()) {
                System.out.println(size.name() + ": " + SizeUtil.getBits(size, value) + " bits");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

    }
}
