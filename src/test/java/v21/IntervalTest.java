package v14;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IntervalTest {
  protected static final double MAX = 555.0;
  protected static final double MIN = -1.7;
  protected static final double CLOSED_MAX = 5555.0;
  protected static final double GREATER_THAN_CLOSED_MAX = 9000.0;
  protected static final double CLOSED_MIN = 0.0;

}
  
  @Test
  public void givenIntervaOpenOpenlwhenIncludeWithIncludedValueThenTrue(){
    assertTrue(new Interval(MIN, new Max(MAX)).include(CLOSED_MIN));
  }

  @Test
  public void givenIntervalOpenOpenwhenIncludeWithNotIncludedValueThenFalse(){
    assertFalse(new Interval(MIN, new Max(MAX)).include(GREATER_THAN_CLOSED_MAX));
  }
  @Test
  public void givenIntervalOpenOpenwhenIncludeWithLimitValueThenFalse(){
    assertFalse(new Interval(MIN, new Max(MAX)).include(CLOSED_MAX));
  }
  @Test
  public void givenIntervalOpenClosewhenIncludeWithIncludedValueThenTrue(){
    assertTrue(new Interval(MIN, new ClosedMax(CLOSED_MAX)).include(CLOSED_MIN));
  }

  @Test
  public void givenIntervalOpenClosewhenIncludeWithNotIncludedValueThenFalse(){
    assertFalse(new Interval(MIN, new ClosedMax(CLOSED_MAX)).include(GREATER_THAN_CLOSED_MAX));

  @Test
  public void givenIntervalOpenClosewhenIncludeWithLimitValueThenFalse(){
      assertTrue(new Interval(MIN, new ClosedMax(CLOSED_MAX)).include(CLOSED_MAX));
  }
}