package BT1;

public class BT1Main {

    public static void main(String[] args) {
       NhanVien NV1 = new NhanVien("Lê Thế Dũng",23,"23 Võ Thị Sáu",200000,1000);
        NhanVien NV2 = new NhanVien("Lê Thế Duy",23,"23 Võ Thị Sáu",200000,1000);
        
        NV1.getThongTin();
        NV2.getThongTin();
    }
}
