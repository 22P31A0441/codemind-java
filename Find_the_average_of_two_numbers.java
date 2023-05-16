import java.util.*;
import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
       double c=(num1+num2)/2.0;
        System.out.format("%.4f",c);
        
    }
}