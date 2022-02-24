import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindOddTest {

  @Test
  public void findIt_negativeAndPositiveNumbers_isAPositiveOdd() {
    assertThat(FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5})).isEqualTo(5);
  }

  @Test
  public void findIt_positiveNumbers_isAPositiveOdd() {
    assertThat(FindOdd.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5})).isEqualTo(5);
    assertThat(FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1})).isEqualTo(10);
  }

  @Test
  public void findIt_negativeAndPositiveNumbers_isANegativeOdd() {
    assertThat(FindOdd.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5})).isEqualTo(-1);
  }

  @Test
  public void findIt_oneNumber_isAPositiveOdd() {
    assertThat(FindOdd.findIt(new int[]{10})).isEqualTo(10);
  }
}
