import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Hashtable<Integer,PermanentEmployee> permanentEmployeeHashtable = new Hashtable<>();
        Hashtable<Integer,PartTimeEmployee> partTimeEmployeeHashtable = new Hashtable<>();
        Hashtable<Integer,ContractEmployee> contractEmployeeHashtable = new Hashtable<>();

        Scanner scanner = new Scanner(System.in);

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


                    switch (employeeType) {
                        case 1:
                            // Permanent employee
                            System.out.print("Enter bonus amount: ");
                            double bonus = scanner.nextDouble();
                            PermanentEmployee Permanent = new PermanentEmployee(name, id, salary, bonus);
                            permanentEmployeeHashtable.put(id,Permanent);
                            System.out.println(permanentEmployeeHashtable);
                            break;
                        case 2:
                            // Part-time employee
                            System.out.print("Enter hours worked : ");
                            int hoursworked = scanner.nextInt();
                            PartTimeEmployee Parttime = new PartTimeEmployee(name, id, salary,hoursworked);
                            partTimeEmployeeHashtable.put(id,Parttime);
                            System.out.println(partTimeEmployeeHashtable);
                            break;

                        case 3:
                            // Contract employee
                            System.out.print("Enter contract duration (in months): ");
                            int duration = scanner.nextInt();
                            ContractEmployee Contract = new ContractEmployee(name,id,salary,duration);
                            contractEmployeeHashtable.put(id,Contract);
                            System.out.println(contractEmployeeHashtable);
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
                        for(Map.Entry<Integer,PermanentEmployee>e:permanentEmployeeHashtable.entrySet())
                        {
                            if (e.getKey()==id)
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
                                permanentEmployeeHashtable.put(id,permanentEmployee);
                                System.out.println(permanentEmployeeHashtable);

                            }
                        }

                    } else if (select==2)
                    {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (Map.Entry<Integer,PartTimeEmployee>e:partTimeEmployeeHashtable.entrySet())
                        {
                            if (e.getKey()==id)
                            {
                                System.out.println("Enter new name: ");
                                scanner.nextLine();
                                name=scanner.nextLine();
                                System.out.println("Enter new salary: ");
                                salary = scanner.nextDouble();
                                System.out.println("Enter new workedhours: ");
                                int workedhours = scanner.nextInt();

                                PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name,id,salary,workedhours);
                                partTimeEmployeeHashtable.put(id,partTimeEmployee);
                                System.out.println(partTimeEmployeeHashtable);

                            }

                        }

                    }
                    else
                    {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (Map.Entry<Integer,ContractEmployee>e:contractEmployeeHashtable.entrySet())
                        {
                            if (e.getKey()==id)
                            {
                                System.out.println("Enter new name: ");
                                scanner.nextLine();
                                name=scanner.nextLine();
                                System.out.println("Enter new salary: ");
                                salary = scanner.nextDouble();
                                System.out.println("Enter new contractperiod: ");
                                int contractperiod = scanner.nextInt();
                                ContractEmployee contractEmployee = new ContractEmployee(name,id,salary,contractperiod);
                                contractEmployeeHashtable.put(id,contractEmployee);
                                System.out.println(contractEmployeeHashtable);

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
                    for (Map.Entry<Integer,PermanentEmployee>e:permanentEmployeeHashtable.entrySet())
                    {
                        if (e.getKey() == Permanentid)
                        {
                            permanentEmployeeHashtable.remove(Permanentid);
                        }
                    }
                        System.out.println(permanentEmployeeHashtable);

                    }
                    else if (select1==2)
                    {
                        System.out.println("Enter employee ID: ");
                        int PartTimeid = scanner.nextInt();
                        for (Map.Entry<Integer,PartTimeEmployee> e:partTimeEmployeeHashtable.entrySet())
                        {
                            if (e.getKey()== PartTimeid)
                            {
                                partTimeEmployeeHashtable.remove(PartTimeid);
                            }

                        }
                        System.out.println(partTimeEmployeeHashtable);

                    }
                    else
                    {
                        System.out.println("Enter employee ID: ");
                        int Contractid = scanner.nextInt();
                        for (Map.Entry<Integer,ContractEmployee>e:contractEmployeeHashtable.entrySet())
                        {
                         if (e.getKey()==Contractid)
                         {
                             contractEmployeeHashtable.remove(Contractid);
                         }
                            System.out.println(contractEmployeeHashtable);

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
                        System.out.println(permanentEmployeeHashtable);

                    } else if (option == 2)
                    {
                        System.out.println(partTimeEmployeeHashtable);

                    }
                    else
                    {
                        System.out.println(contractEmployeeHashtable);
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
                        for (Map.Entry<Integer,PermanentEmployee>e:permanentEmployeeHashtable.entrySet()) {
                            if (e.getKey()== id) {
                                System.out.println(partTimeEmployeeHashtable);

                            }
                        }
                    } else if (choose == 2)
                    {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (Map.Entry<Integer,PartTimeEmployee>e:partTimeEmployeeHashtable.entrySet()) {
                            if(e.getKey()==id){
                                System.out.println(partTimeEmployeeHashtable);

                            }

                        }

                    }
                    else {
                        System.out.println("Enter employee ID: ");
                        id = scanner.nextInt();
                        for (Map.Entry<Integer,ContractEmployee>e:contractEmployeeHashtable.entrySet()) {
                            if (e.getKey()==id){
                                System.out.println(contractEmployeeHashtable);
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
