package student.controler;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import student.dao.Studentdao;

@WebServlet("/remove")
public class Studentremove extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String sid1 = req.getParameter("sid");
		int sid2 = Integer.parseInt(sid1);
		Studentdao studentdao = new Studentdao();
		String msg = studentdao.delete(sid2);
		res.getWriter().print(msg);
	}

}
