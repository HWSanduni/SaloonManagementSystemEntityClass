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
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int cust_id;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Column(name = "Last_Name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "ADDRESS", nullable = false, length = 50)
    private String address;

    @Column(name = "Telephone_Number", nullable = false, length = 50)
    private String tel;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Appoinment> appList;

	public Customer() {
		super();
	}

	public Customer(int cust_id, String firstName, String lastName, String address, String tel,
			List<Appoinment> appList) {
		super();
		this.cust_id = cust_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.tel = tel;
		this.appList = appList;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Appoinment> getAppList() {
		return appList;
	}

	public void setAppList(List<Appoinment> appList) {
		this.appList = appList;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", tel=" + tel + ", appList=" + appList + "]";
	}

	
	
}
