package com.ekkaratp.aekservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

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
}
