package com.jdc.restaurant.client.api;

import java.util.List;
import java.util.Map;

import com.jdc.restaurant.client.dto.Employee;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface EmployeeApi {
	
	@POST("/employees")
	Call<Employee> create(@Body Employee data);
	
	@PUT("/employees")
	Call<Employee> update(@Body Employee data);
	
	@GET("/employees/{id}")
	Call<Employee> findById(@Path("id") long id);
	
	@GET("/employees")
	Call<List<Employee>> findAll();
	
	@GET("/employees/search")
	Call<List<Employee>> search(@QueryMap Map<String, String> query);

}
