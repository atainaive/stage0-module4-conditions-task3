package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double afterTaxes = 0;

        if (salary <= 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            afterTaxes = salary - (0.15 * salary);
            System.out.println(afterTaxes);
        } else if (salary > 10000 && salary <= 20000) {
            afterTaxes = salary - (0.18 * salary);
            System.out.println(afterTaxes);
        } else if (salary > 20000) {
            afterTaxes = salary - (0.2 * salary);
            System.out.println(afterTaxes);
        }
    }
}
