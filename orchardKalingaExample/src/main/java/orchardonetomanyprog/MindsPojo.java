package orchardonetomanyprog;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Campus_Minds1")
public class MindsPojo {
	@Id
	@Column(name="campusmind_mid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mid;

	@Column(name="campusmind_name")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="lead_mid")
	private  LeadPojo l;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LeadPojo getL() {
		return l;
	}

	public void setL(LeadPojo l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "MindsPojo [mid=" + mid + ", name=" + name + ", l=" + l + "]";
	}
	

	
	
	
}
