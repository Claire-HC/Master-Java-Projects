package claire.master;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone clairesPhone;
        clairesPhone = new DeskPhone(123456);
        clairesPhone.powerOn();
        clairesPhone.callPhone(123456);
        clairesPhone.answer();

        clairesPhone = new MobilePhone(24565);
        clairesPhone.powerOn();
        clairesPhone.callPhone(24565);
        clairesPhone.answer();
    }
}
