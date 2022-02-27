import java.awt.*;

public class HexToRGB {
  public static int[] hexStringToRGB(String hex) {

    // hex -> {r, g, b}
    Color decode = Color.decode(hex);
    return new int[]{decode.getRed(), decode.getGreen(), decode.getBlue()};
  }
}
