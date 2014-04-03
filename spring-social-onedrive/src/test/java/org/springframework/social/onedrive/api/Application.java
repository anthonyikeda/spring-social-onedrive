package org.springframework.social.onedrive.api;

import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.onedrive.api.impl.OneDriveTemplate;
import org.springframework.social.onedrive.connect.OneDriveConnectionFactory;

public class Application {

	public static void main(String[] args) {
		
		String appId = "00000000400F3DB0";
		String appSecret = "s7nwTXe1lkiI7uF7J5Wq4Eb68ALfSdUt";
		String appToken = fetchApplicationAccessToken(appId, appSecret); 
		OneDriveUserProfile profile = fetchApplicationData(appId, appToken);
		
		System.out.println("First Name:"+profile.getFirstName());
		System.out.println("Last Nmae:"+profile.getLastName());
		    
	}

	 private static OneDriveUserProfile fetchApplicationData(String appId, String appToken) {
		 
	        OneDrive onedrive = new OneDriveTemplate(appToken);
	        OneDriveUserProfile profile = onedrive.userOperations().getUserProfile();
	        return profile;
	    }

	private static String fetchApplicationAccessToken(String appId, String appSecret) {
    	
        OAuth2Operations oauth = new OneDriveConnectionFactory(appId, appSecret).getOAuthOperations();
        
        return oauth.authenticateClient().getAccessToken();
    }

}
