import java.util.*;
public class Armstrong
{ 
  public static void main(String[] args)
   {
     int armg,rem,sum=0,num;
     Scanner obj=new Scanner(System.in);
     System.out.print("enter the number\n");
     armg=obj.nextInt();
     num=armg;
     
     while(num!=0)
     {
         rem=num%10;
         sum+=(rem*rem*rem);
         num=num/10;
     }
     
     if(sum==armg)
     {
         System.out.println("The entered number is an Armstrong number");
     }
     
     else
     System.out.println("The entered number is not an Armstrong number");
     
     
     }
     
}