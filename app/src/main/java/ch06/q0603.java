package ch06;

public class q0603 {
  public static void main(String[] arg) {
    Student s = new Student();
    s.name = "홍길동";
    s.ban = 1;
    s.no = 1;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;
    System.out.println("이름:"+s.name);
    System.out.println("총점:"+s.getTotal());
    System.out.println("평균:"+s.getAverage());
  }
}

class Student {
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  int getTotal() {
    return this.kor + this.eng + this.math;
  }

  float getAverage() {
    return (Math.round(getTotal()/3f*10)/10.0f);
    // return (int) (getTotal() / 3f*10 + 0.5f) /10f;
  }
}