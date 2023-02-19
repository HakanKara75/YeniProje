package ternary;

public class A8 {
    public static void main(String[] args) {
        String str1 = "ali";
        String str2 = "Ali";

      System.out.println(str1==str1);

       System.out.println(str1.equals(str2));

       System.out.println((str1+str2).equals(str2+str1));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str1);
    }
}
