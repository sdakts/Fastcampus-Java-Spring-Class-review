package ch16;

public class Employee {
    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public int getEmployeeId(){     //1번--Id 출력용 함수: employeeId 변수가 private 이기 때문
        return employeeId;
    }
    public void setEmployeeId(int employeeId){   //2번
        this.employeeId = employeeId;
    }
    public String getEmployeeName(){   //3번
        return employeeName;
    }
    public void setEmployeeName(String employeeName){  //4번
        this.employeeName = employeeName;
    }
    public String getDepartment(){  //5번
        return department;
    }
    public void setDepartment(String department){  //6번
        this.department = department;
    }
}
