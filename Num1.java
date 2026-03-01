package SecTask;
import java.util.Scanner;
class num1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of p : ");
        boolean p = input.nextBoolean();
        boolean NOT_p = !p;
        if(p == true && NOT_p == true)
        {
            System.out.println("P ^ ~P : true");
        }
        else
        {
            System.out.println("P ^ ~P : false");
        }
    }
}