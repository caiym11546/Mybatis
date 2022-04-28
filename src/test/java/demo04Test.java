import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class demo04Test {

    @Test
    public void testMBG() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        EmpExample empExample = new EmpExample();
        PageHelper.startPage(2,4);
//        //创建条件对象，通过andxxx方法为sql添加查询添加，每个条件之间是and关系
//        empExample.createCriteria().andUserNameLike("张").andAgeGreaterThan(10).andIdIsNotNull();
//        //将之前添加的条件通过or拼接其他条件
//        empExample.or().andSexEqualTo("男");
//        List<Emp> emps = mapper.selectByExample(empExample);
//        emps.forEach(emp -> System.out.println(emp.getUserName()));
        List<Emp> emps = mapper.selectByExample(empExample);
        emps.forEach(emp -> System.out.println(emp.getUserName()));
        PageInfo<Emp> page = new PageInfo<>(emps,3);
        System.out.println(page);
    }

}
