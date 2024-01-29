package com.hexaware.springbootweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springbootweb.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeedao{
	
	
JdbcTemplate jdbcTemplate;
	
	@Autowired
	public EmployeeDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		
		System.out.println(jdbcTemplate);
		
	}
	
	public EmployeeDaoImpl() {}

	@Override
	public String addEmployee(Employee emp) {
		String insertQuery = "insert into Employee values(?,?,?);";
		int count = 	jdbcTemplate.update(insertQuery,emp.getEid(),emp.getEname(),emp.getSalary());
		return count + " record inserted";
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		String selectAll = "select * from Employee";
		List<Employee> list = jdbcTemplate.query(selectAll,new EmployeeMapper());
		return list;
	}

	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String update = "update Employee set ename=?,salary=? where eid=?";
		int count = jdbcTemplate.update(update,emp.getEname(),emp.getSalary(),emp.getEid());
		return count + " records Updated.";
	}

	@Override
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		String delete = "delete from Employee where eid=?";
		int count = jdbcTemplate.update(delete,eid);
		return count + " record deleted.";
	}

	@Override
	public Employee selectByEmployeeId(int eid) {
		// TODO Auto-generated method stub
		String id = "select * from Employee where eid =?";
		Employee emp = jdbcTemplate.queryForObject(id,new EmployeeMapper(),eid);
		return emp;
	}

}
