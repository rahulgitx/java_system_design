package org.repository;

public abstract class Abstr {
    private int a;
    public void method1(){
        System.out.println("this is Abstr");
    }
    public abstract void method2();
}

class abstr extends Abstr{

    @Override
    public void method2() {

    }
}
