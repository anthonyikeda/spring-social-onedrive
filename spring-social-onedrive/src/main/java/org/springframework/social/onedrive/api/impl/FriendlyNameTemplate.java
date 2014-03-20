package org.springframework.social.onedrive.api.impl;

import java.util.List;

import org.springframework.social.onedrive.api.FriendlyNameOperations;
import org.springframework.social.onedrive.api.Metadata;

public class FriendlyNameTemplate implements FriendlyNameOperations {

	@Override
	public List<Metadata> getCameraRoll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Metadata> getMyDocuments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Metadata> getMyPhotos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Metadata> getPublicDocuments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Metadata> getRecentDocuments() {
		// TODO Auto-generated method stub
		return null;

	}

	
	//
	public static final String ME_DOCUMENTS_URL="/me/skydrive/my_documents";
	public static final String ME_CAMERA_ROLL_URL="/me/skydrive/camera_roll";
	public static final String ME_PHOTOS_URl="/me/skydrive/my_photos";
	public static final String ME_PUBLIC_DOCUMENTS_URL="/me/skydrive/public_documents";
}
