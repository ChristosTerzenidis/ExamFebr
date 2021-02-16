public class InterImplement implements INet {
    static int noOfTries = 0;

    public InterImplement() {
    }

    public boolean sendMessage(String ip, String message) {
        ++noOfTries;
        if (noOfTries == 1) {
            return false;
        } else {
            noOfTries = 0;
            return true;
        }
    }

}
