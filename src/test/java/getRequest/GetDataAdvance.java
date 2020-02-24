package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
@Test
public class GetDataAdvance {

	
	public void testResponseCode() {
		String link = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		
		int code = get(link).getStatusCode();
		System.out.println("Status code is "+code);
	
		Assert.assertEquals(code, 200);
	}
	
	
	public void testBody() {		
		String link = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		
		String data = get(link).asString();
		long time= get(link).getTime();
		System.out.println("Data is "+data);
		
		System.out.println("Response time "+ time);
	}
}
