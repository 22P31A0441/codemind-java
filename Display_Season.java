import java.util.Scanner;
public class Seasons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        {
            if(month == 4 || month == 5 || month ==6)
            System.out.println("Summer");
            else if(month == 7 || month == 8 || month ==9)
            System.out.println("Rainy");
            else if(month == 11 || month == 12 || month ==1)
            System.out.println("Winter");
             else if(month == 2 || month == 3)
            System.out.println("Spring");
             else
            System.out.println("-1");
        }
    }
}