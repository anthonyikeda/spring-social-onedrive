package org.springframework.social.onedrive.api;

import java.util.Date;
import java.util.Locale;

/**
 * 
 * OneDrive User Profile Details.
 * @author Suresh Kumar (yarli4u).
 *
 */

public class OneDriveUserProfile {

	private String id;
	private String name;
	private String firstName;
	private String lastName;
	private String link;
	private String gender;
	private Locale locale;
	private Date updated_time;
	
	public OneDriveUserProfile(String id, String name, String firstName,
			String lastName, String link, String gender, Locale locale, Date updated_time) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.link = link;
		this.gender = gender;
		this.locale = locale;
		this.updated_time = updated_time;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public Locale getLocale() {
		return locale;
	}

	public String getLink() {
		return link;
	}

	public Date getUpdated_time() {
		return updated_time;
	}
	
}
