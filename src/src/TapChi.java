public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    // Constructor
    public TapChi(int soPhatHanh , int thangPhatHanh, int maTL, String tenNXB, int soNXB){
        super( maTL, tenNXB, soNXB);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void inthongTin() {
        System.out.println("Số Phát Hành : " + soPhatHanh);
        System.out.println("Tháng Phát Hành : " + thangPhatHanh);

    }




    // Getter and Setter
    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
