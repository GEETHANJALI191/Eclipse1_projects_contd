package orchardonetomanyprog;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Leads1")
public class LeadPojo {	
@Id
@Column(name="lead_mid")
private int lmid;

@Column(name="lead_name")
private String name;

@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
@JoinColumn(name="orchard_trackid")
private OrchardPojo o=new OrchardPojo();

public LeadPojo(){
	
}

public LeadPojo(int lmid, String name, OrchardPojo o) {
	super();
	this.lmid = lmid;
	this.name = name;
	this.o = o;
}

public OrchardPojo getO() {
	return o;
}

public void setO(OrchardPojo o) {
	this.o = o;
}

public int getLmid() {
	return lmid;
}

public void setLmid(int lmid) {
	this.lmid = lmid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "LeadPojo [lmid=" + lmid + ", name=" + name + ", o=" + o + "]";
}

}
