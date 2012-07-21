package com.ekkaratp.aekservices;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;



@XmlRootElement(name = "appupdateinfo")
public class AppUpdateInfo {

	private String _version = "";
	private String _url = "";
	
	public AppUpdateInfo() {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query query = new Query("AppUpdateInfo");
		List<Entity> results = datastore.prepare(query).asList(FetchOptions.Builder.withDefaults());
		if (results != null && results.size() > 0) {
			_version = results.get(0).getProperty("version").toString();
			_url = results.get(0).getProperty("url").toString();
		}
		
	}
	
	@XmlElement(name = "version")
	public String getVesion() {
		return _version;
	}
	
	@XmlElement(name = "url")	
	public String getAppUrl() {
		return _url;
	}
	
}
