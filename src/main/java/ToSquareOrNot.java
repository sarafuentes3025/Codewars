public class ToSquareOrNot {
  public static int[] squareOrSquareRoot(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.sqrt(array[i]) % 1 == 0 ?
          Math.sqrt(array[i]) :
          array[i] * array[i]);
    }
    return array;
  }
}
