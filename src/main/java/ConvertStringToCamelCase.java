import java.util.Arrays;

public class ConvertStringToCamelCase {
  static String toCamelCase(String s) {
    String[] array = s.split("[-|_]");

    return Arrays.stream(array, 1, array.length)
        .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
        .reduce(array[0], String::concat);
  }
}
