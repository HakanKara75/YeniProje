package string_builder;

public class C8 {
    public static void main(String[] args) {

        StringBuilder strBld = new StringBuilder("LearnJava");

        strBld.substring(3);
        System.out.println(strBld);// LearnJava

       strBld.insert(0,"You");
            System.out.println(strBld); //YouLearnJava

        strBld.reverse();
      System.out.println(strBld); // avaJnraeL

        strBld.delete(5, 9);
        System.out.println(strBld);    //Learn

    }
}
