package main.java.BehavioralPatterns.proxypattern;

public class EmployeeProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeProxy(){
        employeeDao = new EmployeeImpl();
    }
    @Override
    public void create(String client) {

        if (client.equals("ADMIN")){
            employeeDao.create(client);
        }
        else {

                throw new RuntimeException("Only ADMIN can create account");
        }

    }

    @Override
    public void delete(String client) {
        if (client.equals("ADMIN")){
            throw new RuntimeException("ADMIN account cannot be deleted");
        }
        else {
            employeeDao.delete(client);
        }

    }

    @Override
    public String get(String client) {
        if(client.equals("CLIENT") || (client.equals("ADMIN"))){
            return employeeDao.get(client);
        }
        else {
            throw new RuntimeException("Unauthorized access");
        }
    }
}
