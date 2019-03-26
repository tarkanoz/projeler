
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class Main {

    public static void main(String[] args) {
        Scanner tarayıcı = new Scanner(System.in);
        
         String islemler = "İşlemler...\n"+
                           "1. Kare alan hesaplama\n"+
                           "2. Üçgen alan hesaplama\n"+
                           "3. Daire alan hesaplama\n"+
                           "Çıkış : q";
         
         while (true) {            
             System.out.println(islemler);
             System.out.println("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz:");
             String sekil_turu = tarayıcı.nextLine();
             Şekil şekil = null;
             
             if (sekil_turu.equals("q")){
                 System.out.println("Programdan çıkılıyor...");
                 break;
             }
             else if (sekil_turu.equals("1")){
                 System.out.print("Karenin Kenarı :");
                 int kenar = tarayıcı.nextInt();
                 tarayıcı.nextLine();
                 
                 şekil = new Kare("Kare1", kenar);
                 
                 şekil.alanHesapla();
                         
             }
             else if(sekil_turu.equals("2")){
                 System.out.println("kenar 1 : ");
                 int kenar1 = tarayıcı.nextInt();
                 System.out.println("kenar 2 : ");
                 int kenar2 = tarayıcı.nextInt();
                 System.out.println("kenar 3 : ");
                 int kenar3 = tarayıcı.nextInt();
                 tarayıcı.nextLine();
                 şekil = new Ucgen("Üçgen 1", kenar1, kenar2, kenar3);
                 
                 şekil.alanHesapla();
             }
             else if(sekil_turu.equals("3")){
                 System.out.println("Dairenin yarıçapı : ");
                 int yaricap = tarayıcı.nextInt();
                 tarayıcı.nextLine();
                 
                 şekil = new Daire("Daire 1", yaricap);
                 
                 şekil.alanHesapla();
                 
             }
             else {
                 System.out.println("Geçersiz işlem");
             }
        }
        
        
    }
    
}
