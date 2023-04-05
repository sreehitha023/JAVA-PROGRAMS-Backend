class ContractEmployee extends Employee
{
    private int contractPeriod;

    public ContractEmployee(String name, int id, double salary, int contractPeriod)
    {
        super(name, id, salary);
        this.contractPeriod = contractPeriod;
    }

    public int getContractPeriod()
    {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod = contractPeriod;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name=" + name + "," +
                "id=" + id + "," +
                "salary="+ salary + "," +
                "contractPeriod=" + contractPeriod +
                '}';
    }
}
