package design;

public abstract class EmployeePro implements Employee {

    public int empId;
    String empName;

    public int employeeId(){
    return empId;
    }
    public String employeeName(){
        return empName;
    }
    public void assignDepartment(){

    }

    public void benefitLayout(){

    }

    public void worktime() {
        System.out.println("Employees should work 8 hours monday to thursday");
    }

}
