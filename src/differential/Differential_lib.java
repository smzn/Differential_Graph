package differential;

public class Differential_lib {
	private double h,c;

	public Differential_lib(double h, double c) {
		this.h = h;
		this.c = c;
	}
	
	public double getRx(double value) {
		return c * Math.cos(c * value);
	}
	
	public double getDx(double value) {
		return (Math.sin(c * (value + h)) - Math.sin(c * value))/h;
	}
}
