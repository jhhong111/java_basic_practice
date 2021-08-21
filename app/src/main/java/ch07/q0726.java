package ch07;

class Outer1 {
  static class Inner {
    int iv=200;
  }
}

public class q0726 {
  public static void main(String[] args) {
    /*
    (1) 알맞은 코드를 넣어 완성하시오.
     */

    Outer1.Inner in = new Outer1.Inner();
    System.out.println(in.iv);
  }
}
