import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertStringToCamelCaseTest {

  @Test
  public void convertStringToCamelCase_testSomeUnderscoreLowerStart() {
    assertThat(ConvertStringToCamelCase.toCamelCase("the_Stealth_Warrior")).isEqualTo("theStealthWarrior");
  }

  @Test
  public void convertStringToCamelCase_testSomeDashLowerStart() {
    assertThat(ConvertStringToCamelCase.toCamelCase("the-Stealth-Warrior")).isEqualTo("theStealthWarrior");
  }
}
