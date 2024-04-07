package v14;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IncludedMaxTest extends Maxtest {

    @Override
    public Max createMax(double value){
        return new ClosedMax(value);

    }

    @Override
    public void givenMaxWhenIsWithinWithEqualsValue(){
        assertTrue(createMax(VALUE).isWithin(equals(VALUE)));
    }

}