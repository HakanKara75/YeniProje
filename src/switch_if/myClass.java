package switch_if;

public class myClass {
    public static void main(String[] args) {
        /*myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
'A' ve 'a' için "İlk Karakter" yazdırınız.
'B' ve 'b' için "İkinci Karakter" yazdırınız.
'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
Diğerleri için "Diğer Karakterleri" yazdırınız. */
switch (harfBul()){
    case 'A', 'a':
        System.out.println("İlk Karakter");
        break;
    case 'B', 'b':
        System.out.println("ikinci Karakter");
        break;
    case 'C', 'c':
        System.out.println("ucuncu Karakter");
        break;
    case 'D', 'd':
        System.out.println("dorduncu Karakter");
        break;
    default:
        System.out.println("diger karakterler");
}


    }

    public static char harfBul(){
        String rastgele= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int indeks=rastgele.length()-1;
        int randomIndeks= (int) (Math.random()*indeks);
        System.out.println(randomIndeks);
        char harf= rastgele.charAt(randomIndeks);
        return harf;
    }
}
