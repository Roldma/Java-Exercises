/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
public class Counter {

    private int value;
    private final boolean check;

    public Counter(int startingVal, boolean check) {
        this.value = startingVal;
        this.check = check;
    }

    public Counter(int startingVal) {
        this.check = false;
        this.value = startingVal;
    }

    public Counter(boolean check) {
        this.value = 0;
        this.check = check;
    }

    public Counter() {
        this.value = 0;
        this.check = false;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease() {

        if (check && this.value > 0) {
            this.value -= 1;
        } else if (!check) {
            this.value -= 1;
        }
    }

    public void decrease(int decreaseAmount) {
        int newVal = 0;
        
        if (decreaseAmount < 0) {
            return ;
        }
        
        if (check) {
            if (decreaseAmount > 0) {
                newVal = this.value - decreaseAmount;
            }

            if (newVal > 0) {
                this.value -= decreaseAmount;
            } else if (newVal < 0) {
                this.value = 0;
            }
        } else {
            this.value -= decreaseAmount;
        }

    }
}
