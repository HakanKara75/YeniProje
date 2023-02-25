package encapsulation;

public class E1 {
    public class Student {
        public int id;
        protected String name;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
    }
/*    Aşağıdakilerden yaparsak class immutable class olur
    A) id ve name variable'larinin access modifierlari private yapılmalı
    B) setId(int id) methodu silinmeli
   */
}
