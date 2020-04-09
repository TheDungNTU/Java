
package lethedung_59130403_sodo;

public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;
    
    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    public HocSinh(){
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    
    
    @Override
    public void hienThiTT(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("Lớp: " + lop);
        System.out.println("Năng khiếu: " + nangKhieu);
    }
}
