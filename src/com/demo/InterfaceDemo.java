package com.demo;
interface writers{
    //when interface keyword is specified ,it assumes it is class and its public
     void write();

}
class pens implements writers{
    @Override
    public void write() {
        System.out.println("this is pen");
    }
}
class pencils implements writers{
    @Override
    public void write() {
        System.out.println("this is pencil");
    }
}
class kits{
    public void doSomething(writers p){
        p.write();
    }
}
public class InterfaceDemo{
    public static void main(String[] args){
        writers obj = new pens();
        writers obj1 = new pencils();
        kits k = new kits();
        k.doSomething(obj);
        k.doSomething(obj1);
    }
}
