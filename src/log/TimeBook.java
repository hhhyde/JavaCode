/*
 * 文 件 名:  TimeBook.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-4-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package log;

import java.util.List;
import java.util.logging.Logger;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-4-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class TimeBook implements TimeBookInterface
{
    private Logger logger = Logger.getLogger(this.getClass().getName());
    
    /**
     * 重载方法
     * 
     * @param name
     */
    @Override
    public void doAuditing(String name)
    {
        // TODO Auto-generated method stub
//        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().getClassLoader());
        System.out.println(name + " is doing something about auditing...");
    }
    
}
