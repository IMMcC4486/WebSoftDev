package Project2;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DrinkDOA {

	// back end responses
	public String getDrinks() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM Drink";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			String DrinkList = "{\"DrinkList\": [";
			boolean anything = false;
			Drink currentDrink = new Drink();
			int first = 0;
			while (rs.next()) {
				anything = true;
				currentDrink.setDrinkName(rs.getString("DrinkName"));
				currentDrink.setAddress(rs.getString("Address"));
				currentDrink.setPhoneNumber(rs.getString("PhoneNumber"));
				currentDrink.setContractLength(rs.getString("ContractLength"));
				currentDrink.setDateAvailable(rs.getString("DateAvailable"));
				currentDrink.setRentAmount(rs.getInt("RentAmount"));
				currentDrink.setUtilitiesCost(rs.getInt("UtilitiesCost"));
				currentDrink.setUpFrontCost(rs.getInt("UpFrontCost"));
				currentDrink.setTotalMonthlyCost(rs.getInt("TotalMonthlyCost"));
				currentDrink.setNotes(rs.getString("NOTES"));
				currentDrink.setQC(rs.getInt("QC"));

				//////////////////////////////////////////////

				if (first > 0) {
					DrinkList += ",{" + currentDrink.toJSON() + "}";
				} else {
					DrinkList += "{" + currentDrink.toJSON() + "}";
				}
				first++;
			}
			if (anything) {
				DrinkList += "]}";
			} else {
				DrinkList += "\"empty\"]}";
			}
			System.out.println(DrinkList);
			return DrinkList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			 try { if (rs != null) rs.close(); } catch (Exception e) {}; 
			 try { if (ps != null) ps.close(); } catch (Exception e) {};
			 try { if (conn != null) conn.close(); } catch (Exception e) {};
		}
	}
	
	public boolean checkDrink(String DrinkName) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBconnection.getConnection();
			String sql = "SELECT * FROM Drink where DrinkName = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,  DrinkName);
			rs = ps.executeQuery();
			boolean anything = false;
			while (rs.next()) {
				anything = true;
				break;
			}
			return anything;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
			;
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
			}
			;
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
			;
		}
	}
	
	public void changeRank(String DrinkName, int rankChange) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CallableStatement cs = null;
		try {
			conn = DBconnection.getConnection();
			
			int newRank = 0;

			String Asql = "SELECT * FROM Drink where DrinkName = ?";
			ps = conn.prepareStatement(Asql);
			ps.setString(1,  DrinkName);
			rs = ps.executeQuery();
			while (rs.next()) {
				newRank = rs.getInt("QC");
			}
			newRank += rankChange;
			
			String sql = "call QC_UPDATE(?,?)";
			cs = conn.prepareCall(sql);
			cs.setString(1,DrinkName);
			cs.setInt(2, newRank);
			cs.execute();
		} catch (SQLException e) {
			e.printStackTrace();			
		} finally {
			 try { if (cs != null) cs.close(); } catch (Exception e) {};
			 try { if (rs != null) rs.close(); } catch (Exception e) {}; 
			 try { if (ps != null) ps.close(); } catch (Exception e) {};
			 try { if (conn != null) conn.close(); } catch (Exception e) {};
		}
	};
	
	public void newDrink(String DrinkName,String Address,String PhoneNumber,String ContractLength,String DateAvailable,int RentAmount,int UtilitiesCost,int UpFrontCost, String Notes) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CallableStatement cs = null;
		try {
			conn = DBconnection.getConnection();

			String sql = "call NewDrink(?,?,?,?,?,?,?,?,?)";

			cs = conn.prepareCall(sql);

			cs.setString(1,DrinkName);
			cs.setString(2, Address);
			cs.setString(3, PhoneNumber);
			cs.setString(4, ContractLength);
			cs.setString(5, DateAvailable);
			cs.setInt(6, RentAmount);
			cs.setInt(7, UtilitiesCost);
			cs.setInt(8, UpFrontCost);
			cs.setString(9,  Notes);
			cs.execute();
		} catch (SQLException e) {
			e.printStackTrace();			
		} finally {
			 try { if (cs != null) cs.close(); } catch (Exception e) {};
			 try { if (rs != null) rs.close(); } catch (Exception e) {}; 
			 try { if (ps != null) ps.close(); } catch (Exception e) {};
			 try { if (conn != null) conn.close(); } catch (Exception e) {};
		}
	}

}
