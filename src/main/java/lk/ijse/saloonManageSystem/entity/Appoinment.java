package lk.ijse.saloonManageSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "APPOINMENT")
public class Appoinment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APPOINMENT_ID")
    private int a_Id;

    @Column(name = "DATE", nullable = false, length = 50)
    private String date;

    @Column(name = "TIME", nullable = false, length = 50)
    private String time;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CUSTOMER_ID")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Payment> payList;

	public Appoinment() {
		super();
	}

	public Appoinment(int a_Id, String date, String time, Customer customer, List<Payment> payList) {
		super();
		this.a_Id = a_Id;
		this.date = date;
		this.time = time;
		this.customer = customer;
		this.payList = payList;
	}

	public Appoinment(int a_Id, String date, String time, Customer customer) {
		super();
		this.a_Id = a_Id;
		this.date = date;
		this.time = time;
		this.customer = customer;
	}

	public int getA_Id() {
		return a_Id;
	}

	public void setA_Id(int a_Id) {
		this.a_Id = a_Id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Payment> getPayList() {
		return payList;
	}

	public void setPayList(List<Payment> payList) {
		this.payList = payList;
	}

	@Override
	public String toString() {
		return "Appoinment [a_Id=" + a_Id + ", date=" + date + ", time=" + time + ", customer=" + customer
				+ ", payList=" + payList + "]";
	}
    
    
    

}
