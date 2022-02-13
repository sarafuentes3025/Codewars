public class Accumul {
  public static String accum(String s) {
    char[] chars = s.toCharArray();
    StringBuilder result = new StringBuilder(Character.toString(chars[0]));

    for (int i = 1; i < s.length(); i++) {
      result.append("-").append(Character.toString(chars[i]).toUpperCase());
      for (int j = 0; j < i; j++) {
        result.append(Character.toLowerCase(chars[i]));
      }
    }
    return result.toString();
  }
}
