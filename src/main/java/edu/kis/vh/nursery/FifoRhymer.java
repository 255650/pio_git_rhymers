package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    // TODO: rozważyć zmianę nazwy "temp" na bardziej opisową (np. bufferRhymer)
    private  final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }
        int ret = temp.countOut();
        
        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }
        return ret;
    }
}
