package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
public class State {
    Lock mutex = new ReentrantLock();
    Condition[] cond = new Condition[5];
    String[] state = new String[5];
    int[] id = new int[5];

    void outputState(int id) {
        StringBuffer line = new StringBuffer();
        for (int i = 0; i < 5; i++){
            line.append(state[i] + " ");
        }
        System.out.println(line + "(" + (id + 1) + ")");
    }

    public State() {
        for (int i = 0; i < 5; i++) {
            id[i] = i;
            state[i] = "O";
            cond[i] = mutex.newCondition();
        }
    }

    public void setState(int id, String s) {
        state[id] = s;
    }

    public void grabChopsticks(int id, Fork l, Fork r) {
        mutex.lock();
        try {
            setState(id, "o");
            while (!l.getAvailability() || !r.getAvailability()) {
                cond[id].await();
            }
            l.setAvailability(false);
            r.setAvailability(false);
            setState(id, "X");
            outputState(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mutex.unlock();
        }
    }

    public void releaseChopsticks(int id, Fork l, Fork r) {
        mutex.lock();
        setState(id, "O");
        l.setAvailability(true);
        r.setAvailability(true);
        cond[(id + 1) % 5].signalAll();
        cond[(id + 4) % 5].signalAll();
        outputState(id);
        mutex.unlock();
    }
}
