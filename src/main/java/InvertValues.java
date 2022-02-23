import java.util.Arrays;

public class InvertValues {
  public static int[] invert(int[] array) {
    return Arrays.stream(array).map(n-> n* -1).toArray();
  }
}
