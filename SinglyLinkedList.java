/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class SinglyLinkedList<E> extends AbstractList<E> {

   protected int count;
   protected Node<E> head;

   public SinglyLinkedList(){
      head = null;
      count = 0;
   }
   
   public int size(){
      return count;
   }
  
  public void addFirst(E value){
     head = new Node<E>(value, head);
     count++;
  }
  
  public E removeFirst(){
     Node<E> temp = head;
     head = head.next();
     count--;
     return temp.value();
  }
  
  public E getFirst(){
      return head.value();
  }
  
  public void addLast(E value){
      Node<E> temp = new Node<E>(value,null);
      if (head != null){
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
   public boolean contains(E value){
      Node<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }
}
