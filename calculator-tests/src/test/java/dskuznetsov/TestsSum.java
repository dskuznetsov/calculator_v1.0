package dskuznetsov;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class TestsSum {
    private Calculator calculator = new Calculator();
    private int a = 10;
    private int b = 17;
    private int result = 27;

    @Test
    public void SumTest1() {
        assertEquals(result, calculator.sum(a, b));
    }

    @Test
    public void SumTest2() {
        assertThat(calculator.sum(a, b), equalTo(result));
    }

    @Test
    public void SumTest3() {
        assertThat(calculator.sum(a, b)).isEqualTo(result);
    }
}
