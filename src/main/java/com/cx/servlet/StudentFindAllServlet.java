package com.cx.servlet;

import com.cx.po.Student;
import com.cx.service.StudentService;
import com.cx.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author wj
 * @Date 2020/12/18 17:27
 */
public class StudentFindAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentServiceImpl();
        List<Student> lists = studentService.findAll();
        req.setAttribute("lists", lists);
        req.getRequestDispatcher("/findAll.jsp").forward(req, resp);
    }

}
