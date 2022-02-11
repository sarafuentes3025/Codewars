import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstNonConsecutiveTest {

  @Test
  public void findFirstNonConsecutive_positiveNumbers_isPositive() {
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{1, 2, 3, 4, 6, 7, 8})).isEqualTo(Integer.valueOf(6));
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{4, 6, 7, 8, 9, 11})).isEqualTo(Integer.valueOf(6));
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{4, 5, 6, 7, 8, 9, 11})).isEqualTo(Integer.valueOf(11));
  }

  @Test
  public void findFirstNonConsecutive_positiveNumbers_isNull() {
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{1, 2, 3, 4, 5, 6, 7, 8})).isEqualTo(null);
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{31, 32})).isEqualTo(null);
  }

  @Test
  public void findFirstNonConsecutive_negativeNumbers_isNegative() {
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{-5, -4, -3, -1})).isEqualTo(Integer.valueOf(-1));
  }

  @Test
  public void findFirstNonConsecutive_positiveNumberAndNegativeNumbers_isZero() {
    assertThat(FirstNonConsecutive.findFirstNonConsecutive(new int[]{-3, -2, 0, 1})).isEqualTo(Integer.valueOf(0));
  }
}
