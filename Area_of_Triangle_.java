import java.util.Scanner;
 public class Sample
{
    public static void main(String args[])
    {
        int A,B,C;
        double s,Area;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        s=(A+B+C)/2.0;
        Area=Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.format("%.2f",Area);
    }
}