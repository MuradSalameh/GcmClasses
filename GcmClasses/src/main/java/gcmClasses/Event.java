package gcmClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement

public class Event implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private int id;

	private String eventTitle;

	private String eventDescription;

	private LocalDate date;

	private LocalTime eventStartTime;

	private LocalTime eventEndTime;

	private String eventAddidtionalNotes;

	private boolean reoccuring;


	List<Member> members = new ArrayList<>();

	public Event() {
		super();
	}

	public Event(String eventTitle, String eventDescription, LocalDate date, LocalTime eventStartTime,
			LocalTime eventEndTime, String eventAddidtionalNotes, boolean reoccuring, List<Member> members) {
		super();
		this.eventTitle = eventTitle;
		this.eventDescription = eventDescription;
		this.date = date;
		this.eventStartTime = eventStartTime;
		this.eventEndTime = eventEndTime;
		this.eventAddidtionalNotes = eventAddidtionalNotes;
		this.reoccuring = reoccuring;
		this.members = members;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	
	@XmlJavaTypeAdapter(value= LocalDateAdapter.class)
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@XmlJavaTypeAdapter(value= LocalTimeAdapter.class)
	public LocalTime getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(LocalTime eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	@XmlJavaTypeAdapter(value= LocalTimeAdapter.class)
	public LocalTime getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(LocalTime eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getEventAddidtionalNotes() {
		return eventAddidtionalNotes;
	}

	public void setEventAddidtionalNotes(String eventAddidtionalNotes) {
		this.eventAddidtionalNotes = eventAddidtionalNotes;
	}

	public boolean isReoccuring() {
		return reoccuring;
	}

	public void setReoccuring(boolean reoccuring) {
		this.reoccuring = reoccuring;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public int getId() {
		return id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	



}
