package myPackage.first;

public class Number {

	private static final double epsilon=0.001;
	private double num;
	public Number(double num)
	{
		this.num=num;
	}
	public boolean isEqual(double num) {
        return Math.abs(num - this.num) < epsilon;
    }
	@Override
	public String toString() {
		return "Number [num=" + num + "]";
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	
}
