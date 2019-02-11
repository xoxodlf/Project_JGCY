package com.JGCY.testService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JGCY.domain.testDTO;
import com.JGCY.mapper.TimeMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class testServiceImpl implements testService{

	@Setter(onMethod_=@Autowired)
	private TimeMapper mapper;
	
	@Override
	public void write(testDTO dtos) {
		// TODO Auto-generated method stub
		mapper.write(dtos);
	}

}
