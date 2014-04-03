package org.springframework.social.onedrive.connect;

import org.springframework.social.oauth2.OAuth2Template;

public class OneDriveOAuth2Template extends OAuth2Template {
	
	public OneDriveOAuth2Template(String clientId, String clientSecret) {
		
		super(clientId,clientSecret,"https://oauth.live.com/authorize","https://oauth.live.com/token");
		setUseParametersForClientAuthentication(true);
	}
	
}
