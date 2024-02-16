package main.java.BehavioralPatterns.proxypattern;

public class EmployeeImpl implements EmployeeDao{
    @Override
    public void create(String client) {
        System.out.println("New account is created for" + client);
    }

    @Override
    public void delete(String client) {
        System.out.println("Account is deleted for user" + client);
    }

    @Override
    public String get(String client) {
        return client + "_1234567890";
    }

}
