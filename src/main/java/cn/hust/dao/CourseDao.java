package cn.hust.dao;

import cn.hust.pojo.Course;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseDao {

//    @Select("select * from tab_courses")
    public List<Course> findAllCourse();
}
