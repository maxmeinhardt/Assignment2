//Car Assignment February 6th 2017

public class Car {
		

		//Attributes
		int gear = 1;
		int location;
		int speed = 0;
		final int DESTINATION = 250;
		
	
	
		//Methods
		void reverseGear(){
			gear = -1;
		}
		void gearUp(){ 
			if (gear == 6){
				System.out.println("ERROR: Car in highest gear, cannot increase");
			
			}else if (gear == -1){
				gear = 1;
			
			}else{ 
				gear = gear + 1;
			}
			
		}
		
		void gearDown(){
			if (gear == -1){
				System.out.println("ERROR: Car in lowest gear, cannot decrease");
				
			}else if (gear == 1){
				System.out.println("ERROR: Cannot decrease gear");
			}else{
				gear = gear - 1;
			}
		}
		
		int reportGear(){
			return gear;
		}
		
		int reportLocation(){
			return location;
		}
		
		int reportRemaning(){
			return DESTINATION - location;
		}
	
		
		void moveByTime(int time){
			if (time<0){
				System.out.println("ERROR: Time should be positive.");
			}else if (time>0){
				speed = gear*20;
				int delta = speed*time;
				location = location+delta;
			}
		}
		
		boolean isArrived(){
			if (location >= DESTINATION){
				return false;
			}
			else {
				return true;
			}
		
		
	
		}
}


