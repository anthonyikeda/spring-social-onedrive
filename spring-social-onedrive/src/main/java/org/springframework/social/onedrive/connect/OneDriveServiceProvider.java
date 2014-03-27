package org.springframework.social.onedrive.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.onedrive.api.OneDrive;
import org.springframework.social.onedrive.api.impl.OneDriveTemplate;

public class OneDriveServiceProvider extends AbstractOAuth2ServiceProvider<OneDrive> {
	
	public OneDriveServiceProvider(String clientId, String clientSecret) {
		
		super(new OneDriveOAuth2Template(clientId, clientSecret));
	}

	@Override
	public OneDrive getApi(String accessToken) {

		return new OneDriveTemplate(accessToken);
	}
	
}
