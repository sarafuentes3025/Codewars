import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDifference {
  public static int[] arrayDiff(int[] a, int[] b) {

    List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
    listA.removeAll(listB);

    return listA.stream().mapToInt(i -> i).toArray();
  }
}
