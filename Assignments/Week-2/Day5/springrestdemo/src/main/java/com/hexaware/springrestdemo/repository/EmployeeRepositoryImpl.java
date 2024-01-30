package com.hexaware.springrestdemo.repository;

import java.util.List;


import javax.sql.DataSource;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hexaware.springrestdemo.repository.EmployeeMapper;
import com.hexaware.springrestdemo.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository{
	JdbcTemplate jdbcTemplate;
	
	public EmployeeRepositoryImpl() {}
	@Autowired
	public EmployeeRepositoryImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public Employee addEmployee(Employee emp) {
	    String insertEmp = "insert into Employee values(?,?,?)";
	    int count = jdbcTemplate.update(insertEmp, emp.getEid(), emp.getEname(), emp.getSalary());
	    if (count > 0) {
	        return emp; 
	    }
	    return null;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		String id = "select * from Employee where eid =?";
		Employee emp = jdbcTemplate.queryForObject(id,new EmployeeMapper(),eid);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		String selectAll = "select * from Employee";
		List<Employee> list = jdbcTemplate.query(selectAll, new EmployeeMapper());
		return list;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
	    String updateEmp = "update Employee set ename = ?, salary = ? where eid = ?";
	    int count = jdbcTemplate.update(updateEmp, emp.getEname(), emp.getSalary(), emp.getEid());
	    if (count > 0) {
	        return emp; 
	    }
	    return null;
	}

	@Override
	public String deleteEmployee(int eid) {
		String delete = "delete from employee where eid = ?";
		int count = jdbcTemplate.update(delete,eid);
		return count + " record deleted.";
	}

}
