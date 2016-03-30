/**
 * Created by emre on 3/30/16.
 */
import java.util.LinkedList;

public class part2<E>{

    private Node<E> head; // Root of Node

    /**
     * Constructor  with no parameter creates a new root
     */
    public part2()
    {
        head = new Node<E>();
    }

    /**
     * Node is inner class to keep data in linked list data structure
     * @param <E> type of Node data
     */
    private class Node<E>{

        private E data; // data

        private Node<E> next; // Next  node

        /**
         * To create root of node
         */
        public Node()
        {
            next = null;
        }

        /**
         * To create nodes
         * @param data node's data
         */
        public Node(E data)
        {
            this.data = data;
            next = null;
        }
    }

    /**
     * Helper method to Add New Data to LinkedList
     * @param head head of tree
     * @param data data to add
     */
    private void add(Node<E> head,E data)
    {
        if(head.next == null)
            head.next = new Node<E>(data);
        else
            add(head.next,data);
    }

    /**
     * Adds New Data to List
     * @param data data to add
     */
    public void add(E data)
    {
        if(head == null)
            head = new Node<E>(data);
        else add(head,data);
    }

    /**
     * Removes all Duplicated OutData
     * @param outData
     * @return operation completed or not
     */
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

    /**
     * Wrapper method for remove(E outData) Method
     * @param head head of List
     * @param pred prev of list's elem
     * @param outData to remove data
     * @return completed or not
     */
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
