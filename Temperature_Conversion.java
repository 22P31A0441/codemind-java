import java.util.Scanner;
 public class Sample
{
    public static void main(String args[])
    {
       double c,F;
       Scanner sc=new Scanner(System.in);
       c=sc.nextDouble();
       F=32+(c*9/5);
       System.out.format("%.2f",F);
    }
}