package main.java.BehavioralPatterns.proxypattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeProxy();
        try {
//            employeeDao.create("RAVI");
            employeeDao.create("ADMIN");
            employeeDao.delete("RAVI");
//            employeeDao.delete("ADMIN");
//            employeeDao.get("RAVI");
            System.out.println(employeeDao.get("CLIENT"));
            System.out.println(employeeDao.get("ADMIN"));
        }catch (RuntimeException e){
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
