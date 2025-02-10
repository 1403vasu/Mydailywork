package day8;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connected to the database successfully.");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DisConnected to the database successfully.");
	}

	@Override
	public void executeupdate() {
		// TODO Auto-generated method stub
		System.out.println("Executing update query on the database.");
	}
   public static  void main(String [] args) {
	   JavaConnection jc = new JavaConnection() ;
	   jc.connect();
	   jc.disconnect();
	   jc.executeupdate();
}
	
	
		
	
	

	}


