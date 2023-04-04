import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<PermanentEmployee> permanentEmployeeArrayList=new ArrayList<>();
        ArrayList<PartTimeEmployee> partTimeEmployeeArrayList=new ArrayList<>();
        ArrayList<ContractEmployee> contractEmployeeArrayList=new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();

        while (true) {
            // Display menu options
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add employee");
            System.out.println("2. Modify employee");
            System.out.println("3. Delete employee");
            System.out.println("4. List all employee");
            System.out.println("5. Search for employee");
            System.out.println("6. Exit");

            // Get user input
            System.out.print("\nEnter your choice (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add employee
                    System.out.println("\nAdd Employee");
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();

                    System.out.println("\nChoose employee type:");
                    System.out.println("1. Permanent");
                    System.out.println("2. Part-time");
                    System.out.println("3. Contract");
                    System.out.print("Enter employee type (1-3): ");
                    int employeeType = scanner.nextInt();

                    Employee employee;
                    switch (employeeType) {
                        case 1:
                            // Permanent employee
                            System.out.print("Enter bonus amount: ");
                            double bonus = scanner.nextDouble();
                            PermanentEmployee Permanent = new PermanentEmployee(name, id, salary, bonus);
                            permanentEmployeeArrayList.add(Permanent);
                            System.out.println(permanentEmployeeArrayList);
                            management.addEmployee(Permanent);
                            break;
                        case 2:
                            // Part-time employee
                            System.out.print("Enter hours worked : ");
                            int hoursworked = scanner.nextInt();
                            PartTimeEmployee Parttime = new PartTimeEmployee(name, id, salary,hoursworked);
                            partTimeEmployeeArrayList.add(Parttime);
                            System.out.println(partTimeEmployeeArrayList);
                            management.addEmployee(Parttime);
                            break;
                        case 3:
                            // Contract employee
                            System.out.print("Enter contract duration (in months): ");
                            int duration = scanner.nextInt();
                            ContractEmployee Contract = new ContractEmployee(name,id,salary,duration);
                            contractEmployeeArrayList.add(Contract);
                            System.out.println(contractEmployeeArrayList);
                            management.addEmployee(Contract);
                            break;
                        default:
                            System.out.println("Invalid employee type.");
                            continue;
                    }
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    // Modify employee
                    System.out.println("\nModify Employee");
                    System.out.println("Select type of employee: ");
                    System.out.println("1.Permanent Employee");
                    System.out.println("2.Parttime Employee");
                    System.out.println("3.Contract Employee");
                    int select = scanner.nextInt();
                    if(select==1)
                    {
                        System.out.print("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (int i = 0; i < permanentEmployeeArrayList.size(); i++)
                        {
                            if (permanentEmployeeArrayList.get(i).getId()==id)
                            {
                                System.out.println("Enter new name: ");
                                scanner.nextLine();
                                name = scanner.nextLine();
                                System.out.print("Enter new salary: ");
                                salary = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Enter new bonus amount: ");
                                double bonus = scanner.nextDouble();

                                PermanentEmployee permanentEmployee = new PermanentEmployee(name, id, salary, bonus);
                                permanentEmployeeArrayList.set(i, permanentEmployee);
                                management.modifyEmployee(permanentEmployee);
                            }
                        }

                    } else if (select==2)
                    {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (int i = 0; i < partTimeEmployeeArrayList.size(); i++)
                        {
                            if (partTimeEmployeeArrayList.get(i).getId()==id)
                            {
                                System.out.println("Enter new name: ");
                                scanner.nextLine();
                                name=scanner.nextLine();
                                System.out.println("Enter new salary: ");
                                salary = scanner.nextDouble();
                                System.out.println("Enter new workedhours: ");
                                int workedhours = scanner.nextInt();

                                PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name,id,salary,workedhours);
                                partTimeEmployeeArrayList.set(i,partTimeEmployee);
                                management.modifyEmployee(partTimeEmployee);
                            }

                        }

                    }
                    else
                    {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (int i = 0; i < contractEmployeeArrayList.size(); i++)
                        {
                            if (contractEmployeeArrayList.get(i).getId()==id)
                            {
                                System.out.println("Enter new name: ");
                                scanner.nextLine();
                                name=scanner.nextLine();
                                System.out.println("Enter new salary: ");
                                salary = scanner.nextDouble();
                                System.out.println("Enter new contractperiod: ");
                                int contractperiod = scanner.nextInt();
                                ContractEmployee contractEmployee = new ContractEmployee(name,id,salary,contractperiod);
                                contractEmployeeArrayList.set(i,contractEmployee);
                                management.modifyEmployee(contractEmployee);
                            }

                        }
                    }
                    break;
                case 3:
                    // Delete employee
                    System.out.println("\nDelete Employee");
                    System.out.println("Select type of employee:");
                    System.out.println("1.Permanent Employee");
                    System.out.println("2.Parttime Employee");
                    System.out.println("3.Contract Employee");
                    int select1=scanner.nextInt();

                    if(select1==1)
                    {
                    System.out.print("Enter employee ID: ");
                    int Permanentid = scanner.nextInt();
                    for (int i = 0; i < permanentEmployeeArrayList.size(); i++)
                    {
                        if (permanentEmployeeArrayList.get(i).getId() == Permanentid)
                        {
                            permanentEmployeeArrayList.remove(permanentEmployeeArrayList.get(i));
                        }
                    }
                        System.out.println(permanentEmployeeArrayList);
                        management.deleteEmployee(Permanentid);
                    }
                    else if (select1==2)
                    {
                        System.out.println("Enter employee ID: ");
                        int PartTimeid = scanner.nextInt();
                        for (int i = 0; i < partTimeEmployeeArrayList.size(); i++)
                        {
                            if (partTimeEmployeeArrayList.get(i).getId()== PartTimeid)
                            {
                                partTimeEmployeeArrayList.remove(partTimeEmployeeArrayList.get(i));
                            }

                        }
                        System.out.println(partTimeEmployeeArrayList);
                        management.deleteEmployee(PartTimeid);
                    }
                    else
                    {
                        System.out.println("Enter employee ID: ");
                        int Contractid = scanner.nextInt();
                        for (int i = 0; i < contractEmployeeArrayList.size(); i++)
                        {
                         if (contractEmployeeArrayList.get(i).getId()==Contractid)
                         {
                             contractEmployeeArrayList.remove(contractEmployeeArrayList.get(i));
                         }
                            System.out.println(contractEmployeeArrayList);
                            management.deleteEmployee(Contractid);
                        }

                }

                    break;

                case 4:
                    System.out.println("\nList of all Employees");
                    System.out.println("Select the type of employee");
                    System.out.println("1.Permanent Employee");
                    System.out.println("2.PartTime Employee");
                    System.out.println("3.Contract Employee");
                    int option = scanner.nextInt();
                    if(option == 1)
                    {
                        System.out.println(permanentEmployeeArrayList);
                    } else if (option == 2)
                    {
                        System.out.println(partTimeEmployeeArrayList);
                    }
                    else
                    {
                        System.out.println(contractEmployeeArrayList);
                    }
                    break;

                case 5:
                    // Search for employee
                    System.out.println("\nSearch for Employee");
                    System.out.println("Select the type of employee");
                    System.out.println("1.Permanent employee");
                    System.out.println("2.Parttime employee");
                    System.out.println("3.Contract employee");
                    int choose = scanner.nextInt();
                    if(choose == 1) {
                        System.out.print("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (int i = 0; i < permanentEmployeeArrayList.size(); i++) {
                            if (permanentEmployeeArrayList.get(i).getId() == id) {
                                management.searchEmployee(id);
                            }
                        }
                    } else if (choose == 2)
                    {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (int i = 0; i < partTimeEmployeeArrayList.size(); i++) {
                            if(partTimeEmployeeArrayList.get(i).getId()==id){
                                management.searchEmployee(id);
                            }

                        }

                    }
                    else {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (int i = 0; i < contractEmployeeArrayList.size(); i++) {
                            if (contractEmployeeArrayList.get(i).getId()==id){
                                management.searchEmployee(id);
                            }

                        }

                    }
                    break;

                case 6:
                    // Exit program
                    System.out.println("\nExiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
