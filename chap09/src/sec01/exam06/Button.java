package sec01.exam06;

public class Button {
	OnclickListener listener;
	
	void serListener(OnclickListener listener) {
		this.listener=listener;
	}  
	
	void click() {
		listener.onClick();
	}
	
	static interface OnclickListener{
		void onClick();
	}
}
