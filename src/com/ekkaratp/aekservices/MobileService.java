package com.ekkaratp.aekservices;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@Path("/")
public class MobileService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/apkversion")
	public AppUpdateInfo apkVersion() {
		AppUpdateInfo app = new AppUpdateInfo();
		return app;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/adddata")
	public String addData() {
		boolean ret = false;
		
//		DatastoreService  datastore = DatastoreServiceFactory.getDatastoreService();
//		Entity app = new Entity("AppUpdateInfo", "AppUpdateInfo");
//		app.setProperty("version", "1.2");
//		app.setProperty("url", "http://dl.dropbox.com/u/23458376/TestUpdate.apk");
//		datastore.put(app);
		ret = true;
		return String.valueOf(ret);
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hello")
	public String hello(@QueryParam("name") String name) {
		return String.format("Hello %s", name);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/register")	
	public String register(@QueryParam("id") String id,@QueryParam("phone")  String phone) {
		int ret = 1;
		if (id != null && phone != null) {
			if (id.length() > 0 && phone.length() > 0) {
				try {
					DatastoreService  datastore = DatastoreServiceFactory.getDatastoreService();
					Entity app = new Entity("TUCRegister", "TUCRegister");
					app.setProperty("id", id);
					app.setProperty("phone", phone);
					datastore.put(app);				
					ret = 0;
					
				} catch (Exception ex) {
					
				}
			}
		}
		return String.valueOf(ret);
	}
	
	
}
