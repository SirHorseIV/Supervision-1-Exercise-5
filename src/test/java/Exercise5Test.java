import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Exercise5Test {
    @Test
    public void returnsMinusOneWhenNoBitsInCommon() {
        Assertions.assertEquals(Exercise5.lowestCommon(0b1010, 0b0101), -1);
    }

    @Test
    public void returnsOneWhenAIs0111AndBIs1010() {
        Assertions.assertEquals(Exercise5.lowestCommon(0b0111, 0b1010), 1);
    }

    @Test
    public void returnsTwoWhenAIs0100AndBIs1100() {
        Assertions.assertEquals(Exercise5.lowestCommon(0b0100, 0b1100), 2);
    }

    @Test
    public void returnsZeroWhenAIs1111AndBIs0001() {
        Assertions.assertEquals(Exercise5.lowestCommon(0b1111, 0b0001), 0);
    }
}
