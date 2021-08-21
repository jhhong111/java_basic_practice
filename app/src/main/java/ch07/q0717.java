package ch07;

abstract class Unit {
  int x, y; // 현재 위치
  abstract void move(int x, int y);
  void stop() { /* 현재 위치에 정지*/ } 
}


class Marine extends Unit { // 보병
  //int x, y; // 현재 위치
  void move(int x, int y) {}
  void stimPack() { /*스팀팩을 사용한다 .*/} 
}
class Tank extends Unit { // 탱크
  //int x, y; // 현재 위치
  void move(int x, int y) {}
  void changeMode() { /* 공격모드를 변환한다. */} 
}
class Dropship extends Unit { // 수송선
  //int x, y; // 현재 위치
  void move(int x, int y) {}
  void load() { /* 선택된 대상을 태운다.*/ } 
  void unload() { /*선택된 대상을 내린다.*/ } 
}

//public class q0717 {
//  public static void main(String args[]) {
//
//  }
//}
