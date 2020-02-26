public class ListaFactory<E> {
    public Lista<E> getLista(String tipo){
        if(tipo.equals("simple")){
            return new SinglyLinkedList<E>();
        } else if(tipo.equals("doble")){
            return new doublyLinkedList<E>();
        }else{
            return new CircularList<E>();
        }
}
}
