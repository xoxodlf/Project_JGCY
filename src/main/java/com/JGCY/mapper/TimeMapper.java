package com.JGCY.mapper;

import org.apache.ibatis.annotations.Select;

import com.JGCY.domain.testDTO;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
	
	public void write(testDTO dto);
}
