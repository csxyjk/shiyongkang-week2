package com.bw.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Company;
import com.bw.vo.CompanyVo;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2020��1��6�� ����9:16:56 �๦��˵��
 */
public interface CompanyService {
	// �鿴����--ģ����ѯ�������ѯ
	List<Company> findAll(CompanyVo companyVo);

	// �������
	int insert(List<Company> cList);

	// 回显
	Company reshow(@Param("id") String id);
}
