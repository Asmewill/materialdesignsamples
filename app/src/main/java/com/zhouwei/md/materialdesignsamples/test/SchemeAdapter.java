package com.zhouwei.md.materialdesignsamples.test;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zhouwei.md.materialdesignsamples.R;
import com.zhouwei.md.materialdesignsamples.asmewill.BDTieBaActivity;
import com.zhouwei.md.materialdesignsamples.bean.Scheme;


public class SchemeAdapter extends BaseQuickAdapter<Scheme, BaseViewHolder> {
    public SchemeAdapter() {
        super(R.layout.item_scheme_item);
    }

    @Override
    protected void convert(final BaseViewHolder holder, final Scheme scheme) {
        //init Head
        final View ivArrow = holder.getView(R.id.ivArrow);
        RecyclerView rvShop = holder.getView(R.id.rvShop);
        if(holder.getLayoutPosition()==0){
          scheme.extend=true;
        }else{
            scheme.extend=false;
        }
        if(scheme.extend){
            rvShop.setVisibility(View.VISIBLE);
        }else{
            rvShop.setVisibility(View.GONE);
        }
        ivArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scheme.extend = !scheme.extend;
                ivArrow.animate().rotation(scheme.extend ? 180 : 0).start();
                holder.setGone(R.id.rvShop, scheme.extend);
                if(mContext instanceof BDTieBaActivity){
                    ((BDTieBaActivity) mContext).stopRecycleViewScroll();
                }
            }
        });
        //init shopList
        SchemeShopAdapter shopAdapter = new SchemeShopAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL,false);
        rvShop.setLayoutManager(linearLayoutManager);
        rvShop.setAdapter(shopAdapter);
        shopAdapter.setNewData(scheme.getSchemeShopList());
        shopAdapter.notifyDataSetChanged();



    }
}
