package com.ohgiraffers.section03.status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {
    public StatusCodeTestServlet() {
    }

    /* 설명. 서버 측에서 에러를 발생시켜 예외처리를 할 수 있다. */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendError(404, "없는 페이지입니다. 경로를 확인해 주세요");
        resp.sendError(500, "서버 내부 오류입니다. 서버 오류는 서버 개발자의 잘못이고, 개발자는 여러분 입니다.");
    }
}
