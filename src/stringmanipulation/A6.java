package stringmanipulation;

public class A6 {
    public static void main(String[] args) {
 /*       Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
        her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
                Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.   */

            String input = "Ali\n" +
                    "Veli Han\n" +
                    "Kemal Can Kuzu";
            String rev = "";
            String[] lines = input.split(System.getProperty("line.separator"));
            for(String w : lines) {
                String[] words = w.split(" ");
                for (int i = words.length - 1; i >= 0; i--) {
                    if (i != 0) {
                        rev = rev + words[i] + " ";
                    } else {
                        rev = rev + words[i];
                    }
                }
                System.out.println(rev);
                rev="";
    }
}
}