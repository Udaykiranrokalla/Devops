public abstract  class Cars {

	abstract void cartype();
	abstract void noofseats();
	abstract void mileage();
}
class HondaCity extends Cars {

	void cartype() {
		System.out.println("car type:diesel");
	}
	void noofseats() {	
		System.out.println("no of seats:6");
	}

	void mileage() {
		System.out.println("mileage:38");
	}
}

class WagonR extends Cars {
	void cartype() {
		System.out.println("car type:petrol");	
	}

	void noofseats() {
	System.out.println("no of seats:5");
		
	}
	void mileage() {
		System.out.println("mileage:30");
		}
	
}

class Innova extends Cars {
	void cartype() {
		System.out.println("car type:diesel");
	}
	void noofseats() {
		
		System.out.println("no of seats:4");
	}
	void mileage() {
		System.out.println("mileage:25");
	}
}


class Fetch  {
	public static void main(String args[]) {
		WagonR w= new WagonR();
		w.cartype();
		w.mileage();
		w.noofseats();
		HondaCity h= new HondaCity();
		h.cartype();
		h.mileage();
		h.noofseats();
		Innova i= new Innova();
		i.cartype();
		i.mileage();
		i.noofseats();
	}
}