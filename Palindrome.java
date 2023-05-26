import java.util.Scanner;
public class num
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum = 0,r;
    int temp = n;
    while(n>0)
    {
        r=n%10;
        n=n/10;
        sum=(sum*10)+r;
    }
    if(temp==sum)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    
    }
}