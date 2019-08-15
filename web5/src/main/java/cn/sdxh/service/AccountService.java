package cn.sdxh.service;

import cn.sdxh.domain.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {
    public  int insert(Account account) throws SQLException;
    public  int delete(int id);
    public List<Account> getAccount() throws SQLException;
}
