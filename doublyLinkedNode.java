/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class doublyLinkedNode<E>{
    
    protected E datos;
    protected doublyLinkedNode<E> sigElement;
    protected doublyLinkedNode<E> antElement;

    public doublyLinkedNode(E v,doublyLinkedNode<E> next,doublyLinkedNode<E> prev){
        datos = v;
        sigElement = next;
        if (sigElement != null){
            sigElement.antElement = this;
            antElement = prev;
        }
        if (antElement != null){
            antElement.sigElement = this;
        }
    }

    public doublyLinkedNode(E v){
    this(v,null,null);
    }
    
    public doublyLinkedNode prev(){
        return null;
    }
    
    
}