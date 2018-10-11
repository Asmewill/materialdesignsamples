package com.zhouwei.md.materialdesignsamples.test;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.bean.SchemeShopDto;


public class SchemeShopAdapter extends BaseQuickAdapter<SchemeShopDto, BaseViewHolder> {


    public SchemeShopAdapter() {
        super(R.layout.item_scheme_item_shop);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, SchemeShopDto shop) {
        baseViewHolder.setText(R.id.shopTitle, "shopName");
        RecyclerView rvModel = baseViewHolder.getView(R.id.rvModel);
        rvModel.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL,false));
        ModelAdapter modelAdapter = new ModelAdapter(shop.getSchemeRebateList());
        rvModel.setAdapter(modelAdapter);
        LinearLayout ll_content=baseViewHolder.getView(R.id.ll_content);
        ll_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"aaa" ,Toast.LENGTH_LONG).show();
            }
        });


    }
}
