import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panMap = new HashMap<>();
    static {
        panMap.put("EVMPR2236A", new Pan("EVMPR2236A","123456789", "Indian Bank", "Stock, ELSS, FD"));
        panMap.put("EVMPR2236B", new Pan("EVMPR2236B","987654321", "State Bank Of India", "Stock, SIP, FD"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        for(Pan pan : panMap.values()){
            if(pan.getAadharNumber().equals((aadhaarNumber))){
                return pan;
            }
        }
        return null;
    }
}
