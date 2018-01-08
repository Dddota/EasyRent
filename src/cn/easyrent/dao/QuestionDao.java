package cn.easyrent.dao;

import java.sql.Connection;
import java.util.List;

import cn.easyrent.model.Question;

public interface QuestionDao {
	List<Question> showAllQuestion(Connection conn);
}
