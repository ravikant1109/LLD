package observerpattern;

public class MobileObserver implements Observers{

    String phoneNumber;

    public MobileObserver(String number){
        phoneNumber = number;
    }


    @Override
    public void update(String property) {
        System.out.format("Hi user:%s, you know what %s is back in stock\n", phoneNumber,property);
    }
}
