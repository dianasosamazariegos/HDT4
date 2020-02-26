import java.util.Vector;

public class vectorStack<E> extends abstractStack<E> {
    protected Vector<E> vector=new Vector<>();
    private int contador=-1;

    public void push(E item){
        vector.add(item);
        contador++;
    }

    public E pop() {
        if (!empty()) {
            E var = vector.get(contador);
            vector.remove(contador);
            contador--;
            return var;
        }else{
            return null;
        }
    }

    public E peek(){
        if(!empty()){
            return vector.get(contador);
        }else return null;
    }

    public int size(){
        return vector.size();
    }
}
