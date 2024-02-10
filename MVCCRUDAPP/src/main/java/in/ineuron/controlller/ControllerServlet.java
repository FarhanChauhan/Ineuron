package in.ineuron.controlller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.model.Student;
import in.ineuron.service.IStudentService;
import in.ineuron.servicefactory.StudentServiceFactory;
import in.ineuron.util.HibernateUtil;

@WebServlet(urlPatterns={"/controller/*"},loadOnStartup=1)
public class ControllerServlet extends HttpServlet {
	
	static {
		HibernateUtil.startUp();
	}
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		IStudentService stdService = StudentServiceFactory.getStudentService();
				
		System.out.println(request.getRequestURI());
		System.out.println(request.getPathInfo());
	
		if(request.getRequestURI().endsWith("addform"))
		{
			String sname =  request.getParameter("sname");
			String sage =  request.getParameter("sage");
			String saddr = request.getParameter("saddr");
			
			Student student = new Student();
			student.setSname(sname);
			student.setSage(Integer.parseInt(sage));
			student.setSaddr(saddr);
			
			String status = stdService.addStudent(student);
			RequestDispatcher rd = null;
			request.setAttribute("status",status);
			rd = request.getRequestDispatcher("../insertResult.jsp");
			rd.forward(request,response);

		}
		
		if(request.getRequestURI().endsWith("searchform"))
		{
			String sid = request.getParameter("sid");	
			Student student = stdService.searchStudent(Integer.parseInt(sid));
			request.setAttribute("student",student);
			RequestDispatcher rd = null;
			rd = request.getRequestDispatcher("../display.jsp");
			rd.forward(request,response);		
		}
		
		if(request.getRequestURI().endsWith("deleteform"))
		{
			String sid = request.getParameter("sid");	
			String status = stdService.deleteStudent(Integer.parseInt(sid));
			RequestDispatcher rd = null;
			request.setAttribute("status",status);
			rd = request.getRequestDispatcher("../deleteResult.jsp");
			rd.forward(request,response);		
		}
		
		if(request.getRequestURI().endsWith("editform"))
		{
			String sid = request.getParameter("sid");	
			Student student = stdService.searchStudent(Integer.parseInt(sid));
			request.setAttribute("student",student);
			RequestDispatcher rd = null;
			rd = request.getRequestDispatcher("../updateForm.jsp");
			rd.forward(request, response);
		}
		
		if (request.getRequestURI().endsWith("updateRecord")) {
			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			String sage = request.getParameter("sage");
			String saddr = request.getParameter("saddr");

			Student student = new Student();
			student.setSid(Integer.parseInt(sid));
			student.setSaddr(saddr);
			student.setSname(sname);
			student.setSage(Integer.parseInt(sage));

			System.out.println("====================");
			String status = stdService.updateStudent(student);
			request.setAttribute("status",status);
			RequestDispatcher rd = null;
			rd = request.getRequestDispatcher("../updateResult.jsp");
			rd.forward(request, response);
			

		}
	}

}
