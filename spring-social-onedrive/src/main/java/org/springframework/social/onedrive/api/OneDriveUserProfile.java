package org.springframework.social.onedrive.api;

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
	private String gender;
	private Locale locale;
	
	public OneDriveUserProfile(String id, String name, String firstName,
			String lastName, String gender, Locale locale) {
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.locale = locale;
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
	
}
