package com.example.tidu.campusassistant.ChatPost;


import com.google.gson.annotations.SerializedName;


public class Headers{

	@SerializedName("x-global-transaction-id")
	private String xGlobalTransactionId;

	@SerializedName("date")
	private String date;

	@SerializedName("content-length")
	private String contentLength;

	@SerializedName("x-response-time")
	private String xResponseTime;

	@SerializedName("x-watson-session-timeout")
	private String xWatsonSessionTimeout;

	@SerializedName("x-edgeconnect-origin-mex-latency")
	private String xEdgeconnectOriginMexLatency;

	@SerializedName("access-control-allow-headers")
	private String accessControlAllowHeaders;

	@SerializedName("x-frame-options")
	private String xFrameOptions;

	@SerializedName("x-download-options")
	private String xDownloadOptions;

	@SerializedName("access-control-allow-methods")
	private String accessControlAllowMethods;

	@SerializedName("strict-transport-security")
	private String strictTransportSecurity;

	@SerializedName("access-control-allow-origin")
	private String accessControlAllowOrigin;

	@SerializedName("access-control-max-age")
	private String accessControlMaxAge;

	@SerializedName("content-security-policy")
	private String contentSecurityPolicy;

	@SerializedName("x-content-type-options")
	private String xContentTypeOptions;

	@SerializedName("x-xss-protection")
	private String xXssProtection;

	@SerializedName("x-dns-prefetch-control")
	private String xDnsPrefetchControl;

	@SerializedName("x-dp-watson-tran-id")
	private String xDpWatsonTranId;

	@SerializedName("x-edgeconnect-midmile-rtt")
	private String xEdgeconnectMidmileRtt;

	@SerializedName("content-type")
	private String contentType;

	@SerializedName("connection")
	private String connection;

	public void setXGlobalTransactionId(String xGlobalTransactionId){
		this.xGlobalTransactionId = xGlobalTransactionId;
	}

	public String getXGlobalTransactionId(){
		return xGlobalTransactionId;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setContentLength(String contentLength){
		this.contentLength = contentLength;
	}

	public String getContentLength(){
		return contentLength;
	}

	public void setXResponseTime(String xResponseTime){
		this.xResponseTime = xResponseTime;
	}

	public String getXResponseTime(){
		return xResponseTime;
	}

	public void setXWatsonSessionTimeout(String xWatsonSessionTimeout){
		this.xWatsonSessionTimeout = xWatsonSessionTimeout;
	}

	public String getXWatsonSessionTimeout(){
		return xWatsonSessionTimeout;
	}

	public void setXEdgeconnectOriginMexLatency(String xEdgeconnectOriginMexLatency){
		this.xEdgeconnectOriginMexLatency = xEdgeconnectOriginMexLatency;
	}

	public String getXEdgeconnectOriginMexLatency(){
		return xEdgeconnectOriginMexLatency;
	}

	public void setAccessControlAllowHeaders(String accessControlAllowHeaders){
		this.accessControlAllowHeaders = accessControlAllowHeaders;
	}

	public String getAccessControlAllowHeaders(){
		return accessControlAllowHeaders;
	}

	public void setXFrameOptions(String xFrameOptions){
		this.xFrameOptions = xFrameOptions;
	}

	public String getXFrameOptions(){
		return xFrameOptions;
	}

	public void setXDownloadOptions(String xDownloadOptions){
		this.xDownloadOptions = xDownloadOptions;
	}

	public String getXDownloadOptions(){
		return xDownloadOptions;
	}

	public void setAccessControlAllowMethods(String accessControlAllowMethods){
		this.accessControlAllowMethods = accessControlAllowMethods;
	}

	public String getAccessControlAllowMethods(){
		return accessControlAllowMethods;
	}

	public void setStrictTransportSecurity(String strictTransportSecurity){
		this.strictTransportSecurity = strictTransportSecurity;
	}

	public String getStrictTransportSecurity(){
		return strictTransportSecurity;
	}

	public void setAccessControlAllowOrigin(String accessControlAllowOrigin){
		this.accessControlAllowOrigin = accessControlAllowOrigin;
	}

	public String getAccessControlAllowOrigin(){
		return accessControlAllowOrigin;
	}

	public void setAccessControlMaxAge(String accessControlMaxAge){
		this.accessControlMaxAge = accessControlMaxAge;
	}

	public String getAccessControlMaxAge(){
		return accessControlMaxAge;
	}

	public void setContentSecurityPolicy(String contentSecurityPolicy){
		this.contentSecurityPolicy = contentSecurityPolicy;
	}

	public String getContentSecurityPolicy(){
		return contentSecurityPolicy;
	}

	public void setXContentTypeOptions(String xContentTypeOptions){
		this.xContentTypeOptions = xContentTypeOptions;
	}

	public String getXContentTypeOptions(){
		return xContentTypeOptions;
	}

	public void setXXssProtection(String xXssProtection){
		this.xXssProtection = xXssProtection;
	}

	public String getXXssProtection(){
		return xXssProtection;
	}

	public void setXDnsPrefetchControl(String xDnsPrefetchControl){
		this.xDnsPrefetchControl = xDnsPrefetchControl;
	}

	public String getXDnsPrefetchControl(){
		return xDnsPrefetchControl;
	}

	public void setXDpWatsonTranId(String xDpWatsonTranId){
		this.xDpWatsonTranId = xDpWatsonTranId;
	}

	public String getXDpWatsonTranId(){
		return xDpWatsonTranId;
	}

	public void setXEdgeconnectMidmileRtt(String xEdgeconnectMidmileRtt){
		this.xEdgeconnectMidmileRtt = xEdgeconnectMidmileRtt;
	}

	public String getXEdgeconnectMidmileRtt(){
		return xEdgeconnectMidmileRtt;
	}

	public void setContentType(String contentType){
		this.contentType = contentType;
	}

	public String getContentType(){
		return contentType;
	}

	public void setConnection(String connection){
		this.connection = connection;
	}

	public String getConnection(){
		return connection;
	}

	@Override
 	public String toString(){
		return 
			"Headers{" + 
			"x-global-transaction-id = '" + xGlobalTransactionId + '\'' + 
			",date = '" + date + '\'' + 
			",content-length = '" + contentLength + '\'' + 
			",x-response-time = '" + xResponseTime + '\'' + 
			",x-watson-session-timeout = '" + xWatsonSessionTimeout + '\'' + 
			",x-edgeconnect-origin-mex-latency = '" + xEdgeconnectOriginMexLatency + '\'' + 
			",access-control-allow-headers = '" + accessControlAllowHeaders + '\'' + 
			",x-frame-options = '" + xFrameOptions + '\'' + 
			",x-download-options = '" + xDownloadOptions + '\'' + 
			",access-control-allow-methods = '" + accessControlAllowMethods + '\'' + 
			",strict-transport-security = '" + strictTransportSecurity + '\'' + 
			",access-control-allow-origin = '" + accessControlAllowOrigin + '\'' + 
			",access-control-max-age = '" + accessControlMaxAge + '\'' + 
			",content-security-policy = '" + contentSecurityPolicy + '\'' + 
			",x-content-type-options = '" + xContentTypeOptions + '\'' + 
			",x-xss-protection = '" + xXssProtection + '\'' + 
			",x-dns-prefetch-control = '" + xDnsPrefetchControl + '\'' + 
			",x-dp-watson-tran-id = '" + xDpWatsonTranId + '\'' + 
			",x-edgeconnect-midmile-rtt = '" + xEdgeconnectMidmileRtt + '\'' + 
			",content-type = '" + contentType + '\'' + 
			",connection = '" + connection + '\'' + 
			"}";
		}
}