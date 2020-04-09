
package lethedung_59130403_sodo;

public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    
    
    @Override
    public void hienThiTT(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("Môn dạy: " + monDay);
        System.out.println("Tổ bộ môn: " + toBoMon);
    }
    
}

