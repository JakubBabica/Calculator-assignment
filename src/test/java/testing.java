import org.example.Stack;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testing {
    private Stack stack;
    private ArrayList<Object> expression;

    @org.junit.jupiter.api.BeforeEach void setUp()
    {
        expression = new ArrayList<>();
        stack = new Stack();
        System.out.println("------------------> Begin test");
    }

    @org.junit.jupiter.api.AfterEach void tearDown()
    {
        System.out.println("End of test <------------------");
    }

    // Zero - empty expression
    @Test
    public void emptyExpression()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            stack.evaluateExpression(expression);
        });
    }
    // One
    @Test public void simpleExpression() throws Exception {
        expression.add(3);
        expression.add(4);
        expression.add("+");

        assertEquals(7, stack.evaluateExpression(expression));
    }
    // Many
    @Test public void advancedExpression() throws Exception {
        expression.add(3);
        expression.add(4);
        expression.add(8);
        expression.add("+");
        expression.add("*");

        assertEquals(36, stack.evaluateExpression(expression));
    }
    // Exception
    @Test public void exceptionExpression() {
        expression.add(3);
        expression.add("a");
        String expectedErrorMessage = "incorrect input";
        Exception customException = new Exception(expectedErrorMessage);
        assertThrows(customException.getClass(), () -> {
            stack.evaluateExpression(expression);
        });
    }
}
