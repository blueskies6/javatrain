package extend;

public class Manage extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        int basesalary = super.getSalary();
        return basesalary+bonus;
    }

    public  Manage(String name, int sex, int salary, int bonus)
    {
        super(name, sex, salary);
        this.bonus= (int) (bonus * Math.random());
    }
}
