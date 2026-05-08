package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {

    double a, b, additionResult, subtractionResult, multiplicationResult, divisionResult;
    Calculator calculator;

    @BeforeEach         // initialisation of values to perform each unit test
    void setUp() {
        a = 10;
        b = 5;
        additionResult = 15;
        subtractionResult = 5;
        multiplicationResult = 50;
        divisionResult = 2;
        calculator = new Calculator();
    }

    @AfterEach          // clean-ups (e.g. close db connections, clean up variables)
    void tearDown() {
        a = 0;
        b = 0;
    }

    @Test
    @DisplayName("method add() correctly adds 10 + 5 with a result of 15")
    void add() {
        assertEquals(additionResult, calculator.add(a, b));     // assertion to test the addition of a + b = 15;
    }

    @Test
    @DisplayName("method subtract() correctly subtracts 10 - 5 with a result of 5")
    void subtract() {
        assertEquals(subtractionResult, calculator.subtract(a, b));     // assertion to test subtraction of a - b = 5;
    }

    @Test
    @DisplayName("method multiply() correctly multiplies 10 * 5 with a result of 50")
    void multiply() {
        assertEquals(multiplicationResult, calculator.multiply(a, b));  // assertion to test multiplication of a * b = 50
    }

    @Test
    @DisplayName("method division() correctly divide 10 / 5 with a result of 2")
    void division() {
        assertEquals(divisionResult, calculator.division(a, b)); // assertion to test division of a / b = 2
    }
}
