package cn.sdxh.web.servlet;

import cn.sdxh.domain.Account;
import cn.sdxh.service.AccountService;
import cn.sdxh.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/select")//相对路径，访问这个servlet，需要在地址栏中输入http://localhost:8080/account/list
public class SelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            AccountService accountService = new AccountServiceImpl();
            List<Account> accounts = accountService.getAccount();

            for(Account account:accounts){
                System.out.println(account);
            }
            //保存结果到request域中
            request.setAttribute("accounts",accounts);
            request.getRequestDispatcher("/list.jsp").forward(request,response);


        }catch (Exception ex){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
