package hibernateExample;


/*
 * The following imports come from the hibernate library and allow us to access the XML files necessary to write our object
 * to the database. This way new employees can be added to the database. 
 */
import org.hibernate.*; 
import org.hibernate.cfg.Configuration;  

public class StoreData {  
public static void main(String[] args) {  
     try { 
    //creating configuration object that populates the data from our XML file.
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");

      
    //creating session factory object
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //Using the session object we will open a session with the 
    Session session=factory.openSession();  
      
    //creating transaction object that will handle our transactions in the application with the database.
    Transaction t=session.beginTransaction();  
         
    //Create a new employee
    Employee e1=new Employee();  
    e1.setId(15);  
    e1.setFirstName("John");  
    e1.setLastName("Smith");  
    e1.setMiddleInitial("A");
    e1.setPosition("Man Hunter");
      
    session.persist(e1);//persisting the object so that when we commit the transaction it is saved to the database.
    
    Employee e2 = new Employee();
    e2.setId(16);
    e2.setFirstName("Jane");
    e2.setLastName("Doe");
    e2.setMiddleInitial("B");
    e2.setPosition("Missing Persons Expert");
    
    session.save(e2); //You can also use save instead of persist to save an item before the transaction is committed.
    
    t.commit();//transaction is committed to the database.
    
    session.close();  //close the transaction.
    System.out.println("Transaction successful!");
     }catch (Exception e) {
    	 System.out.println("Oops, there was an error.");
     }
     
      
}  
}  