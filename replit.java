import java.util.Scanner;

class Main {
  static int sayi1;
  public static void main(String[] args) {
    
    try (Scanner okuyucu = new Scanner(System.in)) {
        
        System.out.println("1. sayiyi giriniz");
        sayi1=okuyucu.nextInt();
    }
    System.out.println("İşlemin sonucu: ");
  }
}
