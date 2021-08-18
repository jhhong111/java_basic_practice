package ch06;

public class q0622 {
  /*
  (1) isNumber . 메서드를 작성하시오
   */
  static boolean isNumber(String str) {
    if (str == null || str == "") {
      return false;
    }
    for (int i=0; i<str.length();i++ ) {
      int num = str.charAt(i)-'0';
      if (num < 0 || num > 9) {
        return false;
      }
    } return true;
  }

  public static void main(String[] args) {
    String str = "123";
    System.out.println(str+" 는 숫자입니까? "+isNumber(str)); 
    str = "1234o";
    System.out.println(str+" 는 숫자입니까? "+isNumber(str)); 
  }
}

