package jp.co.rakus.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.rakus.domain.User;

/**
 * DBを操作するリポジトリ.
 * 
 * @author yume.hirata
 *
 */
@Repository
public class UserRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	
	/**
	 *RowMapperの定義. 
	 */
	private static final RowMapper<User> USER_ROW_MAPPER = (rs, i) -> {
		User user =new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getString("age"));
		user.setAddress(rs.getString("address"));
		return user;
	};
	
	/**
	 * ID検索をする.
	 * 
	 * @param id	ユーザーのid
	 * @return	DBから入手したユーザーの情報を渡す
	 */
	public User load(Integer id) {
		String sql = "SELECT id,name,age,address FROM info WHERE id=:id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		
		User user = template.queryForObject(sql, param, USER_ROW_MAPPER);
		
		return user;
	}

}
