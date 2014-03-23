package org.springframework.social.onedrive.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.onedrive.api.FriendlyNameOperations;
import org.springframework.social.onedrive.api.OneDrive;
import org.springframework.social.onedrive.api.UserOperations;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class OneDriveTemplate extends AbstractOAuth2ApiBinding implements OneDrive {

	private UserOperations userOperations;
	private FriendlyNameOperations friendlynameOperations;
	
	public OneDriveTemplate() {
		initialize();
	}
	
	public OneDriveTemplate(String accessToken) {
		super(accessToken);
	}
	
	@Override
	public UserOperations userOperations() {

		return userOperations;
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

		userOperations = new UserTemplate(getRestTemplate(), isAuthorized());
		friendlynameOperations = new FriendlyNameTemplate(getRestTemplate(),isAuthorized());
	}
	
}
