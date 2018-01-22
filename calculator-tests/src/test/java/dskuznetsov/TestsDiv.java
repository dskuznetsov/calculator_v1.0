package dskuznetsov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.assertj.core.api.Assertions.assertThat;

public class TestsDiv {
    private Calculator calculator = new Calculator();
    private int a = 4;
    private int b = 2;
    private int result = 2;

    @Test
    public void DivTest() {
        assertEquals(result, calculator.div(a, b));
    }

    @Test
    public void DivTest2() {
        assertThat(calculator.div(a, b), equalTo(result));
    }

    @Test
    public void DivTest3() {
        assertThat(calculator.div(a, b)).isEqualTo(result);
    }
}
