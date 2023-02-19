package encapsulation;

public class Ogretmen {
    //encapsulation sadece sinirlama icin degil yapilan isi daha iyi tanimlamak icin de kullanilir.
    //getter ve setter ile developer a bunlari kullanabilecegi mesaji verilir
    //bunun icin variable lar private yapilip getter ve setterlari tanimlanir.
  private String   isim;
    private String   soyisim;
    private String        brans;

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
