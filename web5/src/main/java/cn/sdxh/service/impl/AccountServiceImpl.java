package cn.sdxh.service.impl;

import cn.sdxh.dao.AccountDao;
import cn.sdxh.dao.impl.AccountDaoImpl;
import cn.sdxh.domain.Account;
import cn.sdxh.service.AccountService;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    AccountDao accountDao=new AccountDaoImpl();



    @Override
    public int insert(Account account) throws SQLException {
          return  accountDao.insert(account);
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Account> getAccount() throws SQLException {

        return  accountDao.getAccount();
    }
}
