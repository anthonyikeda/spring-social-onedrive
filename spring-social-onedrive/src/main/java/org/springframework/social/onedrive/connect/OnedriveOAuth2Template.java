package org.springframework.social.onedrive.connect;

import org.springframework.social.oauth2.OAuth2Template;

public class OnedriveOAuth2Template extends OAuth2Template {
	
	public OnedriveOAuth2Template(String clientId, String clientSecret) {
		
		super(clientId,clientSecret,"https://login.live.com/oauth20_authorize.srf","https://login.live.com/oauth20_token.srf");
	}
	
}
