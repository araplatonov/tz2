import org.example.Main;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BasicsTest {
    @Test
    public void sum_test_1() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(2l);
        inp.add(5l);

        long validValue = Main._sum(inp);

        Assertions.assertEquals(8l, validValue);
    }
    @Test
    public void sum_test_2() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(10l);
        inp.add(-10l);
        inp.add(0l);

        long validValue = Main._sum(inp);

        Assertions.assertEquals(0l, validValue);
    }
    @Test
    public void sum_test_3() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(100l);
        inp.add(15l);

        long validValue = Main._sum(inp);

        Assertions.assertEquals(116l, validValue);
    }

    @Test
    public void min_test_1() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(2l);
        inp.add(5l);

        long validValue = Main._min(inp);

        Assertions.assertEquals(1l, validValue);
    }
    @Test
    public void min_test_2() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(10l);
        inp.add(-10l);
        inp.add(0l);

        long validValue = Main._min(inp);

        Assertions.assertEquals(-10l, validValue);
    }
    @Test
    public void min_test_3() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(100l);
        inp.add(15l);

        long validValue = Main._min(inp);

        Assertions.assertEquals(1l, validValue);
    }

    @Test
    public void max_test_1() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(2l);
        inp.add(5l);

        long validValue = Main._max(inp);

        Assertions.assertEquals(5l, validValue);
    }
    @Test
    public void max_test_2() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(10l);
        inp.add(-10l);
        inp.add(0l);

        long validValue = Main._max(inp);

        Assertions.assertEquals(10l, validValue);
    }
    @Test
    public void max_test_3() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(100l);
        inp.add(15l);

        long validValue = Main._max(inp);

        Assertions.assertEquals(100l, validValue);
    }
    @Test
    public void mult_test_1() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(10l);
        inp.add(-10l);
        inp.add(0l);

        long validValue = Main._mult(inp);

        Assertions.assertEquals(0l, validValue);
    }

    @Test
    public void another_test() {
        ArrayList<Long> inp = new ArrayList<Long>();
        inp.add(1l);
        inp.add(2l);
        inp.add(3l);

        long validValue = Main._min(inp) * Main._max(inp) * Main._sum(inp) / Main._mult(inp);

        Assertions.assertEquals(3l, validValue);
    }
}
