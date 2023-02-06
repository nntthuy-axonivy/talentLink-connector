package com.axonivy.connector.talentlink.connector.test;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Hidden;

@Path("talentlinkMock")
@PermitAll
@Hidden
public class TalentlinkServiceMock extends AbstractServiceMock{
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("candidate")
	public Response getCandidateById(
			@QueryParam(value = "$candidateId") Long candidateId) {
		return Response.ok(load("json/candidates.json")).type(MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("department")
	public Response getDepartmentById(
			@QueryParam(value = "$departmentId") Long departmentId) {
		return Response.ok(load("json/departments.json")).type(MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("position")
	public Response getPositionById(
			@QueryParam(value = "$positionId") Long positionId) {
		return Response.ok(load("json/positions.json")).type(MediaType.APPLICATION_JSON).build();
	}
}
