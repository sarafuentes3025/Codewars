import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareSumFunctionTest {
  @Test
  public void squareSum_positiveNumbers() {
    assertThat(SquareSumFunction.squareSum(new int[]{1, 2, 2})).isEqualTo(9);
    assertThat(SquareSumFunction.squareSum(new int[]{1, 2})).isEqualTo(5);
  }

  @Test
  public void squareSum_NegativeNumbers() {
    assertThat(SquareSumFunction.squareSum(new int[]{-5, -3, -4})).isEqualTo(50);
  }

  @Test
  public void squareSum_emptyArray() {
    assertThat(SquareSumFunction.squareSum(new int[]{})).isEqualTo(0);
  }
}
