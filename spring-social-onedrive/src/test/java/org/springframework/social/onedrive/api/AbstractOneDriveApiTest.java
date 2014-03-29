package org.springframework.social.onedrive.api;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.onedrive.api.impl.OneDriveTemplate;
import org.springframework.social.test.client.MockRestServiceServer;

public class AbstractOneDriveApiTest {
	
	protected static final String ACCESS_TOKEN = "EwCIAq1DBAAUGCCXc8wU/zFu9QnLdZXy+YnElFkAAZZtTvFgaakcG4hm8jKvCcpfWTGtcqTLRiDoKd8UXs3M+mRMM1oNe0v6HIuXcN3syVPU5TQzj7MkjKGi+T4YBdmbHRDODpHI1u247+xHcZD1gA0X3y6te37vTi6jZFiWTKoC2T0jAk1fTv4FSdfYLV8vc19ZozsonpQ3OQs7FHf6fwnoWBvNcOvpXqhw9grKL66SYW5XgWs35t5DOJ5jw8XZzMPMzEJdQnxOEMkCzeTQmwEUm3gOIZEgoomXVOKWBxD/iTnS0ASSpSVvG10xIJDnzFsIpM4uK7nEkzvAvhN9cc0yxTeMqi641FNYpxp9Gs0AjmWy9wqx2EeIeIt9zwsDZgAACA3NOrHwksw6WAEe3bZuQLUaWrFvMlpTrRGqslImEWUUxsC0fov0w03deM8c60LPXcHTh5oLrO3Evrr/kZlTWyTkFTk+MVPxQrv/X2DbFrbR8Wod1Tf9LsFt5M7LmW9g0VjPjz9376VPMBa89Qd8DkFkjU5iYuDOO0NdNHH/y9K88VT678+ZnwHlfTTQcQYdkdoNnAQ/p/btxUEUWbRsfTDkq+o40szftXFU1wgjEUglCR/75JtfkHZ+BLSh3OZ9ZAcAJCgA39Z47Z0YhW1uEKmD9BigEO5Q+j0L29SdCDbn2lcCWDxgymgWWxxWcxZl/vgOnJwFpQHapubR+hpO7AqzFINigdc37kYEIa7eDe19TQ1VNY8l3IQBv8jKlKP6VFl7hgfFjBi0PEHLEVYue7ylxfeiUxMnP3eOwfj6gHvxW6cc28cf9kBWP1ZWp23+6Yz3Wcdyr1JmIoqe6lJsjtdy9mMB";
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
