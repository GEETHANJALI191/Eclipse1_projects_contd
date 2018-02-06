package orchardonetomanyprog;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orchard")
public class OrchardPojo {

@Id
@Column(name="orchard_trackid")	
private int trackid;

@Column(name="orchard_trackname")
private String TrackName;

public OrchardPojo(){
	
}
public OrchardPojo(int trackid, String trackName) {
	super();
	this.trackid = trackid;
	TrackName = trackName;
}


public int getTrackid() {
	return trackid;
}

public void setTrackid(int trackid) {
	this.trackid = trackid;
}

public String getTrackName() {
	return TrackName;
}
public void setTrackName(String trackName) {
	TrackName = trackName;
}
@Override
public String toString() {
	return "OrchardPojo [trackid=" + trackid + ", TrackName=" + TrackName + "]";
}

}
