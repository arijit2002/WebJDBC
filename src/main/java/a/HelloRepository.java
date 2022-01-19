package a;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class HelloRepository {
	@Autowired  //automatic constructor injection
	private JdbcTemplate jdbcTemplate;
	public Map<String, Object> findById(int id){
		String query="""
				select * from employee where id=?
				""";
		Map<String, Object> employee = jdbcTemplate.queryForMap(query,id);
		return employee;
	}
}
