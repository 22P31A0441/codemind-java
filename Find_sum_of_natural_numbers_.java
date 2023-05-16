import java.util.Scanner;
public class Addition
{
    public static void main(String[] args)
    {
    int i,num=0,sum=0;
     Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
    for(i=1;i<=num;i++)
    {
        sum = sum+i;
    }
    System.out.println(sum);
}
    }