package SecTask;
import java.util.Scanner;
public class Num3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean[] p = new boolean[4];
        boolean[] q = new boolean[4];
        boolean[] p_or_q = new boolean[4];
        boolean[] NOT_p_or_q = new boolean[4];
        boolean[] NOT_p = new boolean[4];
        boolean[] NOT_q = new boolean[4];
        boolean[] NOTp_NAD_NOTq = new boolean[4];
        //take the input of p
        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter the value number "+(i+1)+" of p : ");
            p[i] = input.nextBoolean();
        }
        //take the input of q
        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter the value number "+(i+1)+" of q : ");
            q[i] = input.nextBoolean();
        }
        //make p or q
        for(int i = 0; i < 4; i++)
        {
            if(p[i] == true && q[i] == true || p[i] == true && q[i] == false || p[i] == false && q[i] == true)
            {
                p_or_q[i] = true;
            }
            else
            {
                p_or_q[i] = false;
            }
        }
        //make not(p or q)
        for(int i = 0; i < 4; i++)
        {
            if(p_or_q[i] == true)
            {
                NOT_p_or_q[i] = false;
            }
            else
            {
                NOT_p_or_q[i] = true;
            }
        }
        //make not p
        for(int i = 0; i < 4; i++)
        {
            if(p[i] == true)
            {
                NOT_p[i] = false;
            }
            else
            {
                NOT_p[i] = true;
            }
        }
        // make not q
        for(int i = 0; i < 4; i++)
        {
            if(q[i] == true)
            {
                NOT_q[i] = false;
            }
            else
            {
                NOT_q[i] = true;
            }
        }
        //make not p and not q
        for(int i = 0; i < 4; i++)
        {
            if(NOT_p[i] == true && NOT_q[i] == true)
            {
                NOTp_NAD_NOTq[i] = true;
            }
            else
            {
                NOTp_NAD_NOTq[i] = false;
            }
        }
        // the compiration between not(p or q) and not p and not q
        for(int i = 0; i < 4; i++)
        {
            if(NOT_p_or_q[i] == NOTp_NAD_NOTq[i])
            {
                continue;
            }
            else
            {
                return;
            }
        }
        System.out.println("The logical expressions are correct");
    }
}