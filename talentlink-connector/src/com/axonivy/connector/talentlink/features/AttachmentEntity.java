package com.axonivy.connector.talentlink.features;

public class AttachmentEntity {

	private String mimeType;
	private String fileName;
	private String base64EncodedContent;
	
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getBase64EncodedContent() {
		return base64EncodedContent;
	}
	public void setBase64EncodedContent(String base64EncodedContent) {
		this.base64EncodedContent = base64EncodedContent;
	}
	
	
}
