import org.testng.annotations.Test;
import ru.netology.CashBackHacker;

public class CashBackHackerTest {

    CashBackHacker cashBackHacker = new CashBackHacker();


    @Test

    public void testRemainLessThanBoundary() {
        int amount = 500;
        int expected = 500;
        int actual = cashBackHacker.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainEqualToBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainGreaterThanBoundary() {
        int amount = 1500;
        int expected = 500;
        int actual = cashBackHacker.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
}
