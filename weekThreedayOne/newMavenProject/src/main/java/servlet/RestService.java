package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import dto.User;

/**
 * Servlet implementation class RestService
 */
@WebServlet({"/login"})
public class RestService extends HttpServlet {
	
    
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestService() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() {
    	System.out.println("**************");
    	System.out.println("**************");
    	System.out.println("The Servlet is being initialized");
    	System.out.println("**************");
    	System.out.println("**************");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String path = request.getRequestURI().substring(request.getContextPath().length());
		String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
	    System.out.println("Path: " + path);
		System.out.println("Body: " + body);
	
		User user = null;
		Gson gson = new Gson();
		try {
		user = gson.fromJson(body, User.class);
		} catch (JsonSyntaxException e){
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Bad Json");
		}		
		
		if (user.getUsername() == null || user.getPassword() == null) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Must enter username and password");
		}
		
		if (user.getUsername().length() < 2 || user.getPassword().length() < 5) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Username and password must be greater than 2 and 5 characters respectively");
		}
		System.out.println("User: " + user);
	
		response.setStatus(201);
	}
	
	

}
