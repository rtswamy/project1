package student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.cj.x.protobuf.MysqlxCursor.Fetch;

import student.dto.StudentDto;

public class Studentdao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insert(StudentDto d1) {
		et.begin();
		em.persist(d1);
		et.commit();
	}

	public String delete(int d1)
	{
		StudentDto std=em.find(StudentDto.class,d1 );
		if (std != null) {
			et.begin();
			em.remove(std);
			et.commit();
			return "data is deleted";

		} else {

			return "no data found";

		}

	}

	public void update(int id , long num1) {
		StudentDto d1=em.find(StudentDto.class,id);

		d1.setNum(num1);
		et.begin();
		em.persist(d1);
		et.commit();
	}

	public  StudentDto fetch(int sid2) {

		StudentDto data =em.find(StudentDto.class, sid2);

		return data;


	}

	public List<StudentDto> fetchall() {

		Query qu =em.createQuery("select data from StudentDto data");
		List<StudentDto> List = qu.getResultList();
		return  List;
	}



	public void deleteall(int sid) {
		StudentDto std1=em.find(StudentDto.class,sid );
		et.begin();
		em.remove(std1);
		et.commit();

	}

	public void update1(StudentDto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
	}


}


