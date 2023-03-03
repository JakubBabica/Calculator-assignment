import org.example.Operand;
import org.example.Operator;
import org.example.Stack;
import org.example.Token;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testing {
    private Stack stack;
    private ArrayList<Token> expression;

    @org.junit.jupiter.api.BeforeEach void setUp()
    {
        expression = new ArrayList<>();
        stack = new Stack();
        System.out.println("Start");
    }

    @org.junit.jupiter.api.AfterEach void tearDown()
    {
        System.out.println("End");
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
        expression.add(new Operand(7));
        expression.add(new Operand(4));
        expression.add(new Operator('+'));

        assertEquals(11, stack.evaluateExpression(expression));
    }
    // Many
    @Test public void advancedExpression() throws Exception {
        expression.add(new Operand(5));
        expression.add(new Operand(7));
        expression.add(new Operand(9));
        expression.add(new Operator('+'));
        expression.add(new Operator('*'));

        assertEquals(80, stack.evaluateExpression(expression));
    }
    // Exception
    @Test public void exceptionExpression() {
        expression.add(new Operand(7));
        expression.add(new Operator('l'));
        String expectedErrorMessage = "incorrect input";
        Exception customException = new Exception(expectedErrorMessage);
        assertThrows(customException.getClass(), () -> {
            stack.evaluateExpression(expression);
        });
    }
}
