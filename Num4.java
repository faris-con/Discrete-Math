package SecTask;
import java.util.Scanner;
public class Num4 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean[] p = new boolean[8];
        boolean[] q = new boolean[8];
        boolean[] r = new boolean[8];
        boolean[] q_or_r = new boolean[8];
        boolean[] p_AND_q_OR_r = new boolean[8];
        boolean[] p_AND_q = new boolean[8];
        boolean[] p_AND_r = new boolean[8];
        boolean[] pANDq_OR_pANDr = new boolean[8];
        //take the input of p
        for(int i = 0; i < 8; i++)
        {
            System.out.print("Enter the value number "+(i+1)+" of p : ");
            p[i] = input.nextBoolean();
        }
        //take the input of q
        for(int i = 0; i < 8; i++)
        {
            System.out.print("Enter the value number "+(i+1)+" of q : ");
            q[i] = input.nextBoolean();
        }
        //take the input of r
        for(int i = 0; i < 8; i++)
        {
            System.out.print("Enter the value number "+(i+1)+" of r : ");
            r[i] = input.nextBoolean();
        }
        //make q or r
        for(int i = 0; i < 4; i++)
        {
            if(q[i] == true && r[i] == true || q[i] == true && r[i] == false || q[i] == false && r[i] == true)
            {
                q_or_r[i] = true;
            }
            else
            {
                q_or_r[i] = false;
            }
        }
        //make p and (q or r)
        for(int i = 0; i < 8; i++)
        {
            if(p[i] == true && q_or_r[i] == true)
            {
                p_AND_q_OR_r[i] = true;
            }
            else
            {
                p_AND_q_OR_r[i] = false;
            }
        }
        //make p and q
        for(int i = 0; i < 8; i++)
        {
            if(p[i] == true && q[i] == true)
            {
                p_AND_q[i] = true;
            }
            else
            {
                p_AND_q[i] = false;
            }
        }
        //make p and r
        for(int i = 0; i < 8; i++)
        {
            if(p[i] == true && r[i] == true)
            {
                p_AND_r[i] = true;
            }
            else
            {
                p_AND_r[i] = false;
            }
        }
        //make (p and q) or (p and r)
        for(int i = 0; i < 8; i++)
        {
            if(p_AND_q[i] == true && p_AND_r[i] == true || p_AND_q[i] == true && p_AND_r[i] == false || p_AND_q[i] == false && p_AND_r[i] == true)
            {
                pANDq_OR_pANDr[i] = true;
            }
            else
            {
                pANDq_OR_pANDr[i] = false;
            }
        }
        //make the last compiration between (P AND (Q OR R)) equally to ((P AND Q) OR (P AND R))
        for(int i = 0; i < 8; i++)
        {
            if(p_AND_q_OR_r[i] == pANDq_OR_pANDr[i])
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