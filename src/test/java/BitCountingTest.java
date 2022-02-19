import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BitCountingTest {
  @Test
  public void testGame() {
    assertThat(BitCounting.countBits(1234)).isEqualTo(5);
    assertThat(BitCounting.countBits(4)).isEqualTo(1);
    assertThat(BitCounting.countBits(7)).isEqualTo(3);
    assertThat(BitCounting.countBits(9)).isEqualTo(2);
    assertThat(BitCounting.countBits(10)).isEqualTo(2);
  }
}
