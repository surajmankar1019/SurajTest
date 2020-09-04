package Hibernate.Hibernate.dev;

import java.util.Date;

public class Txn 
{
    private long id;
    private Date date;
    private double totel;
    private Customer customer;
	@Override
	public String toString() {
		return "Txn [id=" + id + ", totel=" + totel + ", customer=" + customer + "]";
	}
    
    
    
}
