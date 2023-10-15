import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet 
{ 
	static 
	{
		System.out.println("SecondServlet GenericServlet Loading....");
	}
	
	public SecondServlet()
	{
		System.out.println("SecondServlet GenericServlet Instantiation....");
	}
	
	public void init(ServletConfig config) throws ServletException{
		System.out.println("SecondServlet GenericServlet Initialization....");
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
	
	public String getServletInfo(){
		return "Raj";
	}
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		System.out.println("SecondServlet GenericServlet giving service .....");
		PrintWriter out = res.getWriter();
		out.println("<h1>GenericServlet....</h1>");
		out.close();
	}
	public void destroy(){
		System.out.println("SecondServlet GenericServlet DeInstantiation.....");
	}
}