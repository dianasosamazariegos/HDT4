import java.util.ArrayList;

public class arraylistStack<E> extends abstractStack<E> {
    protected ArrayList<E> lista=new ArrayList<>();
    private int contador=-1;

    public void push(E item){
        lista.add(item);
        contador++;
    }

    public E pop(){
        if (!empty()) {
            E var = lista.get(contador);
            lista.remove(contador);
            contador--;
            return var;
        }else{
            return null;
        }
    }

    public E peek(){
        if (!empty()){
            return lista.get(contador);
        }else return null;
    }

    public int size(){
        return lista.size();
    }
}
