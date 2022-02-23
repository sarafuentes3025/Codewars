import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class InvertValuesTest {
  @Test
  public void testSomething() {

    int[] input = new int[]{-1, -2, -3, -4, -5};
    int[] expected = new int[]{1, 2, 3, 4, 5};
    assertThat(Arrays.toString(InvertValues.invert(input))).isEqualTo(Arrays.toString(expected));

    input = new int[]{-1, 2, -3, 4, -5};
    expected = new int[]{1, -2, 3, -4, 5};
    assertThat(Arrays.toString(InvertValues.invert(input))).isEqualTo(Arrays.toString(expected));

    input = new int[]{};
    expected = new int[]{};
    assertThat(Arrays.toString(InvertValues.invert(input))).isEqualTo(Arrays.toString(expected));

    input = new int[]{0};
    expected = new int[]{0};
    assertThat(Arrays.toString(InvertValues.invert(input))).isEqualTo(Arrays.toString(expected));
  }
}
