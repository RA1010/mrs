package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class ReservableRoomId implements Serializable{

	private Integer roomId;

	private LocalDate reservedDate;

	public ReservableRoomId(Integer roomId, LocalDate reservedDate) {
		this.roomId = roomId;
		this.reservedDate = reservedDate;

	}

	public ReservableRoomId() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;//what is it?
		int result = 1;//what does this mean?
		result = prime * result + ((reservedDate == null) ? 0 : reservedDate.hashCode());
		result = prime * result * ((roomId== null) ? 0 : roomId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;

		//
		if(getClass() != obj.getClass()) return false;
		ReservableRoomId other = (ReservableRoomId) obj;
		if(reservedDate == null) {
			if(other.reservedDate != null) return false;
		}else if(!reservedDate.equals(other.reservedDate)) {
			return false;
		}

		return true;
	}


}











