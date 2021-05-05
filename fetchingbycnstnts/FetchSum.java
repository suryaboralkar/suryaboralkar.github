package fetchingbycnstnts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchSum {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Db.driver);
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Db.url, Db.user, Db.password);
			Statement statement = connection.createStatement();
			String sql = "select sum(R_DAMS) from river";
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {

				int dam = set.getInt(1);
				System.out.println("sum of dam is:" + dam);

				System.out.println("********************************");

			}
		} finally {
			connection.close();
			System.out.println("connection is closed");
		}
	}
}
