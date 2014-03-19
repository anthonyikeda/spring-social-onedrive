package org.springframework.social.onedrive.api;

/**
 * 
 * OneDrive Interface.
 * @author Suresh Kumar (yarli4u).
 *
 */

public interface OneDrive {

	/**
	 * Retrieve Details for a OneDrive's Profile Details
	 *
	 * @return OneDrive Users Profile Details
	 */
	OneDriveUserProfile getUserProfile();
	
	/**
	 * 
	 * @return FriendlyNameOperations
	 */
	FriendlyNameOperations friendlyNameOperations();
	void folderOperations();
	void fileOperations();
}
