/*
 * 文 件 名:  HashCrash.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-4-17
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package hashcrash;

import a10_16.a10_16;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2012-4-17]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class HashCrash
{
    public static void main(String[] args)
    {
        String aa="XX";
        System.out.println(aa.hashCode());
        a10_16 a=new a10_16();
        System.out.println(a.hashCode());
        Integer b=10000;
        System.out.println(b.hashCode());
        long hh=Long.valueOf("a",16);
        System.out.println(hh);
    }
}
