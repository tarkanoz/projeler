
public abstract class Şekil {
    
    private String isim;
    
    public Şekil(String isim ) {
         this.isim = isim;
    }
    
    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}

