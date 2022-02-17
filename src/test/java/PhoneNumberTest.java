import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneNumberTest {
  @Test
  public void tests() {
    assertThat(PhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})).isEqualTo("(123) 456-7890");
  }
}
