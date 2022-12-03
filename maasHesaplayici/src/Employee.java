

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name,double salary, double workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public double tax(){
        return  (salary<1000)?0:(salary*0.03);
    }

    public double bonus(){
        return (workHours<40)?0:((workHours-40)*30);
    }

    public double raiseSalary(){
        double prizeAmount=0;
        int dateDifference=2021-hireYear;

        if(hireYear<10){
            prizeAmount=salary*0.05;
        } else if (9<hireYear&&hireYear<20) {
            prizeAmount=salary*0.10;
        } else if (19<hireYear) {
            prizeAmount=salary*0.15;

        }
        return prizeAmount;
    }
    public String toString(){
        String result= "Calisan Ad Soyad    = " + name +
                "\nSalary              = " + salary +
                "\nWork hours          = " + workHours +
                "\nHire year           = " + hireYear +
                "\nTax                 = " + tax() +
                "\nBonus               = " + bonus() +
                "\nRaise salary        = " + raiseSalary() +
                "\nTotal salary        = " + (salary - tax() + bonus() + raiseSalary());
        return result;
    }














}
