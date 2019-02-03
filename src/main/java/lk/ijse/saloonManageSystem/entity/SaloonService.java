package lk.ijse.saloonManageSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SALOON_SERVICE")
public class SaloonService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICE_ID")
    private int sevId;

    @Column(name = "SERVICE_NAME", nullable = false, length = 50)
    private String serviceName;

    @Column(name = "TIME", nullable = false, length = 50)
    private String time;

    @Column(name = "PRICE", nullable = false, length = 50)
    private double price;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Payment> payList;

	public SaloonService() {
		super();
	}

	public SaloonService(int sevId, String serviceName, String time, double price, List<Payment> payList) {
		super();
		this.sevId = sevId;
		this.serviceName = serviceName;
		this.time = time;
		this.price = price;
		this.payList = payList;
	}

	public SaloonService(int sevId, String serviceName, String time, double price) {
		super();
		this.sevId = sevId;
		this.serviceName = serviceName;
		this.time = time;
		this.price = price;
	}

	public int getSevId() {
		return sevId;
	}

	public void setSevId(int sevId) {
		this.sevId = sevId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Payment> getPayList() {
		return payList;
	}

	public void setPayList(List<Payment> payList) {
		this.payList = payList;
	}

	@Override
	public String toString() {
		return "SaloonService [sevId=" + sevId + ", serviceName=" + serviceName + ", time=" + time + ", price=" + price
				+ ", payList=" + payList + "]";
	}
    
    
    
    
}
