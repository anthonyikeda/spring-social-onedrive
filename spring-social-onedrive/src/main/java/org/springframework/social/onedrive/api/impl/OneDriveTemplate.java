package org.springframework.social.onedrive.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.onedrive.api.FriendlyNameOperations;
import org.springframework.social.onedrive.api.OneDrive;
import org.springframework.social.onedrive.api.OneDriveUserProfile;
import org.springframework.social.onedrive.api.UserQuota;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class OneDriveTemplate extends AbstractOAuth2ApiBinding implements OneDrive {

	private FriendlyNameOperations friendlynameOperations;
	
	public OneDriveTemplate() {
		initialize();
	}
	
	@Override
	public OneDriveUserProfile getUserProfile() {
		return getRestTemplate().getForObject(USER_ACCOUNT_INFO_URL,OneDriveUserProfile.class);		
	}

	@Override
	public UserQuota getUserQuota() {

		return getRestTemplate().getForObject(USER_QUOTA_URL,UserQuota.class);
	}

	@Override
	public FriendlyNameOperations friendlyNameOperations() {

		return friendlynameOperations;
	}

	/**
	 * Private Helpers.
	 */
	private void initialize() {
		
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initsubs();
	}
	
	private void initsubs() {

		friendlynameOperations = new FriendlyNameTemplate();
	}
	
	/**
	 * URL Constants.
	 */
	public static final String USER_ACCOUNT_INFO_URL = "/me";
	public static final String USER_QUOTA_URL = "/me/skydrive/quota";
}
