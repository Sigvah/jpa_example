package no.hvl.dat250.jpa.basicexample;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class GetRequest {

	public static void main(String[] args) {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://localhost:8080/todo")
		  .get()
		  .build();

		System.out.println(request.toString());
		
		try (Response response = client.newCall(request).execute()) {
		      System.out.println (response.body().string());
		    }
	   catch (IOException e) {
		   e.printStackTrace();
	   }
	}

}
