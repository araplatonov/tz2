import org.example.Main;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasicsTest {
    @Test
    public void sum_test() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(2l);
        inp.add(5l);

        long validValue = Main._sum(inp);

        Assertions.assertEquals(8l, validValue);
    }
}
