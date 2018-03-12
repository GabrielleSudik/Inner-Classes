
public class Application {

	public static void main(String[] args) {
		
		Robot robot1 = new Robot(7);
		robot1.start();
		//robot1.think();
		//looks like you can't call think (Brain class) from main method.
		//but you can call think from within a Robot method.

		//Robot.Brain brain2 = robot.new Brain();
		//brain2.think();
		//again, that works on prof's compy, but not mine :(
		//I know permissions matter, but at the time of typing, that method was public. so... ?
			
		//Robot.Battery battery1 = new Robot.Battery();
		//battery1.charge();
		//ugh, same issues
	}

}

//creating an instance of the outer class does NOT
//create an instance of the inner class too.
//you have to do that somewhere.
//usually a method in the outer class.
