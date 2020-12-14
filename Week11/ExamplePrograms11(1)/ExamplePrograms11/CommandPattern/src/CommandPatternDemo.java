public class CommandPatternDemo {
	
	public static void main(String[] args)
	{
		// create a collection
		ExtendedArrayList  collection = new ExtendedArrayList();
		// add elements to the collection
		collection.add("Hello");
		collection.add("Bye");
		// print out the elements of the collection
		collection.map(new Command() {
		    public void execute(Object data) {
		      System.out.println(data);
		   }
		});
	}
}
