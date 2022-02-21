import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultipleOf3Or5Test {
  @Test
  public void test() {
    assertThat(new MultipleOf3Or5().solution(10)).isEqualTo(23);
  }
}
