
public class Robot {

	private int id;
	
	//you can declare classes within other classes
	private class Brain {
		
		//Brain will have access to data of Robot
		
		public void think(){
			System.out.println("Robot number " + id + " is thinking.");
		}
	}
	
	//here's another inner class:
	static class Battery{
		public void charge(){
			System.out.println("Battery is charging.");
		}
	}

	public Robot(int id) {
		//super();
		this.id = id;
	}
	
	public void start(){
		System.out.println("Robot starting: " + id);
		
		Brain brain1 = new Brain();
		brain1.think();
		
		final String name = "Robbie";
		//that had to be final so it could be used elsewhere.
		//final = constant.
		
		//AND you can create an inner class within a method:
		class Temp{
			public void doSomething(){
				System.out.println("Robot number " + id + " is doing something");
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp1 = new Temp();
		temp1.doSomething();
	}
}

//why use inner classes?
//one example is having an inner class to iterate through stuff in the outer class
//the way he's talking about this, you'll see it but it's not super useful or common.