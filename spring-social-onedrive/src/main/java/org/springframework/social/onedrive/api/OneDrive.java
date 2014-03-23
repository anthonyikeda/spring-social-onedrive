package org.springframework.social.onedrive.api;

/**
 * 
 * OneDrive Interface.
 * @author Suresh Kumar (yarli4u).
 *
 */

public interface OneDrive {

	/**
	 * User Operations
	 * @return UserOperations
	 */
	
	UserOperations userOperations();
	
	/**
	 * 
	 * @return FriendlyNameOperations
	 */
	FriendlyNameOperations friendlyNameOperations();
	
}
