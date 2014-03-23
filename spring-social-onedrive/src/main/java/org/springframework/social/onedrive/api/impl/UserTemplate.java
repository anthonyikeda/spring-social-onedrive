package org.springframework.social.onedrive.api.impl;

import org.springframework.social.onedrive.api.OneDriveUserProfile;
import org.springframework.social.onedrive.api.UserOperations;
import org.springframework.social.onedrive.api.UserQuota;
import org.springframework.web.client.RestTemplate;

public class UserTemplate extends AbstractOnedriveOperations implements UserOperations {

	private final RestTemplate restTemplate;
	
	
	public UserTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.restTemplate = restTemplate;
	}
	
	@Override
	public OneDriveUserProfile getUserProfile() {
		
		return restTemplate.getForObject(buildURI(USER_ACCOUNT_INFO_URL),OneDriveUserProfile.class);		
	}

	@Override
	public UserQuota getUserQuota() {

		return restTemplate.getForObject(buildURI(USER_QUOTA_URL),UserQuota.class);
	}

	/**
	 * URL Constants.
	 */
	public static final String USER_ACCOUNT_INFO_URL = "/me";
	public static final String USER_QUOTA_URL = "/me/skydrive/quota";

}
