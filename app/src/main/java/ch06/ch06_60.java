package ch06;

public class ch06_60 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // void로 시작하면 return;이 암묵적으로 생성 > return을 안붙여도됨.
    // void가 아닌경우 반드시 return문 필요. > return 없으면 에러
    MyMath mm = new MyMath();
    long result = mm.max(3,5);
    long result1 = mm.add(5,3);
    long result2 = mm.subtract(5L, 3L);
    long result3 = mm.multiply(5L, 3L);
    double result4 = mm.divide(5L, 3L);
    mm.printGugudan(12);

    System.out.println("Max =" + result);
    System.out.println("add =" + result1);
    System.out.println("subtract =" + result2);
    System.out.println("multiply =" + result3);
    System.out.println("divide =" + result4);

  }
}

class MyMath {
  void printGugudan(int dan) {
    if (!(2<=dan && dan<=9)) {
      System.out.println("유효하지 않은 숫자");
      return;
    }
    for (int i=1;i<10;i++) {
      System.out.printf("%d * %d = %d \n", dan, i, dan*i);
    }
    return;
  }
  long add(long a, long b) {
    long result = a+b;
    return result;
  }
  long max(long a, long b) {
    return a>b? a:b;
    /* 위 문장은
     * if (a>b) {return a;}
     * else {return b;}
     * 
     */
  }
  long subtract(long a, long b) {long result = a-b; return result;}
  long multiply(long a, long b) { return a*b; }
  double divide(long a, long b) { return (double)a/b;}    
}
