package test;

import dao.KhachHangDAO;
import model.KhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class TestKhachDAO {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("30/8/2005");
        try{
            java.util.Date utilDate= sdf.parse("30/8/2005");
            Date sqlDate = new Date(utilDate.getTime());
        }catch (ParseException e){
            e.printStackTrace();
        }
//        KhachHang khach1= new KhachHang(1,"Nguyen Van A",sqlDate,"HaNoi");
    }
}
