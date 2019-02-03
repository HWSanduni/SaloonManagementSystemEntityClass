package lk.ijse.saloonManageSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_ID")
    private int p_id;
    @Column(name = "DATE", nullable = false, length = 50)
    private String date;
    @Column(name = "PRICE", nullable = false, length = 50)
    private String price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "APPOINMENT_ID")
    private Appoinment appoiment;
    
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="SERVICE_ID")
    private SaloonService saloonService;

    
   
	public Payment() {
		super();
	}


	public Payment(int p_id, String date, String price, Appoinment appoiment, SaloonService saloonService) {
		super();
		this.p_id = p_id;
		this.date = date;
		this.price = price;
		this.appoiment = appoiment;
		this.saloonService = saloonService;
	}


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public Appoinment getAppoiment() {
		return appoiment;
	}


	public void setAppoiment(Appoinment appoiment) {
		this.appoiment = appoiment;
	}


	public SaloonService getSaloonService() {
		return saloonService;
	}


	public void setSaloonService(SaloonService saloonService) {
		this.saloonService = saloonService;
	}


	@Override
	public String toString() {
		return "Payment [p_id=" + p_id + ", date=" + date + ", price=" + price + ", appoiment=" + appoiment
				+ ", saloonService=" + saloonService + "]";
	}
    
    
    
    
    
}
