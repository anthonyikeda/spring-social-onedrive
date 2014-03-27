package org.springframework.social.onedrive.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.onedrive.api.OneDrive;
import org.springframework.social.onedrive.api.OneDriveUserProfile;

public class OneDriveAdapter implements ApiAdapter<OneDrive> {

	@Override
	public boolean test(OneDrive onedrive) {

		try {
			onedrive.userOperations().getUserProfile();
			return true;
		} catch(ApiException e) {
			return false;
		}
	}

	@Override
	public void setConnectionValues(OneDrive onedrive, ConnectionValues values) {

		OneDriveUserProfile profile = onedrive.userOperations().getUserProfile();
		values.setDisplayName(profile.getName());
		values.setProviderUserId(profile.getId());
	}

	@Override
	public UserProfile fetchUserProfile(OneDrive onedrive) {

		OneDriveUserProfile profile = onedrive.userOperations().getUserProfile();
		return new UserProfileBuilder().setName(profile.getName()).setFirstName(profile.getFirstName())
				.setLastName(profile.getLastName()).setUsername(profile.getName()).build();
		
	}

	@Override
	public void updateStatus(OneDrive api, String message) {
		// TODO Auto-generated method stub		
	}

}
