package v14;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IncludedMaxTest {

    @Test
    public void givenMaxClosedwhenGreaterWithLessValueThenTrue(){
        assertTrue(new IncludedMax(false, 4).greaterOrEquals(0.0));

    }

    @Test
    public void givenMaxClosedwhenGreaterWithGreaterValueThenFalse(){
        assertFalse(new IncludedMax(false, 4).greaterOrEquals(5.0));

    }

    @Test
    public void givenMaxClosedwhenGreaterWithEqualValueThenFalse(){
        assertTrue(new IncludedMax(false, 4).greaterOrEquals(4));

    }

}