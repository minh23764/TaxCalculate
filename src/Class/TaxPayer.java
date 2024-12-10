package Class;

public class TaxPayer {
    private String name;
    private double grossSalary;
    private double netSalary;
    private int type;
    private double tax;
    private double BH;
    private int dependent;
    private double taxedSalary;
    private double salaryBeforeTax;


    public TaxPayer(String name, double grossSalary, int type, int dependent) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.type = type;
        if(this.type == 1){
            this.BH = 10.5;
        }else {
            this.BH = 21.5;
        }
        this.dependent = dependent;
        this.salaryBeforeTax = grossSalary * (100 - BH) / 100;
        this.taxedSalary = Math.round(Math.max(0, salaryBeforeTax - 11 - (4.4 * dependent)) * 1000.0) / 1000.0;
        this.tax = Math.round(taxCal(taxedSalary) * 1000.0) / 1000.0;
        this.netSalary = Math.round((salaryBeforeTax - tax) * 1000.0) / 1000.0 ;
    }

    public double getTax() {
        return tax;
    }
//
//    public float getBHXH() {
//        return BHXH;
//    }
//
//    public float getBHTN() {
//        return BHTN;
//    }
//
//    public float getBHYT() {
//        return BHYT;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if(type == 1|| type == 2)
            this.type = type;
    }

    private double taxCal(double taxedSalary){
        if(taxedSalary <= 5)
            return taxedSalary * 5/100;
        else if (taxedSalary <=10)
            return taxedSalary * 10/100 - 0.25;
        else if(taxedSalary <=18)
            return taxedSalary * 15/100 - 0.75;
        else if (taxedSalary <=32)
            return taxedSalary * 20/100 - 1.65;
        else if (taxedSalary <=52)
            return taxedSalary * 25/100 - 3.25;
        else if (taxedSalary <=80)
            return taxedSalary * 30/100 - 5.85;
        else
            return taxedSalary * 35/100 - 9.85;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n"
                + "Gross Salary: " + this.grossSalary + "tr" + "\n"
                + "Type: " + this.type + "\n"
                + "Dependant: " + this.dependent + "\n"
                + "BH: " + this.BH + "%" + "\n"
                + "Salary Before Tax: " + this.salaryBeforeTax + "tr" + "\n"
                + "Taxed salary: " + this.taxedSalary + "tr" + "\n"
                + "Tax: " + this.tax + "tr" + "\n"
//                + "BHXH: " + this.BHXH + "%" + "\n"
//                + "BHTN: " + this.BHTN + "%" + "\n"
//                + "BHYT: " + this.BHYT + "%" + "\n"
                + "Net Salary: "  + this.netSalary + "tr";
    }
}
