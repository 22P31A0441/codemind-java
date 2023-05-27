import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    float n,sum=0;
    n=sc.nextFloat();
    for(float i=1;i<=n;i++)
    {
        sum=(1/i)+sum;
    }
    System.out.printf("%.2f",sum);
}
}