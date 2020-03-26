package cn.hust;

import cn.hust.dao.CourseDao;
import cn.hust.pojo.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws IOException {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        CourseDao mapper = session.getMapper(CourseDao.class);
        List<Course> courses = mapper.findAllCourse();
        for(Course course:courses){
            System.out.println(course);
        }
        session.close();
        is.close();
    }
}
