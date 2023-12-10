package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Address;
import com.hexaware.mappings.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tr=session.beginTransaction();
        //Address address=new Address(52,"pune","india");
        //Student student =new Student(102,"anil",address);
        //session.persist(student);
        
        
        tr.commit();
        
        
        
    }
}
