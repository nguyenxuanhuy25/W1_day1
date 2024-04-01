public class Bienlaidientu {
    private int ngayThuHoi;
    private String thongTinNguoiMuon;

    // Constructor
    public Bienlaidientu(int ngayThuHoi, String thongTinNguoiMuon) {
        this.ngayThuHoi = ngayThuHoi;
        this.thongTinNguoiMuon = thongTinNguoiMuon;
    }

    public String layThongTinNguoiMuon(){
        return "Thông tin người mượn : "  ;
    }



    // Getter and Setter
    public int getNgayThuHoi() {
        return ngayThuHoi;
    }

    public String getThongTinNguoiMuon() {
        return thongTinNguoiMuon;
    }

    public void setNgayThuHoi(int ngayThuHoi) {
        this.ngayThuHoi = ngayThuHoi;
    }

    public void setThongTinNguoiMuon(String thongTinNguoiMuon) {
        this.thongTinNguoiMuon = thongTinNguoiMuon;
    }
}
