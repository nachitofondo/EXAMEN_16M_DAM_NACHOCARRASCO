package prueba;

//public class Pruebas {
//
//	public static void main(String[] args) {
//		
//		import java.io.BufferedReader;
//		import java.io.InputStreamReader;
//		import java.sql.Connection;
//		import java.sql.PreparedStatement;
//		import java.sql.ResultSet;
//		import java.sql.SQLException;
//		import java.sql.Statement;
//		import java.util.Scanner;
//
//
//		public class Principal {
//			
//			private static Connection conn;
//			
//			public static void main(String[] args) {
//				
//		        try {
////		            InsertarDatos();
//		            Datos();
//		        } catch (SQLException excep) {
//		            System.out.println("Error al ejecutar la BBDD: " + excep.getMessage());
//		        }
//		    }
//
//		    public static void InsertarDatos() throws SQLException {
//		        try(PreparedStatement pstmt = conn.prepareStatement("INSERT INTO facturas (FacturaID, Cliente, Total) VALUES (?,?,?)")) {
//		            Scanner ent = new Scanner(System.in);
//		            for(int i = 0; i < 5; i++) {
//		                System.out.print("FacturaID: ");
//		                int facturaId = ent.nextInt();
//		                System.out.print("Cliente: ");
//		                String cliente = ent.next();
//		                System.out.print("Total: ");
//		                double total = ent.nextDouble();
//		                pstmt.setInt(1, facturaId);
//		                pstmt.setString(2, cliente);
//		                pstmt.setDouble(3, total);
//		            }
//		        }
//		    }
//
//		     
//		    public static void Datos() throws SQLException {
//		        try(Statement stmt = conn.createStatement()) {
//		            Scanner ent = new Scanner(System.in);
//		            System.out.print("Introduce una cantidad: ");
//		            double x = ent.nextDouble();
//		            try (ResultSet rs = stmt.executeQuery("SELECT * FROM facturas WHERE Total > " + x)) {
//		                while (rs.next()) {
//		                    System.out.println("FacturaID: " + rs.getInt("FacturaID") + ", Cliente: " + rs.getString("Cliente") + ", Total: " + rs.getDouble("Total"));
//		                }
//		            }
//		        }
//		    }
//		}
////
//
//	}
//
//}
	
