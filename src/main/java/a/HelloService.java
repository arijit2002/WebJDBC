package a;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class HelloService {
	@Autowired
	private HelloRepository helloRepository;
	
	public Employee getEmployee(int id) {
		Map<String, Object> m = helloRepository.findById(id);
		int emp_id = (Integer)m.get("id");
		String emp_name = (String)m.get("name");
		int emp_age = (Integer)m.get("age");
		Employee e = new Employee();
		e.setEmp_id(emp_id);
		e.setEmp_name(emp_name);
		e.setEmp_age(emp_age);
		return e;
	}
}
