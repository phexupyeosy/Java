package Test;
class Fruit {
		String name;
		public Fruit(String name){
			this.name = name;
		}
		public String setFruit(){
			return name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Fruit other = (Fruit) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equalsIgnoreCase(other.name))
				return false;
			return true;
		}	
	}
public class Main1{
	public static void main(String[] args) {
		Fruit f1 = new Fruit("banana");
		Fruit f2 = new Fruit("Banana");
	    System.out.print(f1.equals(f2));	
	}
}
