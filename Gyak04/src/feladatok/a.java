package feladatok;

public class a {

	
	public static void main(String[] args) {
        alkalmazott[] emps = { new alkalmazott("Levente Fazekas", 100), new alkalmazott("Baksa Erika Varga", 150),
                new alkalmazott("Charles Heavy", 450), new alkalmazott("Balage Bolyki", 10),
                new alkalmazott("Laszlo Smid", 120) };
        printalkalmazottak(emps);
        System.out.println("Largest salary: " + largestSalary(emps));
        System.out.println("Nr. of salaries between 100 and 200: " + cntEmpsSalaryInterval(emps, 100, 200));
        System.out.println("Average salary: " + avgSalary(emps));
        System.out.println("Total tax to pay: " + sumTax(emps));

    }

    public static void printalkalmazottak(alkalmazott[] emps) {
        for (alkalmazott emp : emps) {
            System.out.println(emp);
        }
    }

    public static alkalmazott largestSalary(alkalmazott[] emps) {
        alkalmazott max = emps[0];
        for (int i = 1; i < emps.length; i++) {
            if (emps[i].isSalaryGreater(max)) {
                max = emps[i];
            }
        }
        return max;
    }

    public static int cntEmpsSalaryInterval(alkalmazott[] emps, int min, int max) {
        int cnt = 0;
        for (alkalmazott emp : emps) {
            if (emp.isSalaryInRange(min, max)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static double avgSalary(alkalmazott[] emps) {
        double avg = 0;
        for (alkalmazott emp : emps) {
            avg += emp.getSalary();
        }
        return avg / (double) emps.length;
    }

    public static int sumTax(alkalmazott[] emps) {
        int tax = 0;
        for (alkalmazott emp : emps) {
            tax += emp.tax();
        }
        return tax;
    }

}
