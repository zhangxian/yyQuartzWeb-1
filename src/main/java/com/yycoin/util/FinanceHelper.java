package com.yycoin.util;

import java.util.List;

import com.yycoin.vo.TCenterFinance;
import com.yycoin.vo.TCenterFinanceItem;
import com.yycoin.vo.TCenterTax;

public class FinanceHelper {

	public FinanceHelper() {
		// TODO Auto-generated constructor stub
	}
	
    public static void copyTax(TCenterTax tax, TCenterFinanceItem item)
    {
        item.setTaxid(tax.getId());

        item.setTaxid0(tax.getParentid0());
        item.setTaxid1(tax.getParentid1());
        item.setTaxid2(tax.getParentid2());
        item.setTaxid3(tax.getParentid3());
        item.setTaxid4(tax.getParentid4());
        item.setTaxid5(tax.getParentid5());
        item.setTaxid6(tax.getParentid6());
        item.setTaxid7(tax.getParentid7());
        item.setTaxid8(tax.getParentid8());
    }

    /**
     * FinanceBean->FinanceItemBean
     * 
     * @param financeBean
     * @param item
     */
    public static void copyFinanceItem(TCenterFinance financeBean, TCenterFinanceItem item)
    {
        item.setCreatetype(financeBean.getCreatetype());

        item.setRefid(financeBean.getRefid());

        item.setRefout(financeBean.getRefout());

        item.setRefstock(financeBean.getRefstock());

        item.setRefbill(financeBean.getRefbill());

        item.setFinancedate(financeBean.getFinancedate());

        item.setType(financeBean.getType());

        item.setDutyid(financeBean.getDutyid());

        item.setLogtime(financeBean.getLogtime());
    }
    
    /**
     * 是否是结转的凭证
     * 
     * @param itemList
     * @return
     */
    public static boolean isTurnFinance(List<TCenterFinanceItem> itemList)
    {
        for (TCenterFinanceItem financeItemBean : itemList)
        {
            if (financeItemBean.getTaxid().equals(BaseContants.YEAR_PROFIT))
            {
                return true;
            }
        }

        return false;
    }

}
