package org.springframework.social.onedrive.api;

/**
 * 
 * OneDrive Interface.
 * @author Suresh Kumar (yarli4u).
 *
 */

public interface OneDrive {

	FriendlyNameOperations friendlyNameOperations();
	void folderOperations();
	void fileOperations();
}
