import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.assertj.core.api.Assertions.assertThat;

public class TestsDiv {
    @Test
    public void DivTest(){
      Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int result = 2;
        assertEquals(result, calculator.div(a, b));
    }

    @Test
    public void DivTest2(){
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int result = 2;
        assertThat(calculator.div(a, b), equalTo(result));
    }

    @Test
    public void DivTest3(){
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int result = 2;
        assertThat(calculator.div(a, b)).isEqualTo(result);
    }
}
