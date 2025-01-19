package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.management.GarbageCollectorMXBean;

public class GHappyTest {
    @Test
    public void testHappyGs(){
        GHappy gHappyg = new GHappy();
        Assertions.assertTrue(gHappyg.gHappy("xxggxx"));
        Assertions.assertTrue(gHappyg.gHappy("gg"));
        Assertions.assertTrue(gHappyg.gHappy(""));
    }

    @Test
    public void testHappyFalse(){
        GHappy ggHappy = new GHappy();
        Assertions.assertFalse(ggHappy.gHappy("xxgxx"));
        Assertions.assertFalse(ggHappy.gHappy("xxggxyygxx"));
        Assertions.assertFalse(ggHappy.gHappy("g"));
    }


}
