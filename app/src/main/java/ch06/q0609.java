package ch06;

public class q0609 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}

class Marine {
  int x=0, y=0; // Marine의 위치좌표(x,y)
  int hp = 60; // 현재 체력
  static int weapon = 6; // 공격력
  static int armor = 0; // 방어력
  //인스턴스는 불러올때마다 새로 변수가 생성되어 값 변경 가능.

  void weaponUp() {
    weapon++;
  }
  void armorUp() {
    armor++;
  }
  void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

/* 6-10 : b,e
 * 6-11 : d
 * 6-12 : c,d
 * 6-13 : b,c,d
 * 6-14 : c,e
 * 6-15 : a
 * 6-16 : a,e
 * 6-17 : b
 * 6-18 : B static 메서드는 instance 변수를 사용하지 못함. (객체생성해야함.)
 *      : D static 메서드는 instance 메서드를 사용하지 못함. (객체생성해야함.)
 *      : A static 변수는 instance 변수의 값을 받지 못함.
 * 6-19 : ABC123
 *        After change:ABC123456
 */
