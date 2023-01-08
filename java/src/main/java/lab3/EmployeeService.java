package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> emplList;

    public EmployeeService(List<Employee> emplList) {
        this.emplList = emplList;
    }

    public List<Employee> getEmplList() {
        return emplList;
    }

    public void setEmplList(List<Employee> emplList) {
        this.emplList = emplList;
    }
    public List<Employee> getEmployeesByPosition(String position)
    {
        return emplList.stream().filter(employee -> position.equals(employee.namePosition)).collect(Collectors.toList());
    }
    public List<Employee> getEmployeesBySalary(int salary)
    {
        return emplList.stream().filter(employee -> salary == employee.salary).collect(Collectors.toList());
    }
    public List<Employee> getEmployeesByName(String name)
    {
        List<Employee> res = new ArrayList<>();
        for(Employee emp : getEmplList())
        {
            if(emp.getPerson().getName().equals(name))
            {
                res.add(emp);
            }
        }
        return res;
    }
    public List<Employee> getEmployeesBySurname(String surname)
    {
        List<Employee> res = new ArrayList<>();
        for(Employee emp : getEmplList())
        {
            if(emp.getPerson().getSurname().equals(surname))
            {
                res.add(emp);
            }
        }
        return res;
    }
    public List<Employee> getEmployeesIdCard(int idCard)
    {
        List<Employee> res = new ArrayList<>();
        for(Employee emp : getEmplList())
        {
            if(emp.getIdCard() == idCard)
            {
                res.add(emp);
            }
        }
        return res;
    }
}
