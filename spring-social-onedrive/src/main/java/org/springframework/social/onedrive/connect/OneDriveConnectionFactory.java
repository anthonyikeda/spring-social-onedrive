package org.springframework.social.onedrive.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.onedrive.api.OneDrive;

public class OneDriveConnectionFactory extends OAuth2ConnectionFactory<OneDrive> {

	public OneDriveConnectionFactory(String clientId, String clientSecret) {
		
		super("onedrive",new OneDriveServiceProvider(clientId, clientSecret),new OneDriveAdapter());
	}
}
