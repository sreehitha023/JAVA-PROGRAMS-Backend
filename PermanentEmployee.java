class PermanentEmployee extends Employee {
    private double bonus;

    public PermanentEmployee(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "name=" + name + ","+
                "id=" + id + "," +
                "salary=" + salary+ "," +
                "bonus=" + bonus +
                '}';
    }
}
