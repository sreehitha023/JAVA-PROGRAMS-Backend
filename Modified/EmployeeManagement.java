import java.util.*;
class EmployeeManagement implements EmployeeManagementInterface{
    public static Hashtable<Integer, Employee> employees;

    public EmployeeManagement() {
        employees = new Hashtable<>();
    }
@Override
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
            System.out.println();
        }
        else
        {
            System.out.println("Employee not found.");
        }
    }


}
