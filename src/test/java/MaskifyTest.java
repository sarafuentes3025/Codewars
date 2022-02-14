import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaskifyTest {

  @Test
  public void maskify_numbersGreaterThan4_isMasked() {
    assertThat(Maskify.maskify("4556364607935616")).isEqualTo("############5616");
    assertThat(Maskify.maskify("64607935616")).isEqualTo("#######5616");
    assertThat(Maskify.maskify("4556364607935616")).isEqualTo("############5616");
    assertThat(Maskify.maskify("4556364607935616")).isEqualTo("############5616");
  }

  @Test
  public void maskify_numberLessThan4_isNotMasked() {
    assertThat(Maskify.maskify("1")).isEqualTo("1");
  }

  @Test
  public void maskify_string_isMasked() {
    assertThat(Maskify.maskify("Skippy")).isEqualTo("##ippy");
    assertThat(Maskify.maskify("Nananananananananananananananana Batman!")).isEqualTo("####################################man!");
  }
}
