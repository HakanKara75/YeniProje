package overriding_overloading.overriding4;

public class Test extends Test06 {
//        @Override
//        protected int go() //access modifier daraltilmis, public olmaliydi
//            return 12;
//        }
        public static void main(String args[]) {
            Test obj = new Test();
            obj.go();
        }
    }