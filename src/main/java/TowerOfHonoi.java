/**
 * Created by emre on 3/29/16.
 */

import java.lang.Math;
import java.util.Stack;

public class TowerOfHonoi {
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
                    moveDisksBetweenTwoPoles(source,auxilary,'A','B');
                }
                if(i% 3 == 2)
                {
                    moveDisksBetweenTwoPoles(source,destination,'A','C');
                }
                if (i % 3 == 0)
                {
                    moveDisksBetweenTwoPoles(auxilary,destination,'B','C');
                }
            }
        else
        for(int i = 1; i <= movetimes; ++i) {
            if(i % 3 == 1)
            {
                moveDisksBetweenTwoPoles(source,destination,'A','C');
            }
            if(i% 3 == 2)
            {
                moveDisksBetweenTwoPoles(source,auxilary,'A','B');
            }
            if (i % 3 == 0)
            {
                moveDisksBetweenTwoPoles(destination,auxilary,'C','B');
            }
        }
    }

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
