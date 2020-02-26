public interface Pila<T> {
    public void push(T item);
    public T pop();
    public T peek();
    public boolean empty();
    public int size();
}
