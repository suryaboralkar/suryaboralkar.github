package fetchingbycnstnts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchbyMin {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Db.driver);
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Db.url, Db.user, Db.password);
			Statement statement = connection.createStatement();
			//String sql = "select min(R_LENGTH) from river";
			String sql = "select min(R_LENGTH),max(R_LENGTH) from river";
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {

				int dam = set.getInt(1);
				System.out.println("min length is:" + dam);
				int dam1 = set.getInt(2);
				System.out.println("max length is:" + dam1);

				System.out.println("********************************");

			}
		} finally {
			connection.close();
			System.out.println("connection is closed");
		}
	}
}
