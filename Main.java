import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
  public static void main(String[] args) {
 
    double not=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Lütfen Notunuzu Girin");
    try {
    not = Double.parseDouble(br.readLine());
    } catch (NumberFormatException e) {
     
    System.out.println("SAYI GİRİŞ HATASI");
    } catch (IOException e) {
     
    System.out.println("KLAVYE OKUMA HATASI");
    }
     
    if(not<0)
    {
    System.out.println("HATALI NOT");
    }
    else if(not<50)
    {
    System.out.println("KALDI(1)");
    }
    else if (not < 60)
    {
    System.out.println("GEÇER(2)");
    }
    else if (not < 70)
    {
    System.out.println("ORTA(3)");
    }
    else if (not < 85)
    {
    System.out.println("İYİ(4)");
    }
    else if (not <= 100)
    {
    System.out.println("PEKİYİ(5)");
    }
     
    }
    
}
  