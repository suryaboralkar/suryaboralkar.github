package fetchingbycnstnts;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchBypollu {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Db.driver);
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Db.url, Db.user, Db.password);
			Statement statement = connection.createStatement();
			String sql = "select R_ID,R_NAME from river where R_POLLUATED=1";
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {

				int id = set.getInt(1);
				System.out.println("R_id is:" + id);
				String name = set.getString(2);
				System.out.println("R_name is:" + name);

				System.out.println("********************************");

			}
		} finally {
			connection.close();
			System.out.println("connection is closed");
		}
	}

}
