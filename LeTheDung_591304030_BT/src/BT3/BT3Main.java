package BT3;

public class BT3Main {
    
    public static void main(String[] args) {
       SinhVienPoly pl1 = new SinhVienIT(9,8,7,"Lê Thế Dũng","CNTT");
       
       System.out.println("\nSinh viên poly kế thừa sinh viên IT");
       pl1.xuat();

        System.out.println("\nSinh viên poly kế thừa sinh viên Biz");
        SinhVienPoly pl2 = new SinhVienBiz(8,9,"Hồ Hải Nhi","KT");
        pl2.xuat();
    }
    
}
