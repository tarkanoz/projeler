
import java.util.Scanner;


public class Yolcu implements YurtDışıKUuralları{
    
    private int harc;
    private boolean siyasiyasak;
    private boolean vizedurumu;

    public Yolcu(){
        Scanner tarayıcı = new Scanner(System.in);
         
        System.out.println("Yatırdıgınız harc bedeli : ");
           this.harc =tarayıcı.nextInt();
           tarayıcı.nextLine();
           
        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu(evet yada hayır) :");
        
        String cevap = tarayıcı.nextLine();
        
        if(cevap.equals("evet")){
            this.siyasiyasak = true;
            
        }
        else{
            this.siyasiyasak = false;
        }
        
        System.out.println("vizeniz bulunuyır mu");
        
        String sonuc = tarayıcı.nextLine();
        
        if (sonuc.equals("evet") ) {
            this.vizedurumu = true;
        }
        
        else{
            this.vizedurumu = false; 
        }
    }
    
    
    @Override
    public boolean yurtdisiharcikontrol() {
        if(this.harc < 15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
            return false;
        }
        else{
            System.out.println("Yyurtdışı harc işlemi tamam");
            return true;
        }
    }

    @Override
    public boolean siyasiyasakkontrol() {
        if (this.siyasiyasak == true) {
            System.out.println("Siyasi yasağınız bulunuyır yurtdışına çıkamazsınız");
            return false;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizedurumukontrol() {
        
        if (this.vizedurumu == true) {
            System.out.println("vize işlemleri tamam");
            return true;
        }
        else{
            System.out.println("vizeniz gideceğiniz ülkeye bulunmuyor");
            return false;
        }
        
    }
    
    
    
}
