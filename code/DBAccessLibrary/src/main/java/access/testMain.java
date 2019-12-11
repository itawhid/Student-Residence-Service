package access;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Config f = Config.Instance("dbc:mysql://localhost:3306/ProjectRestApi", "root", "")
						 .Connect().transact();
		
	}

}
