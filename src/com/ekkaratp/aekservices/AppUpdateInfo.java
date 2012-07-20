package com.ekkaratp.aekservices;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "appupdateinfo")
public class AppUpdateInfo {

	@XmlElement(name = "version")
	public String getVesion() {
		return "1.1";
	}
	
	@XmlElement(name = "url")	
	public String getAppUrl() {
		return "http://dl.dropbox.com/u/23458376/TestUpdate.apk";
	}
	
}
