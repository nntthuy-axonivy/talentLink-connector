package com.axonivy.connector.talentlink.features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import ch.ivyteam.ivy.environment.Ivy;

public class TalentlinkService {
	
	public static void getAttachmentsFromTalentlinkAndAddThemToCase(String attachmnetId) throws IOException, InterruptedException {
	    String username = "Ricoh Sandbox:axonivy_api:BO";
	    String password = "K2iziebz";
	    String api_key = "14e89284-9994-4eed-61bd-f67ded85af92";
	    String url = "https://apiproxy.shared.lumessetalentlink.com/tlk/rest/candidate/document/"+attachmnetId+"?api_key=" + api_key;

	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(url))
	            .setHeader("Content-Type", "application/json")
	            .setHeader("username", username)
	            .setHeader("password", password)
	            .build();

	    HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
	    
	    Gson gson = new Gson();
	    
	    AttachmentEntity entity = gson.fromJson(response.body().toString(), AttachmentEntity.class); 
	    
	    entity.setFileName("TestFile.pdf");
	    
	    byte[] data = Base64.getMimeDecoder().decode(entity.getBase64EncodedContent());
	    
	    ch.ivyteam.ivy.scripting.objects.File file = new ch.ivyteam.ivy.scripting.objects.File(entity.getFileName(), true);
	    
	    FileUtils.writeByteArrayToFile(file.getJavaFile(), data);
	    
	    Ivy.wfCase().documents().add(file.getAbsolutePath());
	  }

}
