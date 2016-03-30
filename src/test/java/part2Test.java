/**
 * Created by emre on 3/30/16.
 */
public class part2Test {
    public static void main(String[] args)
    {
        part2<Integer> test = new part2<Integer>();

        test.add(5);
        test.add(7);
        test.add(1);
        test.add(9);
        test.add(4);
        test.add(67);
        test.add(5);
        test.add(6);
        test.add(2);
        test.add(5);

        System.out.println("Before : ");
        test.showList();

        test.remove(5);

        System.out.println("after Deleting 5 : ");
        test.showList();
    }
}
