package fetchingbycnstnts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchLND {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Db.driver);
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Db.url, Db.user, Db.password);
			Statement statement = connection.createStatement();
			String sql = "select R_NAME,R_LENGTH,R_DAMS from river";
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {
				String name = set.getString(1);
				System.out.println("R_name is:" + name);
                int length = set.getInt(2);
				System.out.println("lengt is:" + length);
				int Dam = set.getInt(3);
                System.out.println("no of dams="+Dam);
				System.out.println("********************************");

			}
		} finally {
			connection.close();
			System.out.println("connection is closed");
		}
	}


}
