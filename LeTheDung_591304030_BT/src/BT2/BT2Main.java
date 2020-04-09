package BT2;
import BT1.NhanVien;
public class BT2Main {

   
    public static void main(String[] args) {
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("Lê Thế Duy",22,"50 Võ Thị Sáu",1500000.0,250);
        NhanVien NV2 = new NhanVien("Lê Thế Hùng",23,"12 Võ Thị Sáu",2100000.0,120);
        NhanVien NV3 = new NhanVien("Lê Thế Duy",24,"56 Võ Thị Sáu",1500000.0,250);
        NhanVien NV4 = new NhanVien("Lê Thế Phong",25,"70 Võ Thị Sáu",2300000.0,130);
        NhanVien NV5 = new NhanVien("Lê Thế Thiên",26,"80 Võ Thị Sáu",2400000.0,150);
        
        
        ds.themNV(NV1);
        ds.themNV(NV2);
        ds.themNV(NV3);
        ds.themNV(NV4);
        ds.themNV(NV5);
       
        for (int i=0; i<5; i++){
            System.out.println("\nNhân viên thứ " + i);
            ds.NV[i].getThongTin();
        }
    }
    
}
