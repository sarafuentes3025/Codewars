import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KataTest {

  @Test
  public void evenTests() {
    assertThat(Kata.getMiddle("test")).isEqualTo("es");
    assertThat(Kata.getMiddle("middle")).isEqualTo("dd");
  }

  @Test
  public void oddTests() {
    assertThat(Kata.getMiddle("testing")).isEqualTo("t");
    assertThat(Kata.getMiddle("A")).isEqualTo("A");
  }
}
