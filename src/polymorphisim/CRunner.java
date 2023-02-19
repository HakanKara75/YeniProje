package polymorphisim;

public class CRunner {
    public static void main(String[] args) {

        C araba= new BMW_314();
        araba.marka();  //BMW
      //   child daki super ile parent dan cagirdik  == > tum arabalarin modeli olur
        araba.model(); //BMW 314
        araba.motorGucu(); //2000
        //   child daki super ile parent dan cagirdik  == > tum arabalarin yakit turu olur
        araba.yakit(); //Benzinli



    }
}
