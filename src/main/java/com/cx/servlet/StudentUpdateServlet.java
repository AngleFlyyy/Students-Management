package com.cx.servlet;

import com.cx.po.Student;
import com.cx.service.StudentService;
import com.cx.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author wj
 * @Date 2020/12/19 14:53
 */
public class StudentUpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        StudentService studentService = new StudentServiceImpl();
        Student student = studentService.findById(Long.parseLong(id));
        req.setAttribute("student", student);
        req.getRequestDispatcher("update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String mobile = req.getParameter("mobile");
        Student student = new Student();
        student.setId(Long.parseLong(id));
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setSex(sex);
        student.setMobile(mobile);
        StudentService studentService = new StudentServiceImpl();
        studentService.updateById(student);

        req.getRequestDispatcher("findAll").forward(req, resp);
    }
}
