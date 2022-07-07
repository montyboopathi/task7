package com.kmbtask6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HashTable extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		int Id = Integer.parseInt(request.getParameter("Id"));
		PrintWriter prw = response.getWriter();

		Hashtable<Integer, GetEmployeeDetails> ht = new Hashtable<Integer, GetEmployeeDetails>();
		System.out.println("Creating Employee Details");
		GetEmployeeDetails gmd = new GetEmployeeDetails("Ajith", "ContractEmployee", 101, 50000);
		GetEmployeeDetails gmd1 = new GetEmployeeDetails("vijay", "PermanentEmployee", 102, 60000);
		GetEmployeeDetails gmd2 = new GetEmployeeDetails("Surya", "TemporaryEmployee", 103, 20000);
		ht.put(101, gmd);
		ht.put(102, gmd1);
		ht.put(103, gmd2);

		JSONObject obj = new JSONObject();

		for (Map.Entry<Integer, GetEmployeeDetails> entry : ht.entrySet()) {
			int key = entry.getKey();
			if (key == Id) {
				GetEmployeeDetails ged = ht.get(Id);
				obj.put("ID", ged.Id);
				obj.put("NAME", ged.Name);
				obj.put("SALARY", ged.Salary);
				obj.put("TYPE", ged.Type);
				System.out.println(obj);
				prw.println(obj);
			}
		}

	}

}
