package Main;

public class User {
    private  String uname ;
    private  int uid ;
    private String loc ;
    private  int age ;

    @Override
    public String toString() {
        return "User{" +
                "name='" + uname + '\'' +
                ", id=" + uid +
                ", loc='" + loc + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return uname;
    }

    public void setName(String name) {
        this.uname = name;
    }

    public int getId() {
        return uid;
    }

    public void setId(int id) {
        this.uid = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {

    }
}
