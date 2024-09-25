import java.util.*;
public class AadhaarService {
    private static Map<String, Aadhaar> aadharMap = new HashMap<>();
    static{
        aadharMap.put("123456789", new Aadhaar("123456789", "Harsh", "Mr. Satyendra Kr Sinha", "Patna"));
        aadharMap.put("987654321", new Aadhaar("987654321", "Anuj", "Mr. Ramesh Kr Jha", "Delhi"));
    }

    public Aadhaar getAadharByNumber(String aadhaarNumber){
        return aadharMap.get(aadhaarNumber);
    }

}
