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
    public static void Start()
    {
        System.out.println("\n   Test Runs with 4 disk");
        TowerOfHonoi.ShowMoves(4,'A','C','B');
        String str = TesterRecursiveHonoi(4,'A','C','B');
        System.out.println("\n Test Function Runs Now \n");
        System.out.println(str);

        System.out.println("\n   Test runs with 1 disk");
        TowerOfHonoi.ShowMoves(1,'A','C','B');
         str = TesterRecursiveHonoi(1,'A','C','B');
        System.out.println("\n Test Function Runs Now \n");
        System.out.println(str);

        System.out.println("\n   Test runs with 9 disk");
        TowerOfHonoi.ShowMoves(3,'A','C','B');
         str = TesterRecursiveHonoi(3,'A','C','B');
        System.out.println("\n Test Function Runs Now \n");
        System.out.println(str);

    }
}
