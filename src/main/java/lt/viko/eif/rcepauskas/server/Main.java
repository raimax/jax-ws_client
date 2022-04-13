package lt.viko.eif.rcepauskas.server;

public class Main {
    public static void main(String[] args) {
        HappyServiceImplService service = new HappyServiceImplService();
        HappyService happyService = service.getHappyServiceImplPort();
        System.out.println(happyService.getHappyness("People"));
    }
}
