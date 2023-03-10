package if_statement;

import java.util.ArrayList;
import java.util.List;

public class A10 {
    public static void main(String[] args) {
    List<String > names= new ArrayList<>();
        names.add("Hakan");
        names.add("Kemal");
        names.add("Merve");
        names.add("Selin");
        names.add("Yusuf");

        if (names.removeIf(name -> names.size() < 5 && name.equals("Hakan"))){
        names.remove("Yusuf");
    }
        System.out.println("Ilk if sonucu : "+names);

        if (names.removeIf(name -> names.size() < 10 && name.equals("Hakan"))){
        names.remove("Yusuf");
    }
        System.out.println("Ikinci if sonucu : "+names);
}

}

