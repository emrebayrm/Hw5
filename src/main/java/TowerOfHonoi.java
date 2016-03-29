/**
 * Created by emre on 3/29/16.
 */
public class TowerOfHonoi {
    public static void ShowMoves(int disksize,char src,char dest,char aux)
    {
        printf("\n Move disk 1 from peg %c to peg %c", frompeg, topeg);

        for (int i = disksize; i == 1 ; i--)
        {
            printf("\n Move disk %d from peg %c to peg %c", num, frompeg, topeg);

        }

        towers(num - 1, frompeg, auxpeg, topeg);



        towers(num - 1, auxpeg, topeg, frompeg);
    }

}
