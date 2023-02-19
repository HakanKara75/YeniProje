package encapsulation;

public class Araba {

        String marka= "marka belirtilmedi";
      private   String model="marka belirtilmedi";
      private   String yakit= "dizel";

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
