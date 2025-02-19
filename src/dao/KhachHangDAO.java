package dao;
import java.sql.Connection;
import database.JDBCUtil;
import model.KhachHang;

import javax.swing.plaf.nimbus.State;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KhachHangDAO implements DAOInterface<KhachHang> {

    public KhachHangDAO getInstance() {
        return  new KhachHangDAO();
    }
    @Override
    public int insert(KhachHang khachHang) {
        try{
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "insert into khachhang(id,hoVaTen,ngaySinh,diaChi)"+
                        "values ("+khachHang.getId()+"'"+khachHang.getHoVaTen()+"'"+","+khachHang.getNgaySinh()+","+"'"+khachHang.getDiaChi()+"'";
            st.execute(sql);
            JDBCUtil.close(c);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(KhachHang khachHang) {
        return 0;
    }

    @Override
    public int delete(KhachHang khachHang) {
        return 0;
    }

    @Override
    public ArrayList<KhachHang> selectAll() {
        return null;
    }

    @Override
    public KhachHang selectById(KhachHang khachHang) {
        return null;
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        return null;
    }
}
