package com.games;

public class Arma  {
    private int ammunition = 0;

    public void shoot() {
        if (ammunition > 0) {
            ammunition--;
            print("Pum...! " + ammunition);
        } else {
            print("Ammunition exhausted. Recharge");
        }
    }

    public void zoomIncreased() {
        print("Increased scope zoom");
    }

    public void zoomDecreased() {
        print("Decreased scope zoom");
    }

    public void recharge() {
        ammunition = 11;
        print("Loaded weapon. Ammunition: " + ammunition);
    }

    public int getAmmunition() {
        return ammunition;
    }


    private void print(String value) {
        System.out.println(value);
    }
}