package co.grandcircus.CoffeeShopWebApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeJdbcDao {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// Add a food
	public int addUser(String fName, String lName, String emailAddress, int phoneNumber, String passwordString) {
		String addQuery = "insert into food(fName, lName, emailAddress, phoneNumber, passwordString) values(?,?,?,?,?)";
		
	}

	
	
	
}
