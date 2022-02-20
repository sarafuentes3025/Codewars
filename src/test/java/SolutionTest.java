import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
  @Test
  public void staticTests() {
    assertThat(Solution.whoLikesIt()).isEqualTo("no one likes this");
    assertThat(Solution.whoLikesIt("Peter")).isEqualTo("Peter likes this");
    assertThat(Solution.whoLikesIt("Jacob", "Alex")).isEqualTo("Jacob and Alex like this");
    assertThat(Solution.whoLikesIt("Max", "John", "Mark")).isEqualTo("Max, John and Mark like this");
    assertThat(Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max")).isEqualTo("Alex, Jacob and 2 others like this");
  }
}
