//in interface only methods
//why needed interfaces-1 for security purpose 2. hiding implementation property 3. make code extensible
public interface Telephone {
    boolean powerOn(); // to check phone is on or off
    void dialNumber(String number);// dialing a number
    void calling(String number);// calling to that dialled number
    void receiveCall(String myNumber,String callerNum); // Someone is calling on your number
    void answer(String checkForCorrectNum);// you answered or not
    void isRinging(String displayNum); // when someone call on my number then only it should ring otherwise not

}
