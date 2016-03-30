/**
 * Created by emre on 3/29/16.
 */

import java.lang.Math;
import java.util.Stack;

public class TowerOfHonoi {
    /**
     * Shows All moves to complete Puzzle
     * @param disksize is amount of disks
     * @param src is source peg's Character
     * @param dest is destination peg's character
     * @param aux is Temporary peg's Character
     */
    public static void ShowMoves(int disksize,char src,char dest,char aux)
    {
        Stack<Integer>  source = new Stack<Integer>();
        Stack<Integer>  auxilary = new Stack<Integer>();
        Stack<Integer>  destination = new Stack<Integer>();

        int movetimes = (int) Math.pow(2,disksize) - 1;
        for(int i = disksize; i > 0; --i)
            source.push(i);

        if(disksize%2 == 0)
            for(int i = 1; i <= movetimes; ++i) {
                if(i % 3 == 1)
                {
                    moveDisksBetweenTwoPoles(source,auxilary,src,aux);
                }
                if(i% 3 == 2)
                {
                    moveDisksBetweenTwoPoles(source,destination,src,dest);
                }
                if (i % 3 == 0)
                {
                    moveDisksBetweenTwoPoles(auxilary,destination,aux,dest);
                }
            }
        else
        for(int i = 1; i <= movetimes; ++i) {
            if(i % 3 == 1)
            {
                moveDisksBetweenTwoPoles(source,destination,src,dest);
            }
            if(i% 3 == 2)
            {
                moveDisksBetweenTwoPoles(source,auxilary,src,aux);
            }
            if (i % 3 == 0)
            {
                moveDisksBetweenTwoPoles(destination,auxilary,dest,aux);
            }
        }
    }

    /**
     * Helper method to move disk
     * @param src source stack
     * @param dest destination stack
     * @param s source of Character
     * @param d destination of Character
     */
    private static void moveDisksBetweenTwoPoles( Stack<Integer> src, Stack<Integer> dest, char s, char d)
    {
        // When pole 1 is empty
        if (src.empty())
        {
            System.out.printf("Move the disk %d from \'%c\' to \'%c\' \n",  src.push(dest.pop()), d, s);
        }

        // When pole2 pole is empty
        else if (dest.empty())
        {
            System.out.printf("Move the disk %d from \'%c\' to \'%c\' \n", dest.push( src.pop()), s, d);
        }

        // When top disk of pole1 > top disk of pole2
        else if (src.peek() > dest.peek())
        {
            System.out.printf("Move the disk %d from \'%c\' to \'%c\' \n", src.push( dest.pop()), d, s);
        }

        // When top disk of pole1 < top disk of pole2
        else
        {
            System.out.printf("Move the disk %d from \'%c\' to \'%c\' \n", dest.push( src.pop()), s, d);
        }
    }
}
