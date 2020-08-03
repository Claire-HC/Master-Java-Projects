package claire.master;

public interface ITelephone {
    public void powerOn(); // create signature
    public void dial(int phoneNumber); // create signature
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
