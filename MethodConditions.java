
public class MethodConditions {
    static int logic(int x, int y) {
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c;
        c = logic(a , b);
        System.err.println(c);

        int a1 = 30;
        int b1 = 25;
        int c1;
        c1 = logic(a1 , b1);
        System.err.println(c1);

        int a2 = 40;
        int b2 = 15;
        int c2;
        c2 = logic(a2 , b2);
        System.err.println(c2);
    }
}
