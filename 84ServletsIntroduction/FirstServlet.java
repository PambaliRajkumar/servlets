import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet 
{ 
	static 
	{
		System.out.println("FirstServlet Loading....");
	}
	
	public FirstServlet()
	{
		System.out.println("FirstServlet Instantiation....");
	}
	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("FirstServlet Initialization....");
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
	
	public String getServletInfo(){
		return "Raj";
	}
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		System.out.println("FirstServlet giving service .....");
		PrintWriter out = res.getWriter();
		out.println("<h1>Hello Servlet....</h1>");
		out.close();
	}
	public void destroy(){
		System.out.println("FirstServlet DeInstantiation.....");
	}
}