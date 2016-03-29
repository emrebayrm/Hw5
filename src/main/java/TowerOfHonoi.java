/**
 * Created by emre on 3/29/16.
 */

import java.lang.Math;
import java.util.Stack;

public class TowerOfHonoi {
    public static void ShowMoves(int disksize,char src,char dest,char aux)
    {
        Stack<Integer>  tow1 = new Stack<Integer>();
        Stack<Integer>  tow2 = new Stack<Integer>();
        Stack<Integer>  tow3 = new Stack<Integer>();

        int movetimes = (int) Math.pow(2,disksize) - 1;
        for(int i = disksize; i < 0; --i)
            tow1.push(i);

        for(int i = 1; i < movetimes; ++i) {
            if(i % 3 == 1)
            {
                Integer pushed = tow2.push(tow1.pop());
                System.out.println("Move disk " + pushed + " from " + src + " to " + dest + "\n");
            }
            if(i% 3 == 2)
            {
                Integer pushed = tow3.push(tow1.pop());
                System.out.println("Move disk " + pushed + " from " + src + " to " + aux + "\n");
            }
            if (i % 3 == 0)
            {
                Integer pushed = tow1.push(tow2.pop());
                System.out.println("Move disk " + pushed + " from " + aux + " to " + src + "\n");
            }
        }
    }
}
