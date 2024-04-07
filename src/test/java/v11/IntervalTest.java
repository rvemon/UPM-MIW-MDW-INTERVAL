package v11;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IntervalTest {
  
  @Test
  public void givenIntervalwhenIncludeWithIncludedValueThenTrue(){
    assertTrue(new Interval( -1.7, true, 5555.0).include(0.0));
  }

  @Test
  public void givenIntervalwhenIncludeWithNotIncludedValueThenFalse(){
    assertFalse(new Interval( -1.7,true, 5555.0).include(9000.0));
  }
  @Test
  public void givenIntervalwhenIncludeWithLimitValueThenFalse(){
    assertFalse(new Interval( -1.7,true, 5555.0).include(5555.0));
  }
}