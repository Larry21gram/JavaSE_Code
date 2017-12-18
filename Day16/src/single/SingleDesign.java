package single;

public class SingleDesign {
    private String name ;
    private int age;
    private String gander;

    private  static SingleDesign singleDesign =  new SingleDesign("zhangSan",22,"man");
    private  static  SingleDesign singleDesign2 = null;

    private SingleDesign(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    public static SingleDesign newInstance(){
        return singleDesign;
    }

    //懒汉式， 没有用时是空，用了就是非空。
    public static SingleDesign getInstance(){
        if (singleDesign2 == null){
            singleDesign2 = new SingleDesign("zhangSan",22,"man");
        }
        return singleDesign2;
    }
}
