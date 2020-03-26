package cn.hust.service;

import cn.hust.dao.CourseDao;
import cn.hust.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDao courseDao;


    @Override
    public List<Course> findAllCourse() {
        System.out.println("执行了。。。。。。");
        return courseDao.findAllCourse();
    }
}
