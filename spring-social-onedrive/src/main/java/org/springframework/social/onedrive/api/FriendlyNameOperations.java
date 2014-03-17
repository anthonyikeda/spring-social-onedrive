package org.springframework.social.onedrive.api;

/**
 * Accessing OneDrive folders using Friendly Names.
 * 
 * @author Suresh Kumar (yarli4u).
 *
 */
public interface FriendlyNameOperations {

	void getCameraRoll();
	void getMyDocuments();
	void getMyPhotos();
	void getPublicDocuments();
	void getRecentDocuments();
}
