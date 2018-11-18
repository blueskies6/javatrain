package extend;

public abstract class Person {
    public Person(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }
    public Person()
    {

    }
    private String name;
    private  int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    /**
     *描述一个人
     *
     */
    public abstract String getDescription()
    {

    }
}
