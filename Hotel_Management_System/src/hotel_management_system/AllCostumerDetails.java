package hotel_management_system;

import java.sql.*;

public class AllCostumerDetails {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:MYSYSTEM";
	private static final String USER_NAME = "MyDB11AM";
	private static final String PASSWARD = "123";
	
	public void getDataAll() {
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWARD);
			PreparedStatement pstmt = con.prepareStatement("Select * from CoustomerReservation");
			ResultSet rs = pstmt.executeQuery();
			
			ResultSetMetaData rm = rs.getMetaData();
//			int columnNum = rm.getColumnCount();
			System.out.println("+================================================================================================================================+");
			System.out.println("||\t\t\t\t\t\t   All Costumer Details Here \t\t\t\t\t\t\t||");
			System.out.println("+================================================================================================================================+");
			
			System.out.print("||\t"+rm.getColumnName(1)+"\t");
			System.out.print(rm.getColumnName(2)+"\t\t");
			System.out.print(rm.getColumnName(3)+"\t");
			System.out.print(rm.getColumnName(4)+"\t\t\t");
			System.out.print(rm.getColumnName(5)+"\t\t");
			System.out.print(rm.getColumnName(6)+"\t");
			System.out.print(rm.getColumnName(7)+"\t\t||");
			
			System.out.println();
			System.out.println("+================================================================================================================================+");

			while(rs.next()) {
				System.out.print("||\t"+rs.getInt("SNO")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.print(rs.getString("PHONENUMBER")+"\t");
				System.out.print(rs.getString("GMAIL")+"\t\t");
				System.out.print(rs.getString("IDPROOF")+"\t");
				System.out.print(rs.getString("CHECKINDATE")+"\t");
				System.out.print(rs.getString("CHECKINDATE")+"\t\t||");
				System.out.println();
			}
//			System.out.println();
			System.out.println("+================================================================================================================================+");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
//SNO                                                NUMBER(10)
//NAME                                               VARCHAR2(20)
//PHONENUMBER                                        NUMBER(13)
//GMAIL                                              VARCHAR2(20)
//ID                                                 VARCHAR2(20)
//CHECKINDATE                                        VARCHAR2(20)
