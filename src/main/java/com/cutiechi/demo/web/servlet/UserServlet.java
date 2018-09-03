package com.cutiechi.demo.web.servlet;

import com.cutiechi.demo.model.dto.JsonResponse;
import com.cutiechi.demo.model.dto.ServiceResult;
import com.cutiechi.demo.service.UserService;
import com.cutiechi.demo.service.impl.UserServiceImpl;
import com.cutiechi.demo.util.JsonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    
    private final UserService userService;
    
    public UserServlet () {
        userService = new UserServiceImpl();
    }
    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServiceResult serviceResult = userService.listAll();
        String json = JsonUtils.toJson(new JsonResponse(JsonResponse.Status.SUCCESS.getCode(), serviceResult.getMessage(), serviceResult.getResult()));
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(json);
    }
}
