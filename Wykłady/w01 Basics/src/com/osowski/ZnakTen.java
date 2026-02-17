package com.osowski;

public class ZnakTen implements Cloneable {
    char z = 'A';


    public ZnakTen clone() throws CloneNotSupportedException {
        return (ZnakTen) super.clone();
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
