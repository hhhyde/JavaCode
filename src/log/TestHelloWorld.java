/*
 * 文 件 名:  TestHelloWorld.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-4-22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package log;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-4-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class TestHelloWorld
{
    public static void main(String[] args)
    {
        LogProxy logProxy = new LogProxy();
        TimeBookInterface timeBookInterface = (TimeBookInterface)logProxy.bind(new TimeBook());
        timeBookInterface.doAuditing("张三");
        List<Integer> aa=Arrays.asList(1,2,3);
        System.out.println(aa);
    }
}
