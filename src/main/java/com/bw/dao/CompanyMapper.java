package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bw.entity.Company;
import com.bw.vo.CompanyVo;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2020��1��6�� ����9:00:55 �๦��˵��
 */
public interface CompanyMapper {

	// �鿴����--ģ����ѯ�������ѯ
	List<Company> findAll(CompanyVo companyVo);

	// �������
	int insert(List<Company> cList);

	// 回显
	@Select("select * from company where cid=#{id}")
	Company reshow(@Param("id") String id);

}
