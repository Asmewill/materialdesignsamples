package com.zhouwei.md.materialdesignsamples;

import com.zhouwei.md.materialdesignsamples.bean.Scheme;
import com.zhouwei.md.materialdesignsamples.bean.SchemeRebate;
import com.zhouwei.md.materialdesignsamples.bean.SchemeShopDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jian.shui on 2018/10/8
 */
public class DataUtils {
    public static List<Scheme> getListScheme(){
        List<Scheme> list=new ArrayList<>();
        for(int i=0;i<4;i++){
            Scheme scheme = new Scheme();
            List<SchemeShopDto> shopDtoList=new ArrayList<>();
            for(int j=0;j<1;j++){
                SchemeShopDto shop=new SchemeShopDto();
                List<SchemeRebate> schemeRebateList=new ArrayList<>();
                for(int k=0;k<1;k++){
                    SchemeRebate schemeRebate=new SchemeRebate();
                    schemeRebateList.add(schemeRebate);
                }
                shop.setSchemeRebateList(schemeRebateList);
                shopDtoList.add(shop);
            }
            scheme.setSchemeShopList(shopDtoList);
            list.add(scheme);
        }
        return list;
    }


}
