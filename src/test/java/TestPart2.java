/**
 * Created by emre on 3/30/16.
 */
public class TestPart2 {
    public static void Start()
    {
        part2<Integer> test = new part2<Integer>();

        System.out.println("   Firstly Trying to remove before adding and result is : " + test.remove(5));

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

        System.out.println("\n\nAfter Adding some Numbers and List is like that : ");
        test.showList();

        System.out.println("after Deleting 5 method returned : " + test.remove(5));
        test.showList();

        System.out.println("Now Trying to remove 3 which is not in the list method returned : " + test.remove(3));
        test.showList();
    }
}
