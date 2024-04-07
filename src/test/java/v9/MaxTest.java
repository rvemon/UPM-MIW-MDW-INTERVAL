
package v8;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    public void givenMaxwhenGreaterWithLessValueThenTrue(){
        assertTrue(new Max(true, 4).greater(0.0));
    }

    @Test
    public void givenMaxwhenGreaterWithLessValueThenFalse(){
        assertFalse(new Max(true, 4).greater(5.0));
    }

}