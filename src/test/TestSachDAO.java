package test;

import dao.SachDAO;
import model.Sach;

import java.util.ArrayList;

public class TestSachDAO {
    public static void main(String[] args) {
//        Sach sach2 = new Sach("LTC","Lập trình C ",25000,2023);
//
//        SachDAO.getInstance().insert(sach1);
//        for (int i = 0; i < 4; i++) {
//            Sach sach = new Sach("LT"+i,"Lap trinh "+i,100+i,1000+i);
//            SachDAO.getInstance().insert(sach);
//        }
//
        ArrayList<Sach> list = SachDAO.getInstance().selectAll();
        for(Sach i : list){
            System.out.print(i.getTenSach()+" ");
        }

    }
}
