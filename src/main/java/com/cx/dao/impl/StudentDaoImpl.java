package com.cx.dao.impl;

import com.cx.dao.StudentDao;
import com.cx.po.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author wj
 * @Date 2020/12/18 21:18
 */
public class StudentDaoImpl implements StudentDao {

    ApplicationContext ctx;
    DataSource dataSource;
    JdbcTemplate jdbcTemplate;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dataSource = (DataSource) ctx.getBean("dataSource");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    }

    private static final String FIND_ALL = "select * from student";
    private static final String FIND_BY_ID = "select * from student where id = ? ";
    private static final String UPDATE_BY_ID = "update student set name = ?,age = ?,sex = ?,mobile = ? where id = ? ";
    private static final String DELETE_BY_ID = "delete from student where id = ? ";
    private static final String ADD = "insert into student (name,age,sex,mobile) values(?,?,?,?) ";


    @Override
    public List<Student> findAll() {
        List<Student> student = jdbcTemplate.query(FIND_ALL, new BeanPropertyRowMapper<>(Student.class));
        return student;
    }

    @Override
    public Student findById(Long id) {
        Student student = jdbcTemplate.queryForObject(FIND_BY_ID, new BeanPropertyRowMapper<>(Student.class), id);
        return student;
    }

    @Override
    public Integer updateById(Student student) {
        int update = jdbcTemplate.update(UPDATE_BY_ID, student.getName(), student.getAge(), student.getSex(), student.getMobile(), student.getId());
        return update;
    }

    @Override
    public Integer deleteById(Long id) {
        int delete = jdbcTemplate.update(DELETE_BY_ID, id);
        return delete;
    }

    @Override
    public Integer add(Student student) {
        int add = jdbcTemplate.update(ADD, student.getName(), student.getAge(), student.getSex(), student.getMobile());
        return add;
    }
}
