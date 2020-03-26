package cn.hust;

import cn.hust.pojo.Course;
import cn.hust.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CourseService courseService = ac.getBean("courseService", CourseService.class);
        List<Course> allCourse = courseService.findAllCourse();
        for (Course c:allCourse){
            System.out.println(c);
        }

    }

}
