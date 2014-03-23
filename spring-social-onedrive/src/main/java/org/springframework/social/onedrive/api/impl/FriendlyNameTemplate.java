package org.springframework.social.onedrive.api.impl;

import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.social.onedrive.api.FriendlyNameOperations;
import org.springframework.social.onedrive.api.Metadata;
import org.springframework.web.client.RestTemplate;

public class FriendlyNameTemplate extends AbstractOnedriveOperations implements FriendlyNameOperations {

	private final RestTemplate restTemplate;
	
	public FriendlyNameTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Metadata> getCameraRoll() {

		return getMetadataList(ME_CAMERA_ROLL_URL);		
	}

	@Override
	public List<Metadata> getMyDocuments() {
		
		return getMetadataList(ME_DOCUMENTS_URL);
	}

	@Override
	public List<Metadata> getMyPhotos() {
		
		return getMetadataList(ME_PHOTOS_URL);
	}

	@Override
	public List<Metadata> getPublicDocuments() {
		
		return getMetadataList(ME_PUBLIC_DOCUMENTS_URL);
	}

	@Override
	public List<Metadata> getRecentDocuments() {
		
		return getMetadataList(ME_RECENT_DOCUMENTS_URL);
	}

	//private helpers.
	private List<Metadata> getMetadataList(String path) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = restTemplate.getForObject(buildURI(path), JsonNode.class);
		
		try {
			return objectMapper.readValue(jsonNode, new TypeReference<List<Metadata>>() {});
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	//URL Constants.
	public static final String ME_DOCUMENTS_URL="/me/skydrive/my_documents";
	public static final String ME_CAMERA_ROLL_URL="/me/skydrive/camera_roll";
	public static final String ME_PHOTOS_URL="/me/skydrive/my_photos";
	public static final String ME_PUBLIC_DOCUMENTS_URL="/me/skydrive/public_documents";
	public static final String ME_RECENT_DOCUMENTS_URL="/me/skydrive/recent_docs";
	
}