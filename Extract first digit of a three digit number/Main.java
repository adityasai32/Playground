import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=a%10;
      int c=a/100;
      System.out.println(c);
	}
}