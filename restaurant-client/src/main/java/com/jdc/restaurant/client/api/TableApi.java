package com.jdc.restaurant.client.api;

import java.util.List;

import com.jdc.restaurant.client.dto.Table;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TableApi{

	@POST("/tables")
	Call<Table> create(@Body Table data);
	
	@POST("/tables/upload")
	Call<List<Table>> upload(@Body List<Table> data);

	@PUT("/tables")
	Call<Table> update(@Body Table data);
	
	@GET("/tables/{id}")
	Call<Table> findById(@Path("id") long id);
	
	@GET("/tables")
	Call<List<Table>> findAll();
	
	@GET("/tables/search")
	Call<List<Table>> search(@Query("number") String number);
	
}
