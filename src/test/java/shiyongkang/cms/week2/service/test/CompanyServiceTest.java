package shiyongkang.cms.week2.service.test;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bw.entity.Company;
import com.bw.service.CompanyService;
import com.util.DateUtil;
import com.util.NumberUtil;
import com.util.StreamUtil;
import com.util.StringUtil;

/**
 * @author ����:SYk
 * @version ����ʱ�䣺2020��1��6�� ����9:18:29 �๦��˵��
 */

@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyServiceTest {

	@Autowired
	private CompanyService cService;

	@Test
	public void test() {
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/data.txt"));
		ArrayList<Company> clist = new ArrayList<Company>();
		// ��������
		for (int i = 1; i < list.size(); i++) {
			Company c = new Company();
			// �и��ַ���
			String[] s = list.get(i).split("\t");
			// ����s[0]-id,s[1]-keyname,s[2]-detail,s[3]-cname,s[4]-product,s[5]-caddress,s[6]-csales,s[7]-ctime,s[8]-csaying,s[9]-cstatus

			// �ж�cid���Ҹ�ֵcid
			if (NumberUtil.isNumber(s[0])) {
				BigInteger cid = new BigInteger(s[0]);
				c.setCid(cid);
			}
			// �жϹؼ��ֲ��Ҹ�ֵ�ؼ���
			if (StringUtil.hasText(s[1])) {
				c.setKeyname(s[1]);
			}
			// �ж����������Ҹ�ֵ
			if (StringUtil.hasText(s[2])) {
				c.setDetail(s[2]);
			}
			// �ж����ƣ����Ҹ�ֵ
			if (StringUtil.hasText(s[3])) {
				c.setCname(s[3]);
			}
			// �жϲ�Ʒ�����Ҹ�ֵ
			if (StringUtil.hasText(s[4])) {
				c.setProduct(s[4]);
			}
			// �жϵ�ַ
			if (StringUtil.hasText(s[5])) {
				c.setCaddress(s[5]);
			}
			// �ж�ע���ʽ�
			if (StringUtil.hasText(s[6])) {
				c.setSales(s[6]);
			}else {
				c.setSales("0");
			}
			// �ж�����
			if (StringUtil.hasText(s[7])) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyy-MM-dd");
				try {
					c.setCtime(dateFormat.parse(s[7]));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			// ע��״̬
			if (StringUtil.hasText(s[10])) {
				System.out.println(s[10]);
				c.setCstatus(s[10]);
			}
			clist.add(c);
		}
		System.out.println(clist);
		cService.insert(clist);
	}
}
