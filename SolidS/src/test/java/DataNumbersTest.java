import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DataNumbersTest {
    @Test
    public void shouldReturnPositiveNumber() {
        // given
        DivideClass divideObject = new DivideClass();

        // when
        int divideResult = divideObject.divide(5, 1);

        // then
        assertEquals(5,divideResult);
    }

    @Test
    public void shouldReturnCommunicate () {
        // given
        DivideClass object = new DivideClass();

        // when
        int result = object.divide(2, 0);

        // then
        assertThat(result).isEqualTo(-1);
    }

    @ Test
    public void shouldReturnNegativeNumber () {
        // given
        DivideClass object = new DivideClass();

        // when
        int result = object.divide(1, -1);

        // then
        assertEquals(result, -1);
    }



}