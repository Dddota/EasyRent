package cn.easyrent.service.impl;

import java.sql.Connection;
import java.util.List;

import cn.easyrent.dao.QuestionDao;
import cn.easyrent.dao.impl.QuestionDaoImpl;
import cn.easyrent.model.Question;
import cn.easyrent.service.QuestionDaoService;
import cn.easyrent.utils.BaseDao;

public class QuestionDaoServiceImpl implements QuestionDaoService {
	QuestionDao questionDao = new QuestionDaoImpl();
	@Override
	public List<Question> showAllQuestion() {
		Connection conn = BaseDao.getConnection();
		List<Question> questionList = questionDao.showAllQuestion(conn);
		BaseDao.closeAll(null, conn, null);
		return questionList;
	}

}
