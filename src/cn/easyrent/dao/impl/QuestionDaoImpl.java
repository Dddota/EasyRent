package cn.easyrent.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.easyrent.dao.QuestionDao;
import cn.easyrent.model.Question;
import cn.easyrent.utils.BaseDao;

public class QuestionDaoImpl implements QuestionDao {

	@Override
	public List<Question> showAllQuestion(Connection conn) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Question question  = null;
		List<Question> questionList = new ArrayList<Question>();
		String sql = "select * from easyrent_question";
		try{
			Object[] oo = null;
			rs = BaseDao.executeQuery(conn, ps, sql, oo);
			while(rs.next()){
				question = new Question();
				question.setId(rs.getInt(1));
				question.setQuestion(rs.getString(2));
				questionList.add(question);
			}
		}catch(SQLException e){
			BaseDao.closeAll(ps, null, rs);
		}
		return questionList;
	}

}
