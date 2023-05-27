package student.controler;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import student.dao.Studentdao;
import student.dto.StudentDto;

 @WebServlet("/insert")

public class Studentcontriller extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String student_id = arg0.getParameter("sid");
		String student_name = arg0.getParameter("sname");
		String gender = arg0.getParameter("gender");
		String student_num = arg0.getParameter("num");



		int sid1 = Integer.parseInt(student_id);
		long num1 = Long.parseLong(student_num);

		
		StudentDto dto = new StudentDto();
		dto.setId(sid1);
		dto.setSname(student_name);
		dto.setGender(gender);
		dto.setNum(num1);


		
		Studentdao studentdao = new Studentdao();

		studentdao.insert (dto);
		
		
	}

}
