public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;
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


}
