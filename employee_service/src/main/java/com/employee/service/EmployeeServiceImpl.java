/**
 * 
 */
package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

/**
 * @author BGORA
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeDao {

	@Autowired
	
	private EmployeeDao employeeDaoImpl;
	public void saveEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.saveEmployee(newEmployee);

	}

	public Employee getById(int employeeId) {
		// TODO Auto-generated method stub
		Employee savedEmployee =
				employeeDaoImpl.getById(employeeId);
		return savedEmployee;
	}

	public Employee getByEmail(String email) {
		// TODO Auto-generated method stub
		Employee savedEmployee =
				employeeDaoImpl.getByEmail(email);
		return savedEmployee;
	}
	public List<Employee> findAll(){
		List <Employee> result = employeeDaoImpl.findAll();
		
		return result;
	}

}
