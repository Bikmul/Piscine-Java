package Java.Piscine.day01.ex02;

public class User {
    private int id;
    private String name;
    private int money;

    public User(String name, int money) {
        this.id = UserIdsGenerator.generateId().getId();
        this.name = name;
        this.money = money;
    }
    public void Printinfo() {
        System.out.println(getid() + " - " + getname() + " - " + getmoney());
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getmoney(){
        return money;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setmoney(int money){
        if(money >= 0)
            this.money = money;
        else
            System.out.println("Illigal argument");
    }
}
