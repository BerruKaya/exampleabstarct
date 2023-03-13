public class Main {
  CustomerManager cm= new CustomerManager();
  cm.db=new SqlServerDatabase;    
  cm.getCustomers();
  
  CustomerManager cm2= new CustomerManager();
  cm2.db=new OracleDatabase;    
  cm2.getCustomers();


  }
