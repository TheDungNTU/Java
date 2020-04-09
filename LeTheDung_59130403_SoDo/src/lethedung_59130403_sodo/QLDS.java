
package lethedung_59130403_sodo;

import java.util.ArrayList;

public class QLDS implements IQLDS{

    ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }

    public QLDS() {
    }
    
    
    @Override
    public int Them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (int i =0; i<dsCaNhan.size(); i++){
            if (dsCaNhan.get(i).getHoTen() == ten)
                dsCaNhan.remove(i);
        }
        return 1;
    }

    @Override
    public void InDS(ArrayList<CaNhan> ls) {
        for (int i =0; i<ls.size(); i++){
            ls.get(i).hienThiTT();
        }
    }
    
}
