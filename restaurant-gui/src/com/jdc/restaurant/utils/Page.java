package com.jdc.restaurant.utils;

public enum Page {

	Home("The Restaurant", "RestaurantHome"), 
	Tables("Table Management", "TableManagement"), 
	OrderStatus("Order Status", "OrderStatus"),
	Categories("Category Management", "CategoryManagement"), 
	Menus("Menu Management", "MenuManagement"), 
	Sales("Sale History", "SaleHistory"), 
	SaleManagement("Sales Management", "SaleManagement"), 
	Employees("Employee Management", "EmployeeManagement");

	private String title;
	private String viewFile;

	private Page(String title, String viewFile) {
		this.title = title;
		this.viewFile = viewFile;
	}

	public String getViewFile() {
		return viewFile.concat(".fxml");
	}

	public String getTitle() {
		return title;
	}
}
