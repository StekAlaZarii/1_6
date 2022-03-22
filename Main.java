import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int a,b,c;
    int max = 0;

    Scanner skaner = new Scanner(System.in);
    System.out.println();
    System.out.print("Podaj liczbę: ");
    a = skaner.nextInt();
    System.out.print("Podaj liczbę: ");
    b = skaner.nextInt();
    System.out.print("Podaj liczbę: ");
    c = skaner.nextInt();
       
    skaner.close();

    if(a>b&&a>c){
      max = a;
    }

    if(b>a&&b>c){
      max = b;
    }

    if(c>a&&c>b){
      max = c;
    }

    System.out.println("Największa liczba to: "+max);
  }
}