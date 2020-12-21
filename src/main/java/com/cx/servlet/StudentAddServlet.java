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
 * @Date 2020/12/19 15:19
 */
public class StudentAddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String mobile = req.getParameter("mobile");
        Student student = new Student();
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setSex(sex);
        student.setMobile(mobile);

        StudentService studentService = new StudentServiceImpl();
        studentService.add(student);

        req.getRequestDispatcher("findAll").forward(req, resp);
    }
}
