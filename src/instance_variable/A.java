package instance_variable;

public class A {

    public void main(String[] args) {
        //First Object
        Instance obj1 = new Instance();
        obj1.variable = 99;

        //Second Object
        Instance obj2 = new Instance();
        obj2.variable = 11;

        System.out.println("Marks for first Object:" +obj1.variable);
        System.out.println("Marks for second Object:" +obj2.variable);
    }
    public class Instance{

        public int variable;
    }
}
