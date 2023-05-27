package student.controler;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import student.dao.Studentdao;

@WebServlet("/update")
public class Update extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String student_id = req.getParameter("sid");
		String student_num = req.getParameter("num");
        int sid1 = Integer.parseInt(student_id);
		long num1 = Long.parseLong(student_num);
		
		
		Studentdao studentdao = new Studentdao();
		studentdao.update(sid1,num1);
			
	}

}
