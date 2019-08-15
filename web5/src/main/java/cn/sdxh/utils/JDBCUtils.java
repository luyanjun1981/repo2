package cn.sdxh.utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.*;
import java.sql.*;

//jdbc工具类
public  class JDBCUtils {

	//获得数据源
	public static DataSource getDataSource(){
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		return cpds;
	}

	

}
