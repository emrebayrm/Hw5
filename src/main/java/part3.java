/**
 * Created by emre on 3/29/16.
 */
import java.util.ArrayList;
import java.util.List;

public class part3<E> {
    private E data1[];
    private E data2[];
    private List<E> res = new ArrayList();

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
        wrapperInterSection(0,0);
        return res;
    }

    /**
     * returns union set as a list of list1 and list 2
     * @return union set as a list of list1 and list 2
     */
    public List<E> unionOfLists()
    {
        res.clear();
        for (E val:data1) {
                res.add(val);
        }

        wrapperUnionList(0);
        return  res;
    }

    /**
     * return true if list2 is subset of list1
     * @return
     */
    public boolean isSubset()
    {
        return wrapperIsSubset(0);
    }

    /**
     * Wrapper method for intersection method
     * @param i data1 counter
     * @param j data2 counter
     */
    private void wrapperInterSection(int i,int j)
    {
        if(i == data1.length -1 && j == data2.length -1)
            return ;
        else {
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
        if(i == data1.length)
            return true;

        if(!isin(data1[i],0))
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
        if(i == data2.length)
            return false;
        if( data == data2[i])
            return true;
        return  isin(data , i + 1);
    }
}
