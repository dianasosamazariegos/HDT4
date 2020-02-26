/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class doublyLinkedList<E> extends AbstractList<E>{
    
    protected int count;
    protected doublyLinkedNode<E> head;
    protected doublyLinkedNode<E> tail;

    public doublyLinkedList(){
        head = null;
        tail = null;
        count = 0;
    }


    public void addFirst(E value){
        head = new doublyLinkedNode<E>(value, head, null);
        if (tail == null) tail = head;
        count++;
    }


    public void addLast(E value){
        tail = new doublyLinkedNode<E>(value, null, tail);
        if (head == null) head = tail;
        count++;
    }


    public E removeLast(){
        doublyLinkedNode<E> temp = tail;
        tail = tail.anterior();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
}

}