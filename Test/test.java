import java.util.Random;

class Test {
  public static void main (String[] args) {
    int i = 0;
    Random rand = new Random();
    while (i < 10) {
      int A = 0;
      double rand_dub1 = 2 * rand.nextDouble();
      System.out.println("AAAAAAAA Random number is : " + rand_dub1);
      A += rand_dub1;
      System.out.println(A);
      i++;
    }
  }

}
