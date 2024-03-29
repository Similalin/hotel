package cn.xy.service;

import java.util.List;

import cn.xy.entity.DinnerTable;

public interface IDinnerTableService {

	void add(DinnerTable dt);
	
	void delete(int id);
	
	void updata(DinnerTable dt);
	
	List<DinnerTable> query();
	
	DinnerTable findById(int id);

	List<DinnerTable> query(String keyword);

	DinnerTable changeState(int id);
	
	void quitTable(int id);
}
