package miniproject;

public class Bus {
	int busNo;
	boolean ac;
	int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusNo() {
		return busNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public boolean setAc() {
		return ac;
	}
	public void getAc(boolean val) {
		ac=val;
	}
	 public void displayBusInfo(){
		 System.out.println("Bus No:"+busNo+" Ac:"+ac+" Total Capacity: "+capacity);
		
	}
	

}
