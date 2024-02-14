package main.java.BehavioralPatterns.observerpattern;


import java.security.PublicKey;

public class WebObserver implements Observers {



    String email;

    public WebObserver(String email){
        this.email = email;
    }

    @Override
    public void update(String property) {
        System.out.format("Hi user:%s, you know what %s is back in stock\n", email,property);
    }
}
