import java.util.Scanner;
public class positional 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean[] p = new boolean[4];
        boolean[] q = new boolean[4];
        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter the value of p number " + (i+1) + ": ");
            p[i] = input.nextBoolean();
        }
        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter the value of q number " + (i+1) + ": ");
            q[i] = input.nextBoolean();
        }
        System.out.print("p         ");
        System.out.print("q         ");
        System.out.println("p^q");    
        for(int i = 0; i < 4; i++)
        {
            System.out.print(p[i]+"     ");
            System.out.print(q[i]+"        ");
            if(p[i] && q[i] == true)
            {
                System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
            System.out.println("");
        }
        input.close();
    }
}