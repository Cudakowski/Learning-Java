package com.osowski;

public class ToolsSix {
    void print(LiczbaSix obj) {
        System.out.print("x=" + obj.x + ", ");
        obj.x = 0;
    }

    void swap(LiczbaSix a, LiczbaSix b) { // metoda klasy Tools
        LiczbaSix t = a;
        a = b;
        b = t;
    }

    void swapReally(LiczbaSix a, LiczbaSix b) {
        LiczbaSix t = new LiczbaSix();
        t.setX(a); a.setX(b); b.setX(t);
    }
}
