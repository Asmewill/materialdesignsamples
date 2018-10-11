package com.zhouwei.md.materialdesignsamples.test;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.bean.SchemeRebate;

import java.util.List;

public class ModelAdapter extends BaseQuickAdapter<SchemeRebate, BaseViewHolder> {
    public ModelAdapter(List<SchemeRebate> data) {
        super(R.layout.item_scheme_item_model, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, SchemeRebate modelItem) {
        baseViewHolder.setText(R.id.tvModel, modelItem.getBrandName());//
        baseViewHolder.setText(R.id.tvIMEI, modelItem.getImeiNo());//
        baseViewHolder.setText(R.id.tvDate, modelItem.getIncentiveDate());//
        baseViewHolder.setText(R.id.tvPrice, "" + modelItem.getIncentivePoint() + "Rs");//
    }
}
