package web;

public class EmpBean {

    private String name = null;
    private int age = 0;

    //ageを取得
    public int getAge() {
        return age;
    }

    //引数をカプセル化したageに代入
    public void setAge(int age) {
        this.age = age;
    }

    //nameを取得
    public String getName() {
        return name;
    }

    //引数をカプセル化したnameに代入
    public void setName(String name) {
        this.name = name;
    }


}
