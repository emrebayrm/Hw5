import java.util.Collection;

/**
 * Created by emre on 3/29/16.
 */

public class TestPart3 {


    public static void showList(Object arr[])
    {
        for (Object elem:
             arr) {
            System.out.print(elem.toString() + " , ");
        }
        System.out.println();
    }
    public static void Start()
    {

        {
            Integer arr1[] = {1, 2, 3, 5, 9, 7, 6};
            Integer arr2[] = {};
            part3<Integer> integerpart3;
            integerpart3 = new part3(arr1, arr2);

            System.out.println("\nFirst case is if the second array is empty\n");
            System.out.println("First array is : " );
            showList(arr1);
            System.out.println("Second array is : " );
            showList(arr2);
            System.out.println("\nHere is Results of methods : ");
            System.out.println("Inter section : " + integerpart3.intersectionOfLists());
            System.out.println("Subset : " + integerpart3.isSubset());
            System.out.println("Union of List : "+ integerpart3.unionOfLists());
        }

        {
            Integer arr1[] = {1, 2, 3, 5, 9, 7, 6};
            Integer arr2[] = {};
            part3<Integer> integerpart3;
            integerpart3 = new part3(arr2, arr1);

            System.out.println("\n\nSecond case is if the first array is empty");
            System.out.println("First array is : " );
            showList(arr2);
            System.out.println("Second array is : " );
            showList(arr1);
            System.out.println("\nHere is Results of methods : ");
            System.out.println("Inter section : " + integerpart3.intersectionOfLists());
            System.out.println("Subset : " + integerpart3.isSubset());
            System.out.println("Union of List : " + integerpart3.unionOfLists());
        }

        {
            Integer arr1[] = {1, 2, 3, 5, 9, 7, 6};
            Integer arr2[] = {9,6};
            part3<Integer> integerpart3;
            integerpart3 = new part3(arr1, arr2);

            System.out.println("\n\nThird case is if the second array is subset of first");
            System.out.println("First array is : " );
            showList(arr1);
            System.out.println("Second array is : " );
            showList(arr2);
            System.out.println("\nHere is Results of methods : ");
            System.out.println("Inter section : " + integerpart3.intersectionOfLists());
            System.out.println("Subset : " + integerpart3.isSubset());
            System.out.println("Union of List : " + integerpart3.unionOfLists());
        }

        {
            Integer arr1[] = {1, 2, 3, 5, 9, 7, 6};
            Integer arr2[] = {1,2};
            part3<Integer> integerpart3;
            integerpart3 = new part3(arr2, arr1);

            System.out.println("\n\nFourth case is if the first array is subset of first but should return false" +
                    " because second subset of first");
            System.out.println("First array is : " );
            showList(arr1);
            System.out.println("Second array is : " );
            showList(arr2);
            System.out.println("\nHere is Results of methods : ");
            System.out.println("Inter section : " + integerpart3.intersectionOfLists());
            System.out.println("Subset : " + integerpart3.isSubset());
            System.out.println("Union of List : " + integerpart3.unionOfLists());
        }

        {
            Integer arr1[] = {1, 2, 3, 5, 9, 7, 6};
            Integer arr2[] = { 4 , 5 , 9};
            part3<Integer> integerpart3;
            integerpart3 = new part3(arr1, arr2);

            System.out.println("\n\nFifth case is no subset and 2 intersected value and 1 different ");
            System.out.println("First array is : " );
            showList(arr1);
            System.out.println("Second array is : " );
            showList(arr2);
            System.out.println("\nHere is Results of methods : ");
            System.out.println("Inter section : " + integerpart3.intersectionOfLists());
            System.out.println("Subset : " + integerpart3.isSubset());
            System.out.println("Union of List : " + integerpart3.unionOfLists());
        }



    }
}
