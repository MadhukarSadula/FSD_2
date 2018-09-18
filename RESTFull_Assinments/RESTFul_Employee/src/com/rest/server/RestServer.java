package com.rest.server;
import java.util.List;

import javax.decorator.Delegate;
import javax.enterprise.inject.Produces;
import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@Path("/Employee")
public class RestServer {
	private static SessionFactory factory; 
public RestServer() {
	// TODO Auto-generated constructor stub
	try {
        factory = new Configuration().configure().buildSessionFactory();
     } catch (Throwable ex) { 
        System.err.println("Failed to create sessionFactory object." + ex);
        throw new ExceptionInInitializerError(ex); 
     }
     
}
	   
@PUT


@Path("/add/{fname}/{lname}/{salary}")

/* Method to CREATE an employee in the database */
	   public String addEmployee(@PathParam("fname") String fname,@PathParam("lname") String lname,@PathParam("salary") String salary){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      String employeeID = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = new Employee(fname, lname, Integer.parseInt(salary));
	         employeeID = (String) session.save(employee); 
	         tx.commit();
	      }
	      catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
@GET

@Path("/list")
   
	   /* Method to  READ all the employees */
	   public List listEmployees(){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      List employees = null;
	      
	      try {
	         tx = session.beginTransaction();
	         employees = session.createQuery("FROM Employee").list(); 
	         
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employees;
	   }
@POST
@Produces()
@Path("/update/{EmployeeID}/{salary}")
  
	   /* Method to UPDATE salary for an employee */
	   public Employee updateEmployee(@PathParam("EmployeeID") String EmployeeID, @PathParam("salary") String salary ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Employee employee,employee1 = null;
	      try {
	         tx = session.beginTransaction();
	          employee = (Employee)session.get(Employee.class, Integer.parseInt(EmployeeID)); 
	         employee.setSalary( Integer.parseInt(salary) );
			 session.update(employee); 
	         tx.commit();
	         employee1 = (Employee)session.get(Employee.class, Integer.parseInt(EmployeeID)); 
	         
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employee1;
	   }
@DELETE
@Produces()
@Path("/delete/{EmployeeID}")
	   
	   /* Method to DELETE an employee from the records */
	   public String deleteEmployee(@PathParam ("EmployeeID") String EmployeeID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, Integer.parseInt(EmployeeID)); 
	         session.delete(employee);
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return "Deleted employee id is :"+EmployeeID;
	   }
	}