import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayDifferenceTest {
  @Test
  public void sampleTests() {
    assertThat(ArrayDifference.arrayDiff(new int[]{1, 2}, new int[]{1})).isEqualTo(new int[]{2});
    assertThat(ArrayDifference.arrayDiff(new int[]{1, 2, 2}, new int[]{1})).isEqualTo(new int[]{2, 2});
    assertThat(ArrayDifference.arrayDiff(new int[]{1, 2, 2}, new int[]{2})).isEqualTo(new int[]{1});
    assertThat(ArrayDifference.arrayDiff(new int[]{1, 2, 2}, new int[]{})).isEqualTo(new int[]{1, 2, 2});
    assertThat(ArrayDifference.arrayDiff(new int[]{}, new int[]{1, 2})).isEqualTo(new int[]{});
  }
}
