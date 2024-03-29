public class ThongTinCaNhan {
    private String ten;
    private String diaChi;
    private int sDt;

    // Constructor
    public ThongTinCaNhan(String ten, String diaChi, int sDt) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.sDt = sDt;
    }







    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getsDt() {
        return sDt;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setsDt(int sDt) {
        this.sDt = sDt;
    }
}
