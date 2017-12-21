import Util.Interf;
import Util.Tool;

public class Test {
    public static void main(String[] args) {
        A a = new B();
        B b = new B () ;
        a.fun(100,50);
        b.fun(100,50);

        Tool.realWay(new Interf() {
            @Override
            public void wayFromInter(Util.Test test) {
                System.out.println("厉害得不行");
            }
        });
    }
}

class  A  {
    public void fun(int a , int b){
        System.out.println(a - b);
    }
}

class  B extends  A {
    @Override
    public void fun(int a, int b) {
        System.out.println(a + b);
    }
}