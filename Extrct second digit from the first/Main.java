import java.util.Scanner;
class Main
{
  public static void main(String argd[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int rem = 0;
    while ( n>=10)
    {
     rem = n % 10;
      n = n / 10;
    }
    System.out.println(rem);
  }
} 
                          