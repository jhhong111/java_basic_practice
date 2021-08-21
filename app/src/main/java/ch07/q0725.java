package ch07;

class Outer {
  class Inner {
    int iv=100;
  }
}

public class q0725 {
  public static void main(String[] args) {
    /*
    (1) 알맞은 코드를 넣어 완성하시오.
     */
    Outer ou = new Outer();
    Outer.Inner in = ou.new Inner();
    // new Inner(Outer ou); 라고 생각
    System.out.println(in.iv);

  }
}
