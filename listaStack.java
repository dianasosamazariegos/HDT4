public class listaStack<E> extends abstractStack<E> {
    ListaFactory<E> lFactory= new ListaFactory<>();
    private int contador=-1;
    Lista<E> miLista;
    public listaStack(String tipo){
        miLista=lFactory.getLista(tipo);
    }
    public void push(E item){
        miLista.add(item);
        contador++;
    }
    public E pop(){
        if (!empty()){
            E var =miLista.get(contador);
            miLista.remove(contador);
            contador--;
            return var;
        }else{
            return null;
        }
    }

    public E peek() {
        if(!empty()){
            return miLista.get(contador);
        }else return null;
    }
    public int size(){
        return miLista.size();
    }
}
