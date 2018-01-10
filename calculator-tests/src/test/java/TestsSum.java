import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class TestsSum {

    @Test
    public void SumTest1(){
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;
        int result = 27;
        assertEquals(result, calculator.sum(a, b));
    }

    @Test
    public void SumTest2(){
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;
        int result = 27;
        assertThat(calculator.sum(a, b), equalTo(result));
    }

    @Test
    public void SumTest3(){
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;
        int result = 27;
        assertThat(calculator.sum(a, b)).isEqualTo(result);
    }
}
