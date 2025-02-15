package model;

public class Sach {
    private int id;
    private String tenSach;
    private String giaBan;
    private int namSuatBan;

    public Sach() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamSuatBan() {
        return namSuatBan;
    }

    public void setNamSuatBan(int namSuatBan) {
        this.namSuatBan = namSuatBan;
    }

    public Sach(int id, String tenSach, String giaBan, int namSuatBan) {
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSuatBan = namSuatBan;
    }


}
