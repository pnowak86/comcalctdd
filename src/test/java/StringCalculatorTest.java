import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorTest {
    StringCalculator testedObject;

    @Test
    public void testConstructor() {

    }

    @Before
    public void setUp() {
        testedObject = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroForEmptyString() {
        int result = testedObject.add("");
        assertThat(result).isEqualTo(0);

    }

    private Object[][] dataforTestingOutput() {
        return new Object[][]{
                {"", 0},
                {"1", 1},
                {"1,2", 3},
                {"7,3", 10},
                {"120,120", 240}
        };
    }

    @Parameters(method = "dataforTestingOutput")

    @Test
    public void shouldReturnProperOutputForGivenInput(String input, int expectetResult) {
        int result = testedObject.add("1,2");
        assertThat(result).isEqualTo(3);

    }

    @Parameters(method = "dataforTestingOutput")
    @Test
    public void shouldReturnProperOutputForGivenInput2(String input, int expectetResult) {
        int result = testedObject.add("7,3");
        assertThat(result).isEqualTo(10);

    }

    @Parameters(method = "dataforTestingOutput")
    @Test
    public void shouldReturnProperOutputForGivenInput3(String input, int expectetResult) {
        int result = testedObject.add("120,120");
        assertThat(result).isEqualTo(240);

    }

}
