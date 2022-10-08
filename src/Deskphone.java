public class Deskphone implements Telephone {

    @Override
    public boolean powerOn() {
        System.out.println("-----------------------------------");
        System.out.println("Checking deskphone is on / off");
        System.out.println("-----------------------------------");
        System.out.println("Deskphone is always ON");
        return true;
    }

    @Override
    public void dialNumber(String number) {
        System.out.println("-----------------------------------");
        System.out.println("Dialling number for calling someone");
        System.out.println("-----------------------------------");
System.out.println("You Entered the number"+number);
        System.out.println();
        calling(number);
        return;

    }//git config --global user.email "siddheshwardalave9119@gmail.com"
    //git config --global user.name "Siddheshwar"

    @Override
    public void calling(String number) {
            System.out.println("-----------------------------------");
            System.out.println("Calling Notification with caller details");
            System.out.println("-----------------------------------");
            System.out.println("Calling " + number);
            return;
    }

    @Override
    public void receiveCall(String myNumber,String callerNum) {
        System.out.println("-----------------------------------");
        System.out.println("Someone is trying to call you");
        System.out.println("-----------------------------------");
        String myNum="12345";
        if(myNumber==myNum){
            isRinging(callerNum);
            answer("correct");
        }else{
            System.out.println("User dialed wrong number");
            System.out.println("No phone Ringing");
        }
        return;
    }

    @Override
    public void answer(String str) {
        System.out.println("-----------------------------------");
        System.out.println("Window for answering call");
        System.out.println("-----------------------------------");
        if(str=="correct"){
            System.out.println("Answered the call");
        }
        return;
    }

    @Override
    public void isRinging(String displayNum) {
        System.out.println("-----------------------------------");
        System.out.println("Your phone ringing and details of caller is here");
        System.out.println("-----------------------------------");
        System.out.println("user with number"+displayNum+"is calling you");
        System.out.println("Phone Ringing");
        return;
    }
}
