package ch06;

public class q0620 {

  static int[] shuffle(int[] arr) {

    for (int i=0; i<arr.length; i++) {
      int random = (int)(Math.random()*9);
      int temp = arr[i];
      arr[i] = arr[random];
      arr[random] = temp;

    }
    return arr;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] original = {1,2,3,4,5,6,7,8,9};
    System.out.println(java.util.Arrays.toString(original));
    int[] result = shuffle(original);
    System.out.println(java.util.Arrays.toString(result));
  }
}
