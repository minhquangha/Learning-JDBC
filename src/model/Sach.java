package model;

public class Sach {
    private String id;
    private String tenSach;
    private int giaBan;
    private int namSuatBan;

    public Sach() {
    }

    public Sach(String id, String tenSach, int giaBan, int namSuatBan) {
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSuatBan = namSuatBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamSuatBan() {
        return namSuatBan;
    }

    public void setNamSuatBan(int namSuatBan) {
        this.namSuatBan = namSuatBan;
    }

    public Sach( String tenSach, int giaBan, int namSuatBan) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSuatBan = namSuatBan;
    }


}
