import java.util.stream.IntStream;

public class MultipleOf3Or5 {
  public int solution(int number) {
    return IntStream.rangeClosed(0, number - 1).filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, Integer::sum);
  }
}
