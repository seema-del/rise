//package jdbc;
//
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.mysql.cj.xdevapi.Statement;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
// 
//
//public class WriteDataFromDataBase {
//	public static void main(String[] args) throws SQLException {
//		
//	
//	//step1:create an instance of Driver class
//			// import Driver from:import com.mysql.cj.jdbc.Driver;
//			//new Driver() it throws SQLException
////			Driver dbDriver=new Drivear();
//			
//			
//			//step2:register to Driver
//			DriverManager.registerDriver(dbDriver);
//			
//			
//			
//			//step3:Establish database connection
//			// connection should be imported from java.sql packeage
//			// import from: import java.sql.Connection;
//			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/ads","root","root");//(URL(along with database name), UN,PWD)
//			
//			//step4:create staement
//			//statement should imported from java.sql package
//			Statement statement=connect.createStatement();
//			
//			//step5:Execute query to fetch data
//			//import java.sql;//resultset is an interface to fetch the data we should use looop condition and  depending upon colmn name and colm value we can fetch the data
//			ResultSet result=statement.executeQuery("select * from student;");
//			
//			while(result.next())
//			{
//				System.out.println(result.getInt("id")+"\t"+result.getString("name"));
//			}
//			
//			//steps:6 close database
//			connect.close();
//			
//				 
// 
//
//}
