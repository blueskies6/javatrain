package extend;

public class Employee extends Person {

    private int salary;

    public Employee(String name, int sex, int salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    @Override
    public String getDescription() {
        return ;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setSalary(int salary,int pyDeal)
    {
        this.salary = salary + pyDeal;
    }

}
