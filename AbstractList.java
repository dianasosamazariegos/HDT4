/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public abstract class AbstractList<E>  implements Lista<E>{
    
   public AbstractList(){
   }

   public boolean isEmpty(){
      return size() == 0;
   }
  
   public boolean contains(E valor){
	return -1 != indexOf(valor);
   }
    
   public void add(E item){
       
   }
   
   public int size(){
      return 0; 
   }
   
   
   public E remove(int index){
       return E;
   }
   
   public E get(int index){
       return E;
   }
}
