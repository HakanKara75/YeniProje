public class VariablesScope01 {

    static int x = 10;
    int xx=200;
    private int y = 20;

    public void method(int x){
        VariablesScope01 v = new VariablesScope01();
        this.x = 30;
        y = 40;

        System.out.println("Local value of x: "+ v.x);
        System.out.println("Global value of y: "+ v.y);
        System.out.println("Local value of y: "+ y);

    }
    public void methods(int xx){
        this.xx=xx;
    }
    public static void main(String[] args) {
        VariablesScope01 v = new VariablesScope01();
        v.method(5);
        System.out.println("Instance value of xx: "+v.xx);
        v.methods(5);
        System.out.println("Instance value of xx: "+v.xx);


    }
    }


