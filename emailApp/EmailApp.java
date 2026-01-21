package emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        
        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();
        
        Email em1 = new Email(firstName, lastName, company);
        System.out.println(em1.showInfo());
        
        sc.close();
    }
}