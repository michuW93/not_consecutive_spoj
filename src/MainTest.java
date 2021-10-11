import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    Main main;
    @Before
    public void setUp(){
        main = new Main();
    }

    @Test
    public void forZero(){
        int[] tab = main.getNotConsecutive(0);
        Assert.assertEquals(0, tab[0]);
    }

    @Test
    public void forFour(){
        int[] tab = main.getNotConsecutive(4);
        Assert.assertTrue(Math.abs(tab[0] - tab[1]) > 1);
        Assert.assertTrue(Math.abs(tab[1] - tab[2]) > 1);
        Assert.assertTrue(Math.abs(tab[2] - tab[3]) > 1);
        Assert.assertTrue(Math.abs(tab[3] - tab[4]) > 1);
    }
}
