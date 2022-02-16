public class Collatz {
  public static long conjecture(long x) {
    var i = 1;
    while (x != 1) {
      x = x % 2 == 0 ? x / 2 : x * 3 + 1;
      i++;
    }
    return i;
  }
}
