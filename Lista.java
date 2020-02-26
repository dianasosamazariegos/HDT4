/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public interface Lista<E> {

            public int size();
            public boolean isEmpty();
            public void add(E item);
            public E remove(int index);
            public E get(int index);
            
}
