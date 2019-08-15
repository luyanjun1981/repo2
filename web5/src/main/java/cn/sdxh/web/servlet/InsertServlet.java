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

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String name=request.getParameter("name");
        String strmoney=request.getParameter("money");
        double money=Double.parseDouble(strmoney);
        Account account =new Account();

        account.setName(name);
        account.setMoney(money);

        AccountService as=new AccountServiceImpl();

        try {
            int i = as.insert(account);

            if (i > 0) {
                //转到主页的servlet
                request.getRequestDispatcher("/select").forward(request, response);
            } else {
                System.out.println("添加错误 ");
            }
        }catch (Exception ex){
          ex.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
