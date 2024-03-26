public class Bao extends  TaiLieu{
    private int ngayPhatHanh;
    public Bao(int ngayPhatHanh,int maTL, String tenNXB, int soNXB){
        super(maTL, tenNXB, soNXB);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void inthongTin() {
        System.out.println("Ngày Phát hành : " + ngayPhatHanh);

    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
