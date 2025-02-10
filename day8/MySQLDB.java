package day8;

public class MySQLDB implements Databaseinterface{

	@Override
	public void connect() {
		 System.out.println("Connected successfully");
		
	}

	@Override
	public void disconnect() {
		 System.out.println("Disconnecting from MySQL Database");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Query executed successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLDB mysqldb = new MySQLDB();
		mysqldb.executeUpdate();
		mysqldb.disconnect();
		mysqldb.connect();
	}

}
