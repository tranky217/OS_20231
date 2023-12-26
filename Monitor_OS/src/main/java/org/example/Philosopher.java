package org.example;

public class Philosopher implements Runnable{
    State hlp;
    Fork l, r;
    int id;
    public Philosopher(int id, Fork l, Fork r, State i) {
        this.hlp = i;
        this.l = l;
        this.r = r;
        this.id = id;
    }

    private void eat() {
        try {
            Thread.sleep(2000);
            System.out.println(id+" Eat");
        } catch (Exception e) {
        }
    }

    private void think() {
        try {
            Thread.sleep(2000);
            System.out.println(id + " think");
        } catch (Exception e) {
        }
    }

    public void run() {
        while (true) {
            hlp.grabChopsticks(id, l, r);
            eat();
            hlp.releaseChopsticks(id, l, r);
            think();
        }
    }
}
