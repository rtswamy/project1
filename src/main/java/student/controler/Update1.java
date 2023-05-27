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

@WebServlet("/update1")
public class Update1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		String sname=req.getParameter("name");
		String snumber=req.getParameter("number");
		long cnum=Long.parseLong(snumber);
		String sgender=req.getParameter("gender");


		StudentDto dto = new StudentDto();
		dto.setId(cid);
		dto.setSname(sname);
		dto.setGender(sgender);
		dto.setNum(cnum);

		Studentdao student = new Studentdao();

		student.update1 (dto);

		List<StudentDto> l1= student.fetchall();


		req.setAttribute("student list", l1);
		resp.getWriter().print("<h1>DATA HAS BEEN UPDATED</h1>");

		RequestDispatcher dispatcher= req.getRequestDispatcher("result.jsp");
		dispatcher.include(req, resp);



	}
}
