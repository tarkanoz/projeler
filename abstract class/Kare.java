
public class Kare extends Şekil{
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + " in alanı : "+ (kenar * kenar));
    }
    
}
