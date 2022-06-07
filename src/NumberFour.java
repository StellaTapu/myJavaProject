class Customer_Account {
    //private data of class
    private long customer_accountNo;
    private String customer_name,customer_email;
    private float customer_salary;
    //public getter/setter methods to access private data
    public long getAcc_no() {
        return customer_accountNo;
    }
    public void setAcc_no(long acc_no) {
        this.customer_accountNo = acc_no;
    }
    public String getName() {
        return customer_name;
    }
    public void setName(String name) {
        this.customer_name = name;
    }
    public String getEmail() {
        return customer_email;
    }
    public void setEmail(String email) {
        this.customer_email = email;
    }
    public float getSalary() {
        return customer_salary;
    }
    public void setSalary(float salary) {
        this.customer_salary = salary;
    }
}
public class NumberFour {
    public static void main(String[] args) {
        //create an object of customer_Account class
        Customer_Account acc=new Customer_Account();
        //use setter methods to set values
        acc.setAcc_no(123458765432L);
        acc.setName("SoftwareTestingHelp");
        acc.setEmail("sth@sth.com");
        acc.setSalary(65000f);
        //use getter methods to read values
        System.out.println("Customer Account Number: " + acc.getAcc_no());
        System.out.println("Customer Account Details:");
        System.out.println("  Customer Name: "+acc.getName()+"\n "+
                " Customer Email: " + acc.getEmail()+"\n " +
                " Customer Salary: " +acc.getSalary());
    }
}