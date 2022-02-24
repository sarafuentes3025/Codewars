import java.util.Arrays;

public class FindOdd {
  public static int findIt(int[] a) {
    /* XOR will cancel out everytime you XOR with the same number so
    1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out*/
    return Arrays.stream(a).reduce(0, (xor, e) -> xor ^ e);
  }
}
