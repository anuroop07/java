import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
      int number;
     
     Scanner obj=new Scanner(System.in);
     Scanner obj2=new Scanner(System.in);
     System.out.println("enter the name");
     String strname = obj.nextLine();
     System.out.print("enter the number\n");
     number=obj2.nextInt();
     Name(number,strname);
    }
    
  public static  void Name(int number,String strname)
    {
      
      for(int i=0;i<number;i++)
      {
        System.out.println(strname);
        
      }
    }
     
}