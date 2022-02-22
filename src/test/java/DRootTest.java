import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DRootTest {
  @Test
  public void digital_root_OneDigit_isTheSame() {
    assertThat(DRoot.digital_root(9)).isEqualTo(9);
  }

  @Test
  public void digital_root_OneDigit_isOneDigit() {
    assertThat(DRoot.digital_root(456)).isEqualTo(6);
  }

  @Test
  public void digital_root_OneDigit_isZero() {
    assertThat(DRoot.digital_root(0)).isEqualTo(0);
  }
}
