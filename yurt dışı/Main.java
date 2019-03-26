
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökcen Havalimanına HoşGeldiniz");
    
        String sartlar = "Yurtdışı çıkış kuralları....\n"
                          +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor..\n"
                          +"15 tl harc bedelini tam olarak yatırmanız gerekiyor...\n"
                          +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...." ;
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
        
        while (true) {
            System.out.println("*********************************************");
            System.out.println(message);
            System.out.println("**********************************************");
            System.out.println(sartlar);
            
         Yolcu yolcu = new Yolcu();
         
            System.out.println("harc bedeli kontrol ediliyor");
            
            Thread.sleep(3000);
            if (yolcu.yurtdisiharcikontrol() == false) {
                System.out.println(message);
                continue;
              }
            System.out.println("Siyasi yasak kontrol ediliyor");
            
            Thread.sleep(3000);
            if(yolcu.siyasiyasakkontrol()  == false){
                System.out.println(message);
                continue;
                }
            System.out.println("Vize durumu kontrol ediliyor");
            
            Thread.sleep(3000);
            if(yolcu.vizedurumukontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İişemleriniz Tamam! Yurtdışına Çıkabilirsiniz");
            break;
        }
    
    
    
    }
}
