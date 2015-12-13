
package com.linbao.api.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.linbao.api.model.User;
import com.linbao.api.model.support.ResponseWrapper;

/**
 * Single Object of User
 * 
 */
@Path("users")
public class UsersResource {

	/**
	 * This requests require authentication
	 * 
	 * @param accessToken
	 * 
	 */
	@POST
	@Consumes("multipart/form-data")
	@Produces({ "application/json" })
	public Response postUsers(@HeaderParam("access_token") String accessToken, User entity) throws Exception{
		return ResponseWrapper.withJsonCreated(null);
	}

	/**
	 * To edit or update a User
	 * 
	 * @param accessToken
	 * 
	 */
	@PUT
	@Consumes("multipart/form-data")
	public Response putUsers(@HeaderParam("access_token") String accessToken, User entity) throws Exception{
		return ResponseWrapper.ok(null).build();
	}

	/**
	 * Delete a User by given id
	 * 
	 * @param id
	 *            The identification of User
	 */
	@DELETE
	@Produces({ "application/json" })
	Response deleteUsers(@QueryParam("id") String id) throws Exception{
		return ResponseWrapper.ok().build();
	}

	/**
	 * Get User object
	 * 
	 * @param id
	 *            The identification of the User
	 */
	@GET
	public Response getUsers(@QueryParam("id") String id) throws Exception{
		return ResponseWrapper.withJsonOK(new User());
	}

	/**
	 * get collection of User
	 * 
	 * @param limit
	 *            The number of items per page
	 * @param page
	 *            The page to be requested
	 */
	@GET
	@Path("list")
	@Produces({ "application/json" })
	public Response getUsersList(@QueryParam("page") @DefaultValue("1") long page,
			@QueryParam("limit") @DefaultValue("10") long limit) throws Exception{
		List<User> list = new ArrayList<User>();
		return ResponseWrapper.withJsonOK(list);
	}

	/**
	 * Specify the page that you want to retrieve
	 * 
	 * @param name
	 * 
	 * @param limit
	 *            The number of items per page
	 * @param page
	 *            The page to be requested
	 */
	@GET
	@Path("search")
	@Produces({ "application/json" })
	public Response getUsersSearch(@QueryParam("name") String name, @QueryParam("page") @DefaultValue("1") long page,
			@QueryParam("limit") @DefaultValue("10") long limit) throws Exception{
		List<User> list = new ArrayList<User>();
		return ResponseWrapper.withJsonOK(list); 
	}

	/**
	 * 
	 * @param id
	 *            Uri parameter, path parameter start with any numberic will
	 *            take the call into this method
	 */
	@GET
	@Path("{id}")
	@Produces({ "application/json" })
	Response getUsersById(@PathParam("id") String id) throws Exception{
		return ResponseWrapper.withJsonOK(new User());
	}

}
