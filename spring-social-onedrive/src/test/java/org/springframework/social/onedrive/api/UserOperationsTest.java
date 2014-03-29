package org.springframework.social.onedrive.api;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.social.test.client.RequestMatchers.*;
import static org.springframework.social.test.client.ResponseCreators.withResponse;

import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserOperationsTest extends AbstractOneDriveApiTest {

	@Test
	public void getUserProfile() {
		
		mockServer.expect(requestTo(BASE_URL + "/me"))
				.andExpect(method(GET))
				//.andExpect(header("",""))
				.andRespond(withResponse(jsonResource("me"),responseHeaders));
		
		OneDriveUserProfile userprofile = onedrive.userOperations().getUserProfile();
		assertNotNull(userprofile);
		assertEquals("Suresh Kumar",userprofile.getName());
		
	}
	
	@Test
	public void getUserStorage() {
		
		mockServer.expect(requestTo(BASE_URL + "/me/skydrive/quota"))
		.andExpect(method(GET))
		//.andExpect(header("",""))
		.andRespond(withResponse(jsonResource("quota"),responseHeaders));

		UserQuota userquota = onedrive.userOperations().getUserQuota();
		assertNotNull(userquota);
		BigInteger av = new BigInteger("10731578810");
		assertEquals(av,userquota.getAvailable());
		
	}
}
