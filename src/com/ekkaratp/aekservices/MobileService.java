package com.ekkaratp.aekservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
	
}
