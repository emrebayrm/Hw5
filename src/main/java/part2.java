/**
 * Created by emre on 3/30/16.
 */
import java.util.LinkedList;

public class part2<E>{

    private Node<E> head;

    public part2()
    {
        head = new Node<E>();
    }

    private class Node<E>{
        private E data;
        private Node<E> next;

        public Node()
        {
            next = null;
        }
        public Node(E data)
        {
            this.data = data;
            next = null;
        }
    }
    private void add(Node<E> head,E data)
    {
        if(head.next == null)
            head.next = new Node<E>(data);
        else
            add(head.next,data);
    }

    public void add(E data)
    {
        if(head == null)
            head = new Node<E>(data);
        else add(head,data);
    }

    public boolean remove(E outData)
    {
        if(head == null)
            return false;
        if(head.next.data.equals(outData))
        {
            head = head.next;
        }
        return remove(head.next,head,outData);

    }

    public boolean remove(Node<E> head, Node<E> pred, E outData)
    {
        if(head == null)
            return true;
        if(head.data.equals(outData))
        {
            pred.next = head.next;
        }
        return remove(head.next,head,outData);
    }

    public void showList()
    {
            showList(head.next);
    }

    private void showList(Node<E> next)
    {
        if(next.next == null)
        {
            System.out.println(next.data.toString());
        }
        else {
            System.out.println(next.data.toString());
            showList(next.next);
        }

    }

}
