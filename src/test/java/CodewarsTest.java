import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CodewarsTest {
  @Test
  public void oddOrEven_positiveNumbers_isOdd() {
    assertThat(Codewars.oddOrEven(new int[]{2, 5, 34, 6})).isEqualTo("odd");
  }

  @Test
  public void oddOrEven_numberZero_isEven() {
    assertThat(Codewars.oddOrEven(new int[]{0})).isEqualTo("even");
  }

  @Test
  public void oddOrEven_negativeNumbers_isEven() {
    assertThat(Codewars.oddOrEven(new int[]{0, -1, -5})).isEqualTo("even");
  }
}
