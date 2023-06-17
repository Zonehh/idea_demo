import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculaterTest {
    @Test
    public void shouldReturn2When1Plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculater calculater = new Calculater();
        int actualResult = calculater.compute(1, 1, "Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculater calculater = new Calculater();
        int actualResult = calculater.compute(1, 1, "Sub");
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }

}