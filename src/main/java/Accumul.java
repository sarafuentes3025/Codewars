public class Accumul {
  public static String accum(String s) {
    char[] chars = s.toCharArray();
    String result = Character.toString(chars[0]);

    for (int i = 1; i < s.length(); i++) {
      result += "-" + Character.toString(chars[i]).toUpperCase();
      for (int j = 0; j < i; j++) {
        result += Character.toLowerCase(chars[i]);
      }
    }
    return result;
  }
}
