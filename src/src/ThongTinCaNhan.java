public class ThongTinCaNhan {
    private String tenNguoiDung;
    private String diaChi;
    private int sDt;

    // Constructor
    public ThongTinCaNhan(String tenNguoiDung, String diaChi, int sDt) {
        this.tenNguoiDung = tenNguoiDung;
        this.diaChi = diaChi;
        this.sDt = sDt;
    }







    // Getter và Setter

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getsDt() {
        return sDt;
    }

    public void setsDt(int sDt) {
        this.sDt = sDt;
    }
}
