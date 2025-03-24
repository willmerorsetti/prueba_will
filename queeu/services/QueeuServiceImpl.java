package com.aleal.queeu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleal.queeu.dao.IQueeuDao;
import com.aleal.queeu.model.Queeu;

@Service
public class QueeuServiceImpl implements IQueeuService {
	
	@Autowired
	private IQueeuDao queeuDao;

	@Override
	public List<Queeu> search() {
		return (List<Queeu>) queeuDao.findAll();
	}

}
