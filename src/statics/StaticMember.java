package statics;
public class StaticMember {
    static int x;
    int y;
    StaticMember(){
        x+=2;
        y++;
    }
    static int getSquare(){
        return x*x; // 4
    }
    public static void main(String[] args) {
        StaticMember sm1=new StaticMember();
        StaticMember sm2=new StaticMember();
        int z=sm1.getSquare(); // 4*4=16
        System.out.println("-x"+z +"-y"+sm2.y); //-x16-y1

    }
}
