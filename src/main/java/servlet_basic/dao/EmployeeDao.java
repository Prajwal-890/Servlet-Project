package servlet_basic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_basic.dto.EmployeeDto;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(EmployeeDto e) {
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
	}

	public String delete(int id) {
		EmployeeDto e1 = entityManager.find(EmployeeDto.class, id); // it finds the object in a table
		if (e1 != null) {
			entityTransaction.begin();
			entityManager.remove(e1);
			entityTransaction.commit();
			return "data is deleted";
		} else {

			return "data not found";
		}
	}

	public Object fetch(int id) {
		EmployeeDto e2 = entityManager.find(EmployeeDto.class, id);
		if (e2 != null) {
			return e2; // class type
		}
		return "data is not found"; // String type
	}

	public EmployeeDto findid(int id) {
		EmployeeDto e1 = entityManager.find(EmployeeDto.class, id);
		return e1;
	}

	public List<EmployeeDto> fetchAll() {
		Query q = entityManager.createQuery("select data from EmployeeDto data");
		List<EmployeeDto> e = q.getResultList();
		return e;
	}

	public void update(EmployeeDto e2) {
		entityTransaction.begin();
		entityManager.merge(e2);
		entityTransaction.commit();
	}

	public String deleteAll() {
		Query q = entityManager.createQuery("select data from EmployeeDto data");
		List<EmployeeDto> e = q.getResultList();
		if (e.isEmpty()) {
			return "no data found";
		} else {
			for (EmployeeDto emp : e) {
				entityTransaction.begin();
				entityManager.remove(emp);
				entityTransaction.commit();
			}
			return "data is deleted";
		}
	}

}
