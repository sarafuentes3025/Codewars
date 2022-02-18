public class SumParts {
  public static int[] sumParts(int[] ls) {
    int[] newArray = new int[ls.length + 1];
    newArray[ls.length] = 0;

    for (int i = ls.length - 1, sum = 0; i >= 0; i--) {
      sum += ls[i];
      newArray[i] = sum;
    }
    return newArray;
  }
}
