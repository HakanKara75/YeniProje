package try_catch;

public class T11 {
    public static void main(String[] args) {
        String str = "ASDfgh123";
        System.out.println(solution(str));
    }
    static char solution(String inputString) {
        char result = '5';
        for (int i = 0; i < inputString.length(); i++) {
            try {
                result = (char) Integer.parseInt(inputString.substring(i, i + 1));
                break;
            } catch (NumberFormatException ignored) {
            }
        }
        return result;

/*Sonucta null cikar. sebebi
1- parseInt 2 parametreli calisir. Tek parametre girildiginde hata verebilir ve verince de
kendi bir deger atar.
2- try blogu stringler calisirken bunlari int e ceviremez ve onlarin yerine result icine null atar.

 */
    }
}
