package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.CompanyMapper;
import com.bw.entity.Company;
import com.bw.vo.CompanyVo;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2020��1��6�� ����9:17:11 �๦��˵��
 */
@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyMapper cmapper;

	@Override
	public List<Company> findAll(CompanyVo companyVo) {
		// TODO Auto-generated method stub
		return cmapper.findAll(companyVo);
	}

	@Override
	public int insert(List<Company> cList) {
		// TODO Auto-generated method stub
		return cmapper.insert(cList);
	}

	@Override
	public Company reshow(String id) {
		// TODO Auto-generated method stub
		return cmapper.reshow(id);
	}

}
