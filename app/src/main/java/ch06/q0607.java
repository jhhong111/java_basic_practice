package ch06;

class MyPoint {
  int x;
  int y;

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  double getDistance(int x1, int y1) {
    double distance = (x1-x)*(x1-x) + (y1-y)*(y1-y);
    return Math.sqrt(distance);
  }
}

class q0607 {
  public static void main(String args[]) {
    MyPoint p = new MyPoint(1,1);
    // p와 (2,2)의 거리를 구한다.
    System.out.println(p.getDistance(2,2));
  }
}

/*
  클래스변수(cv) : width, height
  인스턴스변수(iv) : kind, num 
  지역변수(lv) : k, n
  card는 레퍼런스..
 */