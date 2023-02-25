package try_catch;

public class T3 {

        public static void main(String[] args) {
            int arr[] = {9, 8, 7, 6};
            try {
                System.out.print("Good");
                System.out.print(arr[4]);
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.print("Better");



                String s1 = null;
                try{
                    System.out.println(s1.length());
                    System.out.print("Good");
                }catch(NullPointerException i) {
                    System.out.print("Better");

                    String s = "123";
                    System.out.println(s + 1); // A
                    int num = Integer.parseInt(s);
                    System.out.println(num + 1); // B


                    String s2 = "abc";
                    try{
                        System.out.println(Integer.parseInt(s2));
                    }catch(NullPointerException f) {
                        System.out.print("Better");
                    }catch(NumberFormatException f) {
                        System.out.print("The Best");
                    }
            }
        }
        }
}


