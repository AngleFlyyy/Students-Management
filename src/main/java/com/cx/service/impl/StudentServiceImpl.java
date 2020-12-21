package com.cx.service.impl;

import com.cx.dao.StudentDao;
import com.cx.dao.impl.StudentDaoImpl;
import com.cx.po.Student;
import com.cx.service.StudentService;

import java.util.List;

/**
*@Author 王建
*@Date 2020/12/18 21:29
*/
public class StudentServiceImpl implements StudentService {
    StudentDao studentDao;

    {
        studentDao = new StudentDaoImpl();
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentDao.findById(id);
    }

    @Override
    public Integer updateById(Student student) {
        return studentDao.updateById(student);
    }

    @Override
    public Integer deleteById(Long id) {
        return studentDao.deleteById(id);
    }

    @Override
    public Integer add(Student student) {
        return studentDao.add(student);
    }
}
