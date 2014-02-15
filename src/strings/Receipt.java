/*
 * 文 件 名:  Receipt.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-8-6
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package strings;

import java.util.Formatter;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-8-6]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Receipt
{
    private double total = 0;
    
    private Formatter f = new Formatter(System.out);
    
    public void printTitle()
    {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    
    public void print(String name, int qty, double price)
    {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total+=price;
    }
    
    public void printTotal()
    {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total * 1.06);
    }
    
    public static void main(String[] args)
    {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 79887, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
        
    }
}
