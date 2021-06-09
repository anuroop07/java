public class Average {
    public static void main(String args[]) {
     double[] array={45,85,25,96,27,36,86,65,55,99,83,41,76};
     double avg,sum=0;
     for(int i=0;i<10;i++)
     {sum+=array[i];}
     
     avg=sum/10;
     
     System.out.println("Average="+" "+avg);
      
    }
}