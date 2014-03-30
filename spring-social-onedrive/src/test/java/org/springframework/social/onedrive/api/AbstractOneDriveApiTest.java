package org.springframework.social.onedrive.api;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.onedrive.api.impl.OneDriveTemplate;
import org.springframework.social.test.client.MockRestServiceServer;

public class AbstractOneDriveApiTest {
	
	protected static final String ACCESS_TOKEN = "";
	protected static final String BASE_URL = "https://apis.live.net/v5.0";
	
	protected OneDriveTemplate onedrive;
	protected MockRestServiceServer mockServer;
	protected HttpHeaders responseHeaders;
	
	@Before
	public void setup() {
		
		onedrive = new OneDriveTemplate(ACCESS_TOKEN);
		mockServer = MockRestServiceServer.createServer(onedrive.getRestTemplate());
		responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.APPLICATION_JSON);
	}
	
	protected Resource jsonResource(String filename) {
		return new ClassPathResource("testdata/" + filename + ".json", getClass());
	}
}
