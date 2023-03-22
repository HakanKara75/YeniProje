package mutable_immutable;

public class M {
    public static void main(String[] args) {
        // Immutable (değiştirilemez)
        String str1 = "Hello";
        str1.replace("ll", " World"); // "Hello World" string'i oluşturulur, ancak str1 hala "Hello" olarak kalır.
        System.out.println(str1); // Output: "Hello"

// Mutable (değiştirilebilir)
        StringBuilder str2 = new StringBuilder("Hello");
        str2.append(" World"); // str2 şimdi "Hello World" olarak değiştirildi.
        System.out.println(str2.toString()); // Output: "Hello World"

    }
}
