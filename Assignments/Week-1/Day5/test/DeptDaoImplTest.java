package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.DeptDaoImpl;
import dao.IDeptDao;
import entity.Dept;

class DeptDaoImplTest {
	
	static IDeptDao dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		dao = new DeptDaoImpl();
	}

	@Test
	@Disabled
	void testInsert() {
		//fail("Not yet implemented");
		Dept dept = new Dept();
		dept.setDno(70);
		dept.setDname("Chartee");
		dept.setLocation("Chennai");
		int actual = dao.insert(dept);
		assertEquals(1,actual);
		}
	@Test
	@Disabled
	void testUpdate() {
		//fail("Not yet implemented");
		Dept dept = new Dept();
		dept.setDname("Charan");
		dept.setLocation("Chennai");
		dept.setDno(70);
		int actual = dao.update(dept);
		assertEquals(1,actual);
	}
	
	@Test
	void testDelete() {
		//fail("Not yet implemented");
		//Dept dept = new Dept();
		int actual = dao.deleteOne(70);
		assertEquals(1,actual);
	}

	@Test
	@Disabled
	void testSelectAll() {
		//fail("Not yet implemented");
		List<Dept> list = dao.selectAll();
		Dept dept = list.get(0);
		assertTrue(dept.getDno() > 0);
	}

}
