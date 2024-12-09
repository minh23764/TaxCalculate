package Class;

public class TaxPayer {
    private String name;
    private float grossSalary;
    private float netSalary;
    private int type;
    private int tax ;
    private float BHXH;
    private float BHTN;
    private float BHYT;

    public TaxPayer(String name, float grossSalary, int type) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.type = type;
        this.tax = taxCal(grossSalary);
        if(this.type == 1){
            this.BHTN = 1;
            this.BHYT = 1.5f;
            this.BHXH = 8;
        }else {
            this.BHTN = 1;
            this.BHYT = 3;
            this.BHXH = 14;
        }
        this.netSalary = (grossSalary * (100 - BHTN - BHYT - BHXH) / 100) * (100 -tax) /100;
    }

    public int getTax() {
        return tax;
    }

    public float getBHXH() {
        return BHXH;
    }

    public float getBHTN() {
        return BHTN;
    }

    public float getBHYT() {
        return BHYT;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(float grossSalary) {
        this.grossSalary = grossSalary;
    }

    public float getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(float netSalary) {
        this.netSalary = netSalary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if(type > 3 || type < 1)
            this.type = type;
    }

    private int taxCal(float grossSalary){
        if(grossSalary <= 5)
            return 5;
        else if (grossSalary >5 & grossSalary <=10)
            return 10;
        else if(grossSalary > 10 & grossSalary <=18)
            return 15;
        else if (grossSalary > 18 & grossSalary <=32)
            return 20;
        else if (grossSalary > 32 & grossSalary <=52)
            return 25;
        else if (grossSalary > 52 & grossSalary <=80)
            return 30;
        else
            return 35;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n"
                + "Gross Salary: " + this.grossSalary + "tr" + "\n"
                + "Type: " + this.type + "\n"
                + "Tax: " + this.tax + "%" + "\n"
                + "BHXH: " + this.BHXH + "%" + "\n"
                + "BHTN: " + this.BHTN + "%" + "\n"
                + "BHYT: " + this.BHYT + "%" + "\n"
                + "Total Tax: " + (this.BHTN + this.BHYT + this.BHXH + (float)this.tax) + "%" + "\n"
                + "Net Salary: "  + this.netSalary + "tr";
    }
}
