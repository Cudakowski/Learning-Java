package com.osowski;

 class ZnakNine implements Cloneable  {
    char z = 'A';


    public ZnakNine clone() throws CloneNotSupportedException {
        return (ZnakNine) super.clone();
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
