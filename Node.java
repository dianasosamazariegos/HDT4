/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Node<E> {
    
   protected E datos;
   protected Node<E> sigElemento;

   public Node(E v, Node<E> next){
       datos = v;
       sigElemento = next;
   }

   public Node(E v){
      this(v,null);
   }

   public Node<E> next(){
      return sigElemento;
   }

   public void setNext(Node<E> next){
      sigElemento = next;
   }

   public E value(){
      return datos;
   }

   public void setValue(E value){
      datos = value;
   }
}
