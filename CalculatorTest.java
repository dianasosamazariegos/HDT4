import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void validateTextTest() {
        Calculator calc=new Calculator();
        boolean actual = calc.validateText("1 1 / 9 + 5 *-");
        Assertions.assertEquals(false, actual);
    }

    @Test
    void calculateTest() {
        Calculator calc=new Calculator();
        Pila<Integer> pila=new arraylistStack<>();
        int actual = calc.calculate("1 1 / 9 + 5 *",pila);
        Assertions.assertEquals(50, actual);
    }
}