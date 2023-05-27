package student.controler;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import student.dao.Studentdao;
import student.dto.StudentDto;


@WebServlet("/fetch")
public class Fetch extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		          String sid1= req.getParameter("sid");
		          int sid2 = Integer.parseInt(sid1);
		          
		          
		          
		          Studentdao dao = new Studentdao();
		          StudentDto data2 = dao.fetch(sid2);
		  		res.getWriter().print(data2);

	}

	

}
