import java.util.Scanner;
public class Num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int n,p=1,s=0,r;;
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            s=s+r;
            p=p*r;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}