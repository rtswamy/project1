package student.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.Studentdao;
import student.dto.StudentDto;


@WebServlet("/delete")
public class Delete extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);

		String id=req.getParameter("id");
		int sid= Integer.parseInt(id);
		
		Studentdao studentdao= new Studentdao();
		
		studentdao.deleteall(sid);
		List<StudentDto> l1= studentdao.fetchall();


		req.setAttribute("student list", l1);
		resp.getWriter().print("<h1>DATA HAS BEEN DELETED</h1>");

		RequestDispatcher dispatcher= req.getRequestDispatcher("result.jsp");
		dispatcher.include(req, resp);

		
	}
}
