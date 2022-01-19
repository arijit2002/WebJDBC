package a;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //auto-generate--> toString , getter Setter , hashcode , equals
@AllArgsConstructor
@NoArgsConstructor
class Employee {
	private int emp_id;
	private String emp_name;
	private int emp_age;
}
