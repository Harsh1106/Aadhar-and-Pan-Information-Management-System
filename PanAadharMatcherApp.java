import java.util.Scanner;

public class PanAadharMatcherApp {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    AadhaarService aadhaarService = new AadhaarService();
    PanService panService = new PanService();

    System.out.println("Enter the Aadhaar Number:");
    String aadhaarNumber = sc.nextLine();

    Aadhaar aadhaar = aadhaarService.getAadharByNumber(aadhaarNumber);
    Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);

    if(aadhaar != null && pan != null){
        System.out.println("Aadhar Details = "+aadhaar);
        System.out.println("Pan details = "+pan);
    }
    else{
        System.out.println("No match founnd!");
    }
    }
}
