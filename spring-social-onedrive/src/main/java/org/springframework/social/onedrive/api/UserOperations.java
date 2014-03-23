package org.springframework.social.onedrive.api;

public interface UserOperations {
	
	/**
	 * Retrieve Details for a OneDrive's Profile Details
	 *
	 * @return OneDrive Users Profile Details
	 */
	OneDriveUserProfile getUserProfile();
	
	/**
	 * 
	 */
	UserQuota getUserQuota();

}
