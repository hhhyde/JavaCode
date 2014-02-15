/*
 * 文 件 名:  DateTimeServer.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-8-5
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package dateTimeServer;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-8-5]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DateTimeServer implements Runnable
{
    private Integer port;
    
    public DateTimeServer()
    {
        this(16);
    }
    
    public DateTimeServer(Integer port)
    {
        this.port = port;
    }
    
    /**
     * 重载方法
     */
    @Override
    public void run()
    {
        try
        {
            ServerSocket server = new ServerSocket(port);
            Integer i = 0;
            System.out.println("等待客户端请求...");
            // 轮流处理多个客户端请求
            while (true)
            {
                
                Socket connection = null;
                try
                {
                    connection = server.accept();
                    Calendar calendar = Calendar.getInstance();
                    Long daytime = calendar.getTimeInMillis();
                    DataOutputStream dos = new DataOutputStream(connection.getOutputStream());
                    dos.writeLong(daytime);
                    dos.flush();
                    System.out.println("第" + (++i) + "客户请求!");
                }
                catch (Exception e)
                {
                    e.toString();
                }
                finally
                {
                    if (connection != null)
                        connection.close();
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        DateTimeServer dateTimeServer = null;
        if (args.length == 0)
        {
            dateTimeServer = new DateTimeServer();
        }
        else if (args.length == 1)
        {
            dateTimeServer = new DateTimeServer(Integer.valueOf(args[0]));
        }
        (new Thread(dateTimeServer)).start();
    }
}
