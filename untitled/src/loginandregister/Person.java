package loginandregister;

public class Person {
    private  String name ;
    private  String user ;
    private  String passworld ;
    private  long score ;

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "user='" + user + '\'' +
                '}';
    }

    public String deepToString() {
        return "name" + name  + "user" + user +"passworld" + passworld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public Person() {

    }

    public Person(String name, String user, String passworld) {

        this.name = name;
        this.user = user;
        this.passworld = passworld;
    }
}
