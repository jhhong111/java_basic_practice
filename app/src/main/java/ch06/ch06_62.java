package ch06;

class Data { int x; }
public class ch06_62 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* 기본형 매개변수
     * 기본형 매개변수 - 변수의 값을 읽기만 가능(read only)
     * 참조형 매개변수 - 변수의 값을 읽고 변경 가능 (read & write)
     * 
     * 
     */
    Data d = new Data();
    d.x = 10;
    System.out.println("main() : x = " + d.x);

    change(d.x);
    System.out.println("after change(d.x)");
    System.out.println("main : x = " + d.x);
  }
  static void change(int x) { // return으로 x값이 바뀌지 않았으므로 기본형 매개변수.
    x = 1000;
    System.out.println("change() : x = " + x);
  }

}
