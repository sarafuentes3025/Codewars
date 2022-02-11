import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccumulTest {
  @Test
  public void test() {
    assertThat(Accumul.accum("ZpglnRxqenU")).isEqualTo("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
    assertThat(Accumul.accum("NyffsGeyylB")).isEqualTo("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
    assertThat(Accumul.accum("MjtkuBovqrU")).isEqualTo("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
    assertThat(Accumul.accum("EvidjUnokmM")).isEqualTo("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
    assertThat(Accumul.accum("HbideVbxncC")).isEqualTo("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
  }
}
