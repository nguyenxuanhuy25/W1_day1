// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       ThuVien thuVien = new ThuVien();
       Sach sach1 = new Sach(212 , "Nguyễn Xuân Huy", 44, "Trần Nam" , 330);
       Sach sach2 = new Sach(512 , " Anh Khoa", 43, "Long", 600);


       thuVien.themTailieu(sach1);
       thuVien.themTailieu(sach2);

       thuVien.inDanhSachTaiLieu();
    }
}