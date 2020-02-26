import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    @org.junit.jupiter.api.Test
    void addSizeTest(){
        Lista<String> prueba=new SinglyLinkedList<>();
        prueba.add("hi");
        prueba.add("hello");
        int actual=prueba.size();
        Assertions.assertEquals(2,actual);
    }
}