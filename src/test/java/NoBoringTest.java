import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NoBoringTest {
  @Test
  public void noBoringZeros_positiveNumbers() {
    assertThat(NoBoring.noBoringZeros(1450)).isEqualTo(145);
    assertThat(NoBoring.noBoringZeros(960000)).isEqualTo(96);
    assertThat(NoBoring.noBoringZeros(1050)).isEqualTo(105);
  }

  @Test
  public void noBoringZeros_negativeNumber() {
    assertThat(NoBoring.noBoringZeros(-1050)).isEqualTo(-105);
  }
}
