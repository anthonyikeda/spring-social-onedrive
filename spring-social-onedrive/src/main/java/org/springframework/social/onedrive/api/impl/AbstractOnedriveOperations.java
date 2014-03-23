package org.springframework.social.onedrive.api.impl;

import java.net.URI;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;
import org.springframework.util.MultiValueMap;

public class AbstractOnedriveOperations {
	
	private boolean isAuthorized;
		
	public AbstractOnedriveOperations(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}
	
	public URI buildURI(String path) {
		
		URI uri = URIBuilder.fromUri(BASE_URL + path).build();
		return uri;
	}
	
	public URI buildURI(String path, String name, String value) {
		
		URI uri = URIBuilder.fromUri(BASE_URL+path).queryParam(name, value).build();		
		return uri;
	}
	
	public URI buildURI(String path, MultiValueMap<String, String> queryParams) {
		
		URI uri = URIBuilder.fromUri(BASE_URL + path).queryParams(queryParams).build();
		return uri;
	}
	
	private static final String BASE_URL = "https://apis.live.net/v5.0";

}
