package hj.springboot.study;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MysqlRunner implements ApplicationRunner {

	Logger logger = LoggerFactory.getLogger(MysqlRunner.class);

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		try (Connection connection = dataSource.getConnection()) {
			System.out.println(dataSource.getClass());
			logger.info(connection.getMetaData().getURL());
			logger.info(connection.getMetaData().getUserName());
//			Statement statement = connection.createStatement();
//			String sql = "CREATE TABLE USER(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
//			statement.execute(sql);


		} catch (Exception e) {
			System.out.println("error");
		}
		
		jdbcTemplate.execute("INSERT INTO USER VALUES (2, 'ohj')");
	}

}
