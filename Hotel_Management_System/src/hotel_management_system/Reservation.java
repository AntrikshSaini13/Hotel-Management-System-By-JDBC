package hotel_management_system;

import java.sql.*;

public class Reservation {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:MYSYSTEM";
	private static final String USER_NAME = "MyDB11AM";
	private static final String PASSWARD = "123";
	
	private long roomNum ;
	private String name;
	private String phoneNum ;
	private String gamil ;
	private String id ;
	private String checkInDate ;
	private String checkOutDate ;
	
	public Reservation(long sno, String name, String phoneNum, String gamil, String id, String checkInDate,
			String checkOutDate) {
		super();
		this.roomNum = sno;
		this.name = name;
		this.phoneNum = phoneNum;
		this.gamil = gamil;
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}
	
	public void InserData() {
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWARD);
			PreparedStatement pstmt = con.prepareStatement("insert into CoustomerReservation values(?,?,?,?,?,?,?)");
			pstmt.setLong(1, roomNum);
			pstmt.setString(2, name);
			pstmt.setString(3, phoneNum);
			pstmt.setString(4, gamil);
			pstmt.setString(5, id);
			pstmt.setString(6, checkInDate);
			pstmt.setString(7, checkOutDate);		
			pstmt.executeUpdate();
			System.out.println("Reservation Successfully Thank You");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());;
			System.out.println("Again Try");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Again Try");
		}
	}	
}

//SNO                                                NUMBER(10)
//NAME                                               VARCHAR2(20)
//PHONENUMBER                                        NUMBER(13)
//GMAIL                                              VARCHAR2(20)
//ID                                                 VARCHAR2(20)
//CHECKINDATE                                        VARCHAR2(20)