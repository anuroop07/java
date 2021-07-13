import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1st DNA sequence: ");
        String DNA1 = ob.nextLine();
        System.out.println("Enter 2nd DNA sequence: ");
        String DNA2 = ob.nextLine();
        System.out.println("1st sequence: " +DNA1);
        System.out.println("2nd sequence: " +DNA2);
        int len1 = DNA1.length(), len2 = DNA2.length();
        if (DNA1 == DNA2)
            System.out.println("The sequences are same");
        else 
            System.out.println("The sequences are different");
        System.out.println("Length of the 1st sequence is: " +len1);
        System.out.println("Length of the 2nd sequence is: " +len2);
    }
}
