import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        reverse();

    }
    public static void reverse()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = ob.nextLine();
        int len = str.length();
        for (int i = (len-1); i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }


    }

    
} 