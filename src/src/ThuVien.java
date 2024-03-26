import java.util.ArrayList;

public class ThuVien {
    private ArrayList<TaiLieu> danhSachTaiLieu;

    public ThuVien(){
        danhSachTaiLieu = new ArrayList<>();
    }
    public void themTailieu(TaiLieu taiLieu){
        danhSachTaiLieu.add(taiLieu);
    }

    public void inDanhSachTaiLieu(){
        for (TaiLieu t1 : danhSachTaiLieu){
            t1.inthongTin();
            System.out.println("-------------------------");
        }
    }
}
