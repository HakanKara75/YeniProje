package stringmanipulation;

public class A7 {
    public static void main(String[] args) {
        String str = "seyhan yavuz";

                System.out.println(str.replace("s", "S"));
        System.out.println(str.replace("y", "Y"));

         System.out.println(str.replaceAll("s", "S"));
        System.out.println(str.replaceAll("y", "Y"));

      System.out.println(str.replace('s', 'S'));
        System.out.println(str.replace('y', 'Y'));

//        System.out.println(str.replaceAll('s', 'S'));
//        System.out.println(str.replaceAll('y', 'Y'));

    }
}
