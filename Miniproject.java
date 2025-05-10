package miniproject;
import java.util.*;
public class Miniproject{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,34));
		buses.add(new Bus(3,true,67));
		int useropt=1;
		Scanner sc=new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
//		int useropt=1;
//		Scanner sc=new Scanner(System.in);
		while(useropt==1) {
			System.out.println("Enter 1 to book and 2 to exit");
			useropt=sc.nextInt();
			if(useropt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed...thankyou for booking");
					
					
				}
				else{
					System.out.println("sorry..Bus is full..try for another date or busNo");
					
				}
			}
		}
		

	}

}
