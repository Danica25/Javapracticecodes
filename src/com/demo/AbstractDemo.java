package com.demo;
abstract class writer{
    //when a method is abstract then class should be declared as abstract
    public abstract void write();

}
class pen extends writer{
    @Override
    public void write() {
        System.out.println("this is pen");
    }
}
class pencil extends writer{
    @Override
    public void write() {
        System.out.println("this is pencil");
    }
}
class kit{
    public void doSomething(writer p){
        p.write();
    }
}
public class AbstractDemo {
    public static void main(String[] args){
        writer obj = new pen();
        writer obj1 = new pencil();
        kit k = new kit();
        k.doSomething(obj);
        k.doSomething(obj1);
    }
}
