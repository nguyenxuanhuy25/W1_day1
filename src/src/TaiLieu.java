public class TaiLieu {
    private int maTL;
    private String tenNXB;
    private int soNXB;

    // Constructor

    public TaiLieu(int maTL, String tenNXB, int soNXB) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soNXB = soNXB;
    }

    public String layThongTinNguoiMuon(){
        return "Nguyễn Xuân Huy";
    }

    public String thongBaoThuHoiTailieu(){
        return "Thu hồi tài liệu";
    }
    public String nhanLaiTailieu(){
        return "Nhận lại tài liệu";
    }

    // in thông tin
    public void     inThongTin() {
        System.out.println("Mã Tài Liệu : " + maTL);
        System.out.println("Tên Nhà xuất bản : " + tenNXB);
        System.out.println("số bản phát hành : " + soNXB);
    }



    // Getter and Setter
    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoNXB(int soNXB) {
        this.soNXB = soNXB;
    }

    public int getMaTL() {
        return maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoNXB() {
        return soNXB;
    }
}
