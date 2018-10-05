import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

public class EuroTest {
    @Test
    public void expect10EurosObjectToNotBeTheSameAsAnother10EurosObject() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(10);
        assertNotSame(euro1, euro2);
    }

    @Test
    public void expect10EurosEqualsAnother10EurosUsingAssertEquals() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(10);
        assertEquals(euro1, euro2);
    }

    @Test
    public void expect10EurosToNotBeEqualTo5Euros() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(5);
        assertNotEquals(euro1, euro2);
    }

    @Test
    public void expect10EurosToNotBeEqualToNull() {
        Euro euro10 = new Euro(10);
        assertNotEquals(euro10, null);
    }

    @Test
    public void expect10EurosToNotBeEqualToDifferentObject() {
        Euro euro10 = new Euro(10);
        assertNotEquals(euro10, new Object());
    }

    @Test
    public void expect10EurosToBeEqualTo7EurosPlus3Euros() {
        Euro euro10 = new Euro(10);
        Euro euro7 = new Euro(7);
        Euro euro3 = new Euro(3);
        assertEquals(euro10, euro7.add(euro3));
    }

    @Test
    public void expect10EurosToNotBeEqualTo5EurosPlus2Euros() {
        Euro euro10 = new Euro(10);
        Euro euro5 = new Euro(5);
        Euro euro2 = new Euro(2);
        assertNotEquals(euro10, euro5.add(euro2));
    }
}