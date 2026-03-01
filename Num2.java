package SecTask;
import java.util.Scanner;
public class Num2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of p : ");
        boolean p = input.nextBoolean();
        boolean NOT_p = !p;
        if(p == true && NOT_p == false)
        {
            System.out.println("P or ~P : true");
        }
        else if(p == false && NOT_p == true)
        {
            System.out.println("P or ~P : true");
        }
        else
        {
            System.out.println("P or ~P : false");
        }
    }
}
