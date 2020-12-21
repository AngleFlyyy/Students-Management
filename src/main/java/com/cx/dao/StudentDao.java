package com.cx.dao;

import com.cx.po.Student;

import java.util.List;

/**
 * @author 王建
 * @date 2020/12/18 21:14
 */
public interface StudentDao {

    /**
     * 查询所有学生信息
     * @return
     */
    List<Student> findAll();

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    Student findById(Long id);

    /**
     * 根据id更新学生信息
     * @param student
     * @return
     */
    Integer updateById(Student student);

    /**
     * 根据id删除学生信息
     * @param id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    Integer add(Student student);
}
