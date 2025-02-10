package day8;

public abstract class Mysqlconnection implements Database {
	public void connect() {
        System.out.println("MySQL: Connected to the database.");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL: Disconnected from the database.");
    }

    @Override
    public void executeUpdate() {
        System.out.println("MySQL: Executing update query.");
    }

    // Abstract method to be implemented in a subclass
    public abstract void executeQuery();
}


