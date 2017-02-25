package com.amine.core.Dao;
import java.util.List;

import com.amine.core.domain.*;


public interface BoxDao {
	public Box readBoxById(Long id);
	public Box updateBox(Box box);
	public void delete(Box box);
	public Box creatBox();
	public List<Box> getAllBox();

}
