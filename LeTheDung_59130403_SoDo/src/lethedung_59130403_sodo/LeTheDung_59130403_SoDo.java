
package lethedung_59130403_sodo;

public class LeTheDung_59130403_SoDo {

 
    public static void main(String[] args) {
        LopHoc LH = new LopHoc();
        HocSinh HS1 = new HocSinh("59CNTT-1","IT","Lê Thế Dũng",15,"12 Trần Khánh","0369337366");
        HocSinh HS2 = new HocSinh("59CNTT-1","IT","Lê Thế Duy",15,"12 Trần Khánh","0369337366");
        HocSinh HS3 = new HocSinh("59CNTT-1","IT","Lê Thế Thiên",15,"12 Trần Khánh","0369337366");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        LH.themHocSinh(HS3);
        
        LH.qldsHS.xoa("Lê Thế Duy");
        LH.inDSHS();
    }
}
