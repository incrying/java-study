package sec06.exam06;

public class CarExample {
	public static void main(String[] args) {
		
		Car mycar = new Car();
		mycar.setSpeed(60);
		System.out.println("현재 속도: "+mycar.getSpeed());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		System.out.println("현재 속도: "+mycar.getSpeed());
	}
}
