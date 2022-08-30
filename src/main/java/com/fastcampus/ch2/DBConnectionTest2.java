package com.fastcampus.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;


public class DBConnectionTest2 {
    public static void main(String args[]) throws Exception {
//        // ��Ű���� �̸�(springbasic)�� �ٸ� ��� �˸°� ����
//        String DB_URL = "jdbc:mysql://localhost:3306/springbasic?useUnicode=true&characterEncoding=utf8";
//
//        // DB�� userid�� pwd�� �˸°� ����
//        String DB_USER = "isaac";
//        String DB_PASSWORD = "Ghfkddl03!";
//        String DB_DRIVER = "com.mysql.jdbc.Driver";
//
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName(DB_DRIVER);
//        ds.setUrl(DB_URL);
//        ds.setUsername(DB_USER);
//        ds.setPassword(DB_PASSWORD);

        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection(); // �����ͺ��̽��� ������ ��´�.

        System.out.println("conn = " + conn);
    }
}