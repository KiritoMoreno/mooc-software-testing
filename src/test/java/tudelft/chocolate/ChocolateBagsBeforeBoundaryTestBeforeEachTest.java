package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTestBeforeEachTest {

    private ChocolateBags bags;

    @BeforeEach
    public void initialize(){this.bags = new ChocolateBags();}

    // It returns -1 because we don't have enough bags
    @Test
    public void totalIsHigherThanSmallAndBigBars(){
        int result = bags.calculate(2,1,8);
        Assertions.assertEquals(-1,result);
    }

    // Only uses 2 big bags
    @Test
    public void onlyBigBars(){
        int result = bags.calculate(5,3,10);
        Assertions.assertEquals(0,result);
    }

    // Uses bigs bags and 2 small bags
    @Test
    public void needForBigSmallBars(){
        int result = bags.calculate(5,3,17);
        Assertions.assertEquals(2,result);
    }

    // Only uses 3 small bags
    @Test
    public void onlySmallBars(){
        int result = bags.calculate(4,2,3);
        Assertions.assertEquals(3,result);
    }

}
