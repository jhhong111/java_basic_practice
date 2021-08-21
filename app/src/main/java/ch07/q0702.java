package ch07;

class SutdaDeck1 {
  final int CARD_NUM = 20;
  SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
  SutdaDeck1() {
    for (int i=0; i<CARD_NUM; i++) {
      int num = i%10+1;
      boolean isKwang = i<10&&(num==1||num==3||num==8);
      cards[i] = new SutdaCard1(num, isKwang);
    }
  }
  void shuffle() {
    for (int i=0; i<CARD_NUM; i++) {
      int indexNum = (int)(Math.random()*20);
      SutdaCard1 card = cards[i];
      cards[i] = cards[indexNum];
      cards[indexNum] = card;
    }
  }
  SutdaCard1 pick(int index) {
    if (index<0 || index>=cards.length) {
      return null;
    }
    return cards[index];
  }
  SutdaCard1 pick() {
    return pick((int)(Math.random()*cards.length));
  }
}
class SutdaCard1 {
  int num;
  boolean isKwang;
  SutdaCard1() {
    this(1, true);
  }
  SutdaCard1(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }
  // info() Object toString() . 대신 클래스의 을 오버라이딩했다
  @Override
  public String toString() {
    return num + ( isKwang ? "K":"");
  }
}


public class q0702 {
  public static void main(String args[]) {
    SutdaDeck1 deck = new SutdaDeck1();
    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
    deck.shuffle();
    for(int i=0; i < deck.cards.length;i++)
      System.out.print(deck.cards[i]+",");
    System.out.println();
    System.out.println(deck.pick(0));
  }
}


/* 7-3 : 매개변수의 타입과 수가 다를때마다 함수이름이 달라지면 사용하는게 불편.
 * 7-4 : b,c,d;
 * 7-5 : Tv() {} 부분 에러. > 상속자에 super();가 자동 생성
 *       super 생성자는 (int price)를 매개변수로 갖으므로 Tv() {super(int);} 지정.
 * 7-6 : 자손 클래스에서 조상 인스턴스 변수의 초기화를 지정하기 위해서.
 * 7-7 : child() > child(1000) > Parent() > Parent(200) > Object() / "x=200" 
 * 7-8 : b
 * 7-9 : c
 * 
 *
 */
