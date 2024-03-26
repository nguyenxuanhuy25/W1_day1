public class Sach extends TaiLieu {
    private String tentacgia;
    private int sotrang;

    public Sach(int maTL, String tenNXB, int soNXB,String tentacgia, int sotrang) {
        super( maTL, tenNXB, soNXB);
        this.tentacgia = tentacgia;
        this.sotrang = sotrang;
    }

    @Override
    public void inthongTin() {
        System.out.println("Tên Tác Giả : " + tentacgia);
        System.out.println("Số Trang : " + sotrang);

    }


    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }
}
