package com.zhangkai.demo.test;

/**
 * Created by zhangkai on 11/25/16.
 */
public class JmsTest {
  class A {
    public String show(D obj){
      return ("A and D");
    }
  public String show(A obj){
    return ("A and A");
  }
    public String print(A obj){
      return ("456");
    }
}
class B extends A{
  public String show(B obj){
    return ("B and B");
  }
  public String show(A obj){
    return ("B and A");
  }
  public String print(A obj){
    return ("123");
  }
}
  class C extends B{

  }
  class D extends B{

  }
  class E extends A{

  }

public static void main(String[] args) {
  JmsTest test = new JmsTest();
  A a1 = test.new A();
  A a2 = test.new E();
  B b = test.new B();
  C c = test.new C();
  D d = test.new D();
  E e = test.new E();
  System.out.println(a2.print(d));
  System.out.println(a1.show(c));
  System.out.println(a1.show(d));
  System.out.println(a2.show(b));
  System.out.println(a2.show(c));
  System.out.println(a2.show(d));
  System.out.println(b.show(b));
  System.out.println(b.show(c));
  System.out.println(b.show(d));
}
}
