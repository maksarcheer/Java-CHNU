package lab1;

public class Demo
{
    public static void main(String[] args)
    {
        Employee.EmployeeBuilder EB = new Employee.EmployeeBuilder();
        EB.setName("Oleg");
        EB.setSurname("Buendok");
        EB.setAge(19);
        EB.setIdCard(1001);
        EB.setNamePosition("Administrator");
        EB.setSalary(20000);
        Employee empl1 = (Employee) EB.build();

        EB.setName("Bogdan");
        EB.setSurname("Mazurok");
        EB.setAge(25);
        EB.setIdCard(10002);
        EB.setNamePosition("Cleaner");
        EB.setSalary(15000);
        Employee empl2 = (Employee) EB.build();

        Client.ClientBuilder CB = new Client.ClientBuilder();
        CB.setName("Matvei");
        CB.setSurname("Mulark");
        CB.setAge(30);
        CB.setPhoneNumber("0993254321");
        CB.setIdOrder(1);
        Client client1 = (Client) CB.build();

        System.out.println(empl1);
        System.out.println(empl2);
        System.out.println(client1);
    }
}
