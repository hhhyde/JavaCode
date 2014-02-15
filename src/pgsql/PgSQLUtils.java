/*
 * 文 件 名:  PgSQLUtils.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-11-10
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package pgsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-11-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class PgSQLUtils
{
    public static void main(String[] args)
    {
        
        // 驱动程序名
        String driver = "org.postgresql.Driver";
        
        // URL指向要访问的数据库名scutcs
        String url = "jdbc:postgresql://184.82.116.146:5432/javadb";
        
        // MySQL配置时的用户名
        String user = "javadba";
        
        // MySQL配置时的密码
        String password = "javadba";
        
        try
        {
            // 加载驱动程序
            Class.forName(driver);
            
            // 连续数据库
            Connection conn = DriverManager.getConnection(url, user, password);
            
            if (!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            
            // statement用来执行SQL语句
            Statement statement = conn.createStatement();
            
            // 要执行的SQL语句
            String sql = "select * from student;";
            // 结果集
            ResultSet rs = statement.executeQuery(sql);
            
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println(" 学号" + "\t" + " 姓名");
            System.out.println("-----------------");
            
            String name = null;
            
            while (rs.next())
            {
                
                // 选择sname这列数据
                name = rs.getString("name");
                
                // 首先使用ISO-8859-1字符集将name解码为字节序列并将结果存储新的字节数组中。
                // 然后使用GB2312字符集解码指定的字节数组
                name = new String(name.getBytes("GBK"), "GBK");
                
                // 输出结果
                System.out.println(rs.getString("id") + "\t" + name);
            }
            
            rs.close();
            conn.close();
            
        }
        catch (ClassNotFoundException e)
        {
            
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
            
        }
        catch (SQLException e)
        {
            
            e.printStackTrace();
            
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
            
        }
        
    }
}
