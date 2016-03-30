/**
 * Created by emre on 3/29/16.
 */
import java.util.ArrayList;
import java.util.List;

public class part3<E> {
    private E data1[];
    private E data2[];
    private List<E> res = new ArrayList<E>();

    /**
     * Construrctor
     * @param data1 array 1
     * @param data2 array 2
     */
    public part3(E data1[] , E data2[])
    {
        this.data1 = data1;
        this.data2 = data2;
    }

    /**
     * returns intersection set as a list of list1 and list 2
     * @return intersection set as a list of list1 and list 2
     */
    public List<E> intersectionOfLists()
    {
        res.clear();
        if(data2.length == 0 || data1.length == 0)
            return res;
        wrapperInterSection(0,0);
        //last item check
        if(data1[data1.length - 1] == data2[data2.length - 1])
            res.add(data1[data1.length -1 ]);
        return res;
    }

    /**
     * returns union set as a list of list1 and list 2
     * @return union set as a list of list1 and list 2
     */
    public List<E> unionOfLists()
    {
        res.clear();

        if (data1.length == 0)
        {
            for (E val:data2) {
                res.add(val);
            }
            return res;
        }
        if (data2.length == 0)
        {
            for (E val:data1) {
                res.add(val);
            }
            return res;
        }

        for (E val: data1) {
            res.add(val);
        }

        wrapperUnionList(0);
        return  res;
    }

    /**
     * return true if list2 is subset of list1
     * <p>&nbsp&nbsp <b>Example:</b></p>
     * <pre>
     *         {@code
     *         Integer arr1[] = {1,2,3,5,9,7,6};
     *         Integer arr2[] = {};
     *         part3<Integer> integerpart3;
     *         integerpart3 = new part3(arr1,arr2);
     *         }
     *         </pre>
     *         <p>
     *         returns true
     *         in vice versa so you call as
     *                            <p>part3(arr2,arr1);</p>
     *         returns false
     *         <p/>
     * @return whether is subset or not
     */
    public boolean isSubset()
    {
        if(data2.length == 0)
            return true;
        if(data1.length == 0)
            return false;
        if(data1.length < data2.length)
            return false;
        return wrapperIsSubset(0);
    }

    /**
     * Wrapper method for intersection method
     * @param i data1 counter
     * @param j data2 counter
     */
    private void wrapperInterSection(int i,int j)
    {
        if(i != data1.length -1 || j != data2.length -1)
        {
            if (data1[i] == data2[j])
                res.add(data1[i]);
            if (j == data2.length -1 ) {
                wrapperInterSection(i + 1, 0);
            }else
                wrapperInterSection(i, j + 1);
        }
    }

    /**
     * Wrapper method of UnionList method
     * @param i data2 counter
     */
    private void wrapperUnionList(int i)
    {
        if(i == data2.length -1)
            return;
        if(!res.contains(data2[i]))
            res.add(data2[i]);
        wrapperUnionList(i+1);
    }

    /**
     * Wrapper method for Issubset
     * @param i data1's counter
     * @return true or false whether is subset or not
     */
    private boolean wrapperIsSubset(int i)
    {
        boolean flag = true;
        if(i == data2.length)
            return true;

        if(!isin(data2[i],0))
            flag = false;
        return (flag && wrapperIsSubset(i + 1));
    }

    /**
     * It checks is data in the data2
     * @param data will check
     * @param i counter for data2
     * @return true or false whether is in or not
     */
    private boolean isin(E data , int i)
    {
        if(i == data1.length)
            return false;
        if( data == data1[i])
            return true;
        return  isin(data , i + 1);
    }
}
