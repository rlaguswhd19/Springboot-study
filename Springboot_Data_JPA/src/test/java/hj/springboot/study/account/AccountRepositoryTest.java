package hj.springboot.study.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	AccountRepository accountRepository;

	@Test
	public void di() {
//		try (Connection connection = dataSource.getConnection()){
//			DatabaseMetaData metadata= connection.getMetaData();
//			System.out.println(metadata.getURL());
//			System.out.println(metadata.getDriverName());
//			System.out.println(metadata.getUserName());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Account account = new Account();
		account.setUsername("khj");
		account.setPassword("123");
		account.setEmail("khj@naver.com");
		Account newAccount = accountRepository.save(account);

		assertThat(newAccount).isNotNull();

		Account existingAccount = accountRepository.findByUsername(newAccount.getUsername());

		assertThat(existingAccount).isNotNull();

		Account nonExistingAccount = accountRepository.findByUsername("ohj");

		assertThat(nonExistingAccount).isNull();
	}

}
