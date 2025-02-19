package dao;

import database.JDBCUtil;
import model.Sach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO implements DAOInterface<Sach> {
    public static SachDAO getInstance(){
        return new SachDAO();
    }

    @Override
    public int insert(Sach t) {
        try{
            //B1: Tao ket noi toi csdl
            Connection c = JDBCUtil.getConnection();
            //B2: Tao ra doi tuong statement
            Statement st = c.createStatement();
            //B3 : Thuc thi cau lenh sql
            String sql = "INSERT INTO sach (id, tenSach, giaBan, namXuatBan) "+
                    " VALUES ('"+t.getId()+"' , '"+t.getTenSach()+"' , "+ t.getGiaBan()+" , '"+t.getNamSuatBan()+"')";

            int ketQua=st.executeUpdate(sql);

            //B4
            System.out.println("Ban da thuc thi: "+sql);
            System.out.println("Co "+ketQua+" dong bi thay doi");

            //B5
            JDBCUtil.close(c);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Sach t) {
        try{
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "UPDATE sach " +
                    "SET tenSach = '" + t.getTenSach() + "', " +
                    "giaBan = " + t.getGiaBan() + ", " +
                    "namXuatBan = " + t.getNamSuatBan() + " " +
                    "WHERE id = '" + t.getId() + "'";


            int ketQua=st.executeUpdate(sql);

            System.out.println("Ban da thuc thi: "+sql);
            System.out.println("Co "+ketQua+" dong bi thay doi");
            JDBCUtil.close(c);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Sach sach) {
        try{
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "DELETE FROM sach WHERE id = '" + sach.getId() + "'";
            int ketQua=st.executeUpdate(sql);
            System.out.println("Ban da xoa: "+sql);
            JDBCUtil.close(c);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        ArrayList<Sach> list = new ArrayList<>();
        try{
            Connection c = JDBCUtil.getConnection();
            Statement stf = c.createStatement();
            String sql= "select * from sach";
            ResultSet rs = stf.executeQuery(sql);
            while(rs.next()){
                String id  = rs.getString("id");
                String tenSach = rs.getString("tenSach");
                int giaBan =rs.getInt("giaBan");
                int nam=rs.getInt("namXuatBan");
                list.add(new Sach(id,tenSach,giaBan,nam));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Sach selectById(Sach sach) {
        try{
            Connection c=  JDBCUtil.getConnection();
            Statement stf = c.createStatement();
            String sql = "select * from sach where id= "+"'"+sach.getId()+"'";
            ResultSet rs = stf.executeQuery(sql);
            String id  = rs.getString("id");
            String tenSach = rs.getString("tenSach");
            int giaBan =rs.getInt("giaBan");
            int nam=rs.getInt("namSuatBan");
            return new Sach(id,tenSach,giaBan,nam);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        ArrayList<Sach> list = new ArrayList<>();
        try{
            Connection c = JDBCUtil.getConnection();
            Statement stf = c.createStatement();
            String sql = "select * from sach where "+condition;
            ResultSet rs = stf.executeQuery(sql);
            while(rs.next()){
                String id  = rs.getString("id");
                String tenSach = rs.getString("tenSach");
                int giaBan =rs.getInt("giaBan");
                int nam=rs.getInt("namSuatBan");
                list.add(new Sach(id,tenSach,giaBan,nam));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
