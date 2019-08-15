package cn.sdxh.dao;

import cn.sdxh.domain.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    public  int insert(Account account) throws SQLException;
    public  int delete(int id);
    public  List<Account> getAccount() throws SQLException;
    public  Account getAccount(int id) throws SQLException;
    public  int update(Account account);

}
