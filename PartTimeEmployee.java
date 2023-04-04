class PartTimeEmployee extends Employee
{
    private int hoursworked;

    public PartTimeEmployee(String name, int id, double salary,int hoursworked) {
        super(name, id, salary);
        this.hoursworked = hoursworked;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name=" + name + ","+
                "id=" + id + "," +
                "salary=" + salary + "," +
                "hoursworked=" + hoursworked +
                '}';
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }
}
