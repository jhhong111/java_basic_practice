package ch07;

class SutdaCard2 {
  final int num;
  final boolean isKwang;
  SutdaCard2() {
    this(1, true);
  }
  SutdaCard2(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }
  @Override
  public String toString() {
    return num + ( isKwang ? "K":"");
  }
}

public class q0714 {
  public static void main(String args[]) {
    SutdaCard2 card = new SutdaCard2(1, true);
  }
}

/* 7-15 : b,e
 * 7-16 : e
 */ 
