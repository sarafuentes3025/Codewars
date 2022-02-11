public class FirstNonConsecutive {
  static Integer findFirstNonConsecutive(final int[] array) {

    for (int i = array[0], j = 0; j < array.length; i++, j++) {
      if (i != array[j])
        return array[j];
    }
    return null;
  }
}
