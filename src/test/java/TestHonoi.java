import java.awt.peer.SystemTrayPeer;

/**
 * Created by emre on 3/29/16.
 */
public class TestHonoi {

    public static String TesterRecursiveHonoi(int disksize, char startPeg, char destPeg,char tempPeg) {
        if (disksize == 1)
            return "Move disk 1 from peg " + startPeg + " to peg " + destPeg + "\n";
        else return TesterRecursiveHonoi (disksize - 1 , startPeg , tempPeg , destPeg)
                + "Move disk " + disksize + " from peg " + startPeg
                + " to peg " + destPeg + "\n"
                + TesterRecursiveHonoi (disksize - 1 , tempPeg , destPeg , startPeg) ;
    }
    public static void main(String args[])
    {
        System.out.println("   ");
        TowerOfHonoi.ShowMoves(3,'A','C','B');
        String str = TesterRecursiveHonoi(3,'A','C','B');
        System.out.println("\n Test Function Runs Now \n");
        System.out.println(str);

    }
}
