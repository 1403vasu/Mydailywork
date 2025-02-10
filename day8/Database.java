package day8;

public interface Database {
 
	 void connect();       // Establish a database connection
	    void disconnect();    // Close the connection
	    void executeUpdate(); // Execute an update operation
	}

