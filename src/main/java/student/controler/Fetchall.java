package student.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.Studentdao;
import student.dto.StudentDto;

@WebServlet("/fetchall")
public class Fetchall extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
		 
         
         
         Studentdao dao = new Studentdao();
         List<StudentDto> list = dao.fetchall();
 		
           
         req.setAttribute("student list", list);
         RequestDispatcher rq=req.getRequestDispatcher("result.jsp");
         rq.forward(req, resp);
         
		
	}

}
