package cn.sdxh.dao.impl;

import cn.sdxh.dao.AccountDao;
import cn.sdxh.domain.Account;
import cn.sdxh.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    QueryRunner queryRunner=new QueryRunner(JDBCUtils.getDataSource());
    @Override
    public int insert(Account account) throws SQLException {

      String sql="insert into account values(null,?,?)";
      Object[] objects={account.getName(),account.getMoney()};
      int i=queryRunner.update(sql,objects);
        return i;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    //查询所有的账户
    @Override
    public List<Account> getAccount() throws SQLException {

        String sql="select * from account";
        Object[] params= {};
        List<Account> query = queryRunner.query(sql, new BeanListHandler<Account>(Account.class), params);
        return  query;
    }

    @Override
    public Account getAccount(int id) throws SQLException {
        return null;
    }

    @Override
    public int update(Account account) {
        return 0;
    }
}
