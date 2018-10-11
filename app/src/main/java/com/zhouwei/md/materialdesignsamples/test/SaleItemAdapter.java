package com.zhouwei.md.materialdesignsamples.test;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.bean.Scheme;

import java.util.List;

public class SaleItemAdapter extends BaseQuickAdapter<Scheme.SaleItem, BaseViewHolder> {
    public SaleItemAdapter(List<Scheme.SaleItem> data) {
        super(R.layout.item_scheme_onging_sale, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Scheme.SaleItem saleItem) {
        baseViewHolder.setText(R.id.tvQty, saleItem.qty);
        baseViewHolder.setText(R.id.tvPrice, saleItem.num);
    }
}
