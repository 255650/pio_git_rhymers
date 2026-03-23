package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;

public class FifoRhymerTest {
    @Test
    public void testFifoRhymerCountOutOrder() {
        FifoRhymer r = new FifoRhymer();
        r.countIn(1);
        r.countIn(2);
        Assert.assertEquals(1, r.countOut());
        Assert.assertEquals(2, r.countOut());
        Assert.assertEquals(-1, r.countOut());
    }
}
