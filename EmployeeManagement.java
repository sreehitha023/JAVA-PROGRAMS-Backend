import java.util.*;
class EmployeeManagement {
    private Hashtable<Integer, Employee> employees;

    public EmployeeManagement() {
        employees = new Hashtable<Integer, Employee>();
    }

    public void addEmployee(Employee employee)
    {
        employees.put(employee.getId(), employee);
    }

    public void modifyEmployee(Employee employee)
    {
        if(employees.containsKey(employee.getId()))
        {
            employees.put(employee.getId(),employee);
            System.out.println("Employee modified");
            System.out.println(employees);
        }
        else
        {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(int id)
    {
        if(employees.containsKey(id)){
            employees.remove(id);
            System.out.println("Employee removed");
        }
        else
        {
            System.out.println("Employee not found.");
        }
    }

    public void searchEmployee(int id)
    {
        if(employees.containsKey(id)){
            System.out.println(employees.get(id));
        }
        else
        {
            System.out.println("Employee not found.");
        }
    }
}
