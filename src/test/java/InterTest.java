import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InterTest {
    InterImplement interImplement;

    public InterTest() {
    }

    @Before
    public void setUp() {
        this.interImplement = new InterImplement();
    }

    @Test
    public void FirstTryOfSending() {
        Assert.assertFalse(this.interImplement.sendMessage("ip", "mess"));
    }

    @Test
    public void SecTryOfSending() {
        this.interImplement.sendMessage("ip", "mess");
        Assert.assertTrue(this.interImplement.sendMessage("ip", "mess"));
    }
}
