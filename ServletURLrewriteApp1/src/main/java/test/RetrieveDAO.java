package test;
import java.sql.*;

public class RetrieveDAO {
	public ProductBean pb1=null;
	public ProductBean retrieve(ProductBean pb) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("select * from product49 where pcode=?");
			ps.setString(1, pb.getPCode());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				pb1=new ProductBean();
				pb1.setPCode(rs.getString(1));
				pb1.setPName(rs.getString(2));
				pb1.setPPrice(rs.getFloat(3));
				pb1.setPQnty(rs.getInt(4));
				
			}
		}catch(Exception e) {e.printStackTrace();}
		return pb1;
	}

}
