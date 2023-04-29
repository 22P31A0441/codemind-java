import java.util.Scanner;
public class AreaofCircle
{
    public static void main(String args[])
    {
        int radius;
        double pi=3.14,area;
        Scanner sc=new Scanner(System.in);
        radius =sc.nextInt();
        area=pi*radius*radius;
        System.out.format("%.2f",area);
    }
}