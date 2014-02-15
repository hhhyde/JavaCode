/*
 * 文 件 名:  LogProxy.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-4-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-4-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class LogProxy implements InvocationHandler
{
    
    private Logger logger = Logger.getLogger(this.getClass().getClassLoader().toString());
    
    private Object delegate;
    
    public Object bind(Object delegate)
    {
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
    }
    
    /**
     * 重载方法
     * 
     * @param obj
     * @param method
     * @param aobj
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object obj, Method method, Object[] aobj)
        throws Throwable
    {
        // TODO Auto-generated method stub
        Object result = null;
        try
        {
            logger.log(Level.INFO, aobj[0] + "开始审核数据...");
            result = method.invoke(delegate, aobj);
            logger.log(Level.INFO, aobj[0] + "审核结束...");
        }
        catch (Exception e)
        {
            // TODO: handle exception
            logger.log(Level.INFO, e.toString());
        }
        return null;
    }
    
}
