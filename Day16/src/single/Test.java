package single;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        SingleDesign singleDesign = SingleDesign.getInstance();
        SingleDesign singleDesign1 = SingleDesign.newInstance();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int key = 1;
               while (true){
                   try {
                       Thread.sleep(1000);
                       System.out.println("key=" + key++);
                       if (key == 11){
                           key = 1;
                       }
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(System.currentTimeMillis()/1000);
               }
            }
        });
        thread.start();
        int i = 0 ;
        while (true){
            i++;
            System.out.println("厉害了"+ i);
            Thread.sleep(10000);
            if (i == 100)
                break;
        }
    }
}
