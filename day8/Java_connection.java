package day8;

public class Java_connection extends Mysqlconnection {

		@Override
	    public void executeQuery() {
	        System.out.println("JavaConnection: Executing SELECT query.");
	  }
		
	//	public static void main(String[] args) {
			  public static void main(String[] args) {
				  Java_connection  db = new Java_connection();  // Use correct class name

			        db.connect();        // Establish connection
			        db.executeUpdate();  // Corrected method name (was executeupdate)
			        db.executeQuery();   // Execute a SELECT query
			        db.disconnect();     // Close the connection
			    }
	}

	

