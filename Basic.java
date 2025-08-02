import java.lang.System;
import java.util.Scanner;

class Basic {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        String Department = scan.nextLine();
        System.out.println("My ame is " + Name);
        System.out.println("My Age is " + Age);
        System.out.println("My Department is " + Department);
    }
}