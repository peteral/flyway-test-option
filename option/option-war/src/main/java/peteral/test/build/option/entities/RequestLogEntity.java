package peteral.test.build.option.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OPTION_REQUEST_LOG")
public class RequestLogEntity {
	@Id
	@SequenceGenerator(sequenceName="REQUES_LOG_SEQUENCE", name="RequestLogEntitySeq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="RequestLogEntitySeq")
	private Long id;
	
	private Timestamp ts;
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
