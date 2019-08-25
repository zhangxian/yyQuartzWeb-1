/**
 * File Name: TaxHelper.java<br>
 * CopyRight: Copyright by www.center.china<br>
 * Description:<br>
 * CREATER: ZHUACHEN<br>
 * CreateTime: 2011-5-8<br>
 * Grant: open source to everybody
 */
package com.yycoin.util;


import java.util.HashMap;
import java.util.Map;


import com.china.center.tools.BeanUtil;
import com.yycoin.vo.TCenterFinanceItem;
import com.yycoin.vo.TCenterTax;


/**
 * TaxHelper
 * 
 * @author ZHUZHU
 * @version 2011-5-8
 * @see TaxHelper
 * @since 3.0
 */
public abstract class TaxHelper
{
    public static void copyParent(TCenterFinanceItem financeItem, TCenterTax tax)
    {
        financeItem.setTaxid0(tax.getParentid0());
        financeItem.setTaxid1(tax.getParentid1());
        financeItem.setTaxid2(tax.getParentid2());
        financeItem.setTaxid3(tax.getParentid3());
        financeItem.setTaxid4(tax.getParentid4());
        financeItem.setTaxid5(tax.getParentid5());
        financeItem.setTaxid6(tax.getParentid6());
        financeItem.setTaxid7(tax.getParentid7());
        financeItem.setTaxid8(tax.getParentid8());

        String field = "taxid" + tax.getLevel();

        Map temp = new HashMap();

        temp.put(field, tax.getId());

        BeanUtil.copyProperties(financeItem, temp);
    }

    /**
     * 获取余额
     * 
     * @param tax
     * @param sums
     * @return
     */
    public static long getLastMoney(TCenterTax tax, long[] sums)
    {
        long ptotal = 0L;

        if (tax.getForward() == BaseContants.TAX_FORWARD_IN)
        {
            ptotal = sums[0] - sums[1];
        }
        else
        {
            ptotal = sums[1] - sums[0];
        }

        return ptotal;
    }

    public static long getLastMoney(TCenterTax tax, long sumIn, long sumOut)
    {
        return getLastMoney(tax, new long[] {sumIn, sumOut});
    }
}
