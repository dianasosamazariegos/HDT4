/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class CircularList<E> extends AbstractList<E> {

    protected Node<E> tail; 
    protected int count;

    public CircularList(){
        tail = null;
        count = 0;
    }

    public void addFirst(E value){
        Node<E> temp = new Node<E>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
    }


    public void addLast(E value){
        addFirst(value);
        tail = tail.next();
    }

    public E removeLast(){
        Node<E> finger = tail;
        while (finger.next() != tail){
            finger = finger.next();
        }
        Node<E> temp = tail;
        if (finger == tail){
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }
    
}
