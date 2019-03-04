package comp3;

public class Dog extends Animal {
		String name;
		int legs;
		
		public Dog(String name, int legs) {
			super(name, legs);
			
		}
		
		public String getName() {
			return super.getName();
		}
		
		public int getLegs() {
			return super.getLegs();
		}
		
		public String toString() {
			return super.toString();
		}
}