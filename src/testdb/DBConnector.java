package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url =
	"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	//mysql用のURL指定の仕方、?以降は必須ではない

	private static String user = "root";
	private static String password = "";
	//指定したアカウントのパスワード（今回はなし）

	public Connection getConnection() {
		//接続状態へ

		Connection con = null;
		//一度、状態を初期化

		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
			//ドライバーをロードして使えるように
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace() ;
			//クラスが見つからない際の例外設定
			}
		catch (SQLException e) {
			e.printStackTrace() ;
			//データベース処理に関する例外設定
			}
			return con ;
			}
	}
