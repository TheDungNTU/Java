
package BT4;

public class BT4Main {
    public static void main(String[] args) {
        
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        
        ChuyenXeNoiThanh CXNoT1 = new ChuyenXeNoiThanh(20,20.1,"Lê Thế Dũng","CX01","59130403",100.0);
        ChuyenXeNgoaiThanh CXNgT1 = new ChuyenXeNgoaiThanh("NhaTrang",20,"Lê Thế Dũng","CX02","59130403",200.0);
        ChuyenXeNoiThanh CXNoT2 = new ChuyenXeNoiThanh(21,20.1,"Lê Thế Thiên","CX03","59130403",100.0);
        ChuyenXeNgoaiThanh CXNgT2 = new ChuyenXeNgoaiThanh("Huế",20,"Lê Thế Thiên","CX04","59130403",200.0);
        
        QLCX.themCX(CXNoT1);
        QLCX.themCX(CXNgT1);
        QLCX.themCX(CXNoT2);
        QLCX.themCX(CXNgT1);
        
        QLCX.inDS();
        
        
        System.out.println("tổng doanh thu ngoại thành " + QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("tổng doanh thu nội thành " + QLCX.tinhDoanhThuNoiThanh());
        
    }
    
}
