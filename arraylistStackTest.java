import org.junit.jupiter.api.Assertions;

class arraylistStackTest {
    @org.junit.jupiter.api.Test
    void pushPopTest() {
        Pila<String> prueba =new arraylistStack<>();
        prueba.push("hello");
        String actual=prueba.pop();
        Assertions.assertEquals("hello",actual);
    }
    @org.junit.jupiter.api.Test
    void pushPeekTest() {
        Pila<String> prueba =new arraylistStack<>();
        prueba.push("hello");
        String actual=prueba.peek();
        Assertions.assertEquals("hello",actual);
    }
    @org.junit.jupiter.api.Test
    void empty() {
        Pila<String> prueba =new arraylistStack<>();
        prueba.push("hello");
        boolean actual=prueba.empty();
        Assertions.assertEquals(false,actual);
    }
    @org.junit.jupiter.api.Test
    void size() {
        Pila<String> prueba =new arraylistStack<>();
        prueba.push("hello");
        prueba.push("hello");
        int actual=prueba.size();
        Assertions.assertEquals(2,actual);
    }
}