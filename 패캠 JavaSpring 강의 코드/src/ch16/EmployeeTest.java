package ch16;

import groovy.json.JsonOutput;

import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("유지영");
        employeeLee.setEmployeeId(134);
        employeeLee.setDepartment("목동");
        System.out.println(employeeLee.getEmployeeName());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.setEmployeeId(142);
        employeeKim.setDepartment("상암");
        System.out.println(employeeKim.getDepartment());


        employeeKim.serialNum++;     //static 변수 활용 예시(공공재 변수)

        System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim.serialNum);
    }

}
