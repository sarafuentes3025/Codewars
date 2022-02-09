import java.util.Arrays;

public class SquareSumFunction {
  public static int squareSum(int[] n) {
    return Arrays.stream(n).reduce(0, (subtotal, element) -> subtotal + (element * element));
  }
}
