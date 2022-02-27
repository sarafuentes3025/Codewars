import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HexToRGBTest {

  @Test
  public void hexStringToRGB_allOne_isRGB() {
    assertThat(HexToRGB.hexStringToRGB("#111111")).isEqualTo(new int[]{17, 17, 17});
  }

  @Test
  public void hexStringToRGB_allZero_isRGB() {
    assertThat(HexToRGB.hexStringToRGB("#000000")).isEqualTo(new int[]{0, 0, 0});
  }

  @Test
  public void hexStringToRGB_mix_isRGB() {
    assertThat(HexToRGB.hexStringToRGB("#FF9933")).isEqualTo(new int[]{255, 153, 51});
    assertThat(HexToRGB.hexStringToRGB("#beaded")).isEqualTo(new int[]{190, 173, 237});
    assertThat(HexToRGB.hexStringToRGB("#Fa3456")).isEqualTo(new int[]{250, 52, 86});
  }
}
