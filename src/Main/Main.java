package Main;
import Class.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TaxPayer> employees = new ArrayList<>();
        //type 1: Employee, type 2: EmployeeUser
        employees.add(new TaxPayer("John", 5, 1, 1));
        employees.add(new TaxPayer("Joe", 10, 1, 1));
        employees.add(new TaxPayer("Mike", 18, 1, 1));
        employees.add(new TaxPayer("Ba", 32, 1,1));
        employees.add(new TaxPayer("Smith", 52, 1,1));
        employees.add(new TaxPayer("Joe", 80, 1, 1));
        employees.add(new TaxPayer("Mike", 81, 1,1));

        employees.add(new TaxPayer("John", 82, 2, 1));
        employees.add(new TaxPayer("Smith", 82, 2, 1));
        employees.add(new TaxPayer("Mike", 82, 2, 1));
        int i = 1;
        for (TaxPayer a : employees){
            System.out.println("Employee " + i);
            System.out.println(a.toString());
//            System.out.println("Name: " + a.getName());
//            System.out.println("Gross Salary: " + a.getGrossSalary());
//            System.out.println("Tax: " + a.getTax());
//            System.out.println("BHTN: " +a.getBHTN());
//            if(a.getType() == 1)
//                System.out.println("Type: HT");
//            else if (a.getType() == 2) {
//                System.out.println("Type: ÔĐ - TS");
//            }else{
//                System.out.println("Type: TNLĐ - BNN");
//            }
//            System.out.println("BHXH: " + a.getBHXH());
//            System.out.println("BHYT: " + a.getBHYT());
//            System.out.println("Total Tax: " + (a.getBHTN() + a.getBHYT() + a.getBHXH() + (float)a.getTax()));
//            System.out.println("Net Salary: " + a.getNetSalary());
            i++;
            System.out.println();
        }
        List<TaxPayer> employeeHaveToPayTax = new ArrayList<>();
        for(TaxPayer a : employees){
            if(a.getTax() > 0){
                employeeHaveToPayTax.add(a);
            }
        }
        i = 1;
        for(TaxPayer a : employeeHaveToPayTax){
            System.out.println("Employee " + i);
            System.out.println(a.toString());
            i++;
            System.out.println();
        }
    }
}
