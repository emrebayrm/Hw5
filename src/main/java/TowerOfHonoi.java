/**
 * Created by emre on 3/29/16.
 */

import java.lang.Math;

public class TowerOfHonoi {
    public static void ShowMoves(int disksize,char src,char dest,char aux)
    {
        int movetimes = (int) Math.pow(2,disksize) - 1;
        for(int i = 1; i < movetimes; ++i) {
            if (i % 3 == 1)
                System.out.printf("move %c to %c \n", src, dest);
            if (i % 3 == 2)
                System.out.printf("move %c to %c \n", src, aux);
            if (i % 3 == 0)
                System.out.printf("move %c to %c \n", aux, src);
        }
    }
}
