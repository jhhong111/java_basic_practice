package ch06;

public class ch06_61 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /* 호출스택 (call stack) : 메서드 수행에 필요한 메모리가 제공되는 공간.
     * 아래 메서드(main)이 위의 메서드(println)를 호출하면 호출스택에 메모리 할당. 종료되면 해제. (main > println)
     * 맨 위의 메서드 하나만 실행. 나머지는 대기. 최종적으로 main 실행 후 프로그램 종료.
     * 스택(stack) : 밑이 막힌 상자. 선입후출 (FILO: first in last out)
     * 
     */
    System.out.println("Hello");
  }

}
