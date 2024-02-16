package main.java.BehavioralPatterns.proxypattern;

public interface EmployeeDao {
    public void create(String client);
    public void delete(String client);
    public String get(String client);

}
