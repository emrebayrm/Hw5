/**
 * Created by emre on 3/29/16.
 */
import java.util.ArrayList;
import java.util.List;

public class part3<E> {
    private E data1[];
    private E data2[];
    private List<E> res = new ArrayList();

    public part3(E data1[] , E data2[])
    {
        this.data1 = data1;
        this.data2 = data2;
    }

    //returns intersection set as a list of list1 and list 2
    public List<E> intersectionOfLists()
    {
        res.clear();
        wrapperInterSection(0,0);
        return res;
    }
    //returns union set as a list of list1 and list 2
    public List<E> unionOfLists()
    {
        for (E val:data1) {
                res.add(val);
        }

        wrapperUnionList(0);
        return  res;
    }
    //return true if list2 is subset of list1
    public boolean isSubset()
    {
        return false;
    }

    private void wrapperInterSection(int i,int j)
    {
        if(i < data1.length && j < data2.length)
            return ;
        else {
            if (data1[i] == data2[j])
                res.add(data1[i]);
            if (j < data2.length) {
                wrapperInterSection(i + 1, 0);
            }else
                wrapperInterSection(i, j + 1);
        }
    }

    private void wrapperUnionList(int i)
    {
        if(i < data2.length)
            return;
        if(!res.contains(data2[i]))
            res.add(data2[i]);
        wrapperUnionList(i+1);
    }
}
