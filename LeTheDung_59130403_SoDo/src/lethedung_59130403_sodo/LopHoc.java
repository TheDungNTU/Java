
package lethedung_59130403_sodo;

public class LopHoc {
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();

    public LopHoc() {
    }
    
    public int themHocSinh(HocSinh hs){
        qldsHS.Them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGVGD.Them(gv);
        return 1;
    }
    
    public void inDSHS(){
        qldsHS.InDS(qldsHS.dsCaNhan);
    }
    
}
