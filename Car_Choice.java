import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        float x1,x2,y1,y2;
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
            x1=sc.nextFloat();
            x2=sc.nextFloat();
            y1=sc.nextFloat();
            y2=sc.nextFloat();
            if(y1/x1<y2/x2)
            {
                System.out.println("-1");
            }
            else if(y1/x1>y2/x2)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}
    
