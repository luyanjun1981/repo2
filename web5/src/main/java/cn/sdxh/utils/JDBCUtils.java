package cn.sdxh.utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.*;
import java.sql.*;

//jdbc������
public  class JDBCUtils {

	//�������Դ
	public static DataSource getDataSource(){
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		return cpds;
	}

	

}
