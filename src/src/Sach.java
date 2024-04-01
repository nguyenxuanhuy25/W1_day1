public class Sach extends TaiLieu {
    private String tenTacgia;
    private int soTrang;


    // Constructor
    public Sach(int maTL, String tenNXB, int soNXB,String tenTacgia, int soTrang) {
        super( maTL, tenNXB, soNXB);
        this.tenTacgia = tenTacgia;
        this.soTrang = soTrang;
    }

    @Override
    public void inThongTin() {
        System.out.println("Tên Tác Giả : " + tenTacgia);
        System.out.println("Số Trang : " + soTrang);

    }



    // Getter and Setter

    public String getTenTacgia() {
        return tenTacgia;
    }

    public void setTenTacgia(String tenTacgia) {
        this.tenTacgia = tenTacgia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
