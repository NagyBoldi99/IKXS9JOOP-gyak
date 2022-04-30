package feladatok;

public class alkalmazott {

	
	private String name;
    private int salary;

    public void increaseSalary(int amount) {
        salary += amount;
    }

    public int tax() {
        return (int) (0.16 * salary);
    }

    public boolean isSalaryInRange(int min, int max) {
        return salary >= min && salary <= max;
    }

    public boolean isSalaryGreater(alkalmazott employee) {
        return salary > employee.getSalary();
    }

    public alkalmazott(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "alkalmazott [name=" + name + ", salary=" + salary + ", tax()=" + tax() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
