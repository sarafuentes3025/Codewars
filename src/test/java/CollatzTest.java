import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollatzTest {
  @Test
  public void basicTests() {
    assertThat(Collatz.conjecture(20)).isEqualTo(8);
    assertThat(Collatz.conjecture(100)).isEqualTo(26);
    assertThat(Collatz.conjecture(34567)).isEqualTo(174);
  }
}
