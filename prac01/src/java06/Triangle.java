package java06;

public class Triangle {
	double garo;
	double sero;
	double t;
	
	public Triangle(double garo,double sero) {
		this.garo=garo;
		this.sero=sero;
	}
	
	public double getGaro() {
		return garo;
	}
	
	public double getSero() {
		return sero;
	}
	
	public double findArea() {
		return garo*sero*0.5;
	}
	
	public boolean isSameArea(Triangle t) {
		if (t.findArea()==findArea())
			return true;
		else
			return false;
	}
}
