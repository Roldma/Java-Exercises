
public class BoundedCounter {

    private int value;
    private final int upperBoundLimit;

    public BoundedCounter(int ulimit) {
        this.value = 0;
        this.upperBoundLimit = ulimit;
    }

    public void next() {
        if (this.value < this.upperBoundLimit) {
            this.value += 1;
            return;
        }
        
        if (this.value == this.upperBoundLimit) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        String val = Integer.toString(this.value);
        
        if (this.value < 10) {
            val = String.format("%02d",this.value);
        }
        
        return val;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int v) {
        if (v <= 0 || v > this.upperBoundLimit) {
            return;
        }
        
        this.value = v;
    }
}
