/**
 * Created by emre on 3/29/16.
 */
public class TestPart3 {
    public static void main(String args[])
    {
        Integer arr1[] = {1,2,3,5,9,7,2,6};
        Integer arr2[] = {2,99,7,5,4};
        part3<Integer> integerpart3;
        integerpart3 = new part3(arr1,arr2);

        System.out.println(integerpart3.intersectionOfLists().toString());
    }
}
