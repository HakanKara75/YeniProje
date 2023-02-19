package statics;
public class Student {
    String name = "Emily"; int age = 20;
    Student (String name, int age) {
        this.name = name;
        this.age = 22;
        System.out.println(age); //21 once main calistigi icin atanan 21 yasini goruyor
    }
    public static void main(String []args) {
        Student st = new Student("oliver", 21);
        System.out.print(st.name); // oliver
        System.out.print(","+st.age); /* 22 maindeki 21 okuduktan sonra yukari cikar.
        this.age deki atanan 22 degerini alir. */

    }}