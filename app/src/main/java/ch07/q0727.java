package ch07;

class Outer2 {
  int value=10;
  class Inner2 {
    int value=20;
    void method1() {
      int value=30;
      System.out.println(/* (1) */value);
      System.out.println(/* (2) */this.value);
      System.out.println(/* (3) */Outer2.this.value);
    }
  } // Inner클래스의 끝
} // Outer클래스의 끝


class q0727 {
  public static void main(String args[]) {
    /*
(4) 알맞은 코드를 넣어 완성하시오.
     */
    Outer2 outer = new Outer2();
    Outer2.Inner2 inner = outer.new Inner2();
    inner.method1();
  }
}