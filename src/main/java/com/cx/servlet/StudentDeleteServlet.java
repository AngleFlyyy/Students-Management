package com.cx.servlet;

import com.cx.service.StudentService;
import com.cx.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 王建
 * @Date 2020/12/19 13:20
 */
public class StudentDeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        StudentService studentService = new StudentServiceImpl();
        studentService.deleteById(Long.parseLong(id));
        req.getRequestDispatcher("findAll").forward(req, resp);
    }
}
