package com.example.secondheaderrecyclerview.ui.message.adapter.rv;

import com.example.secondheaderrecyclerview.R;
import com.example.secondheaderrecyclerview.base.recyclerview.viewholder.ViewHolder;
import com.example.secondheaderrecyclerview.base.recyclerview.xmlmanager.ItemViewDelegate;
import com.example.secondheaderrecyclerview.ui.message.bean.ChatMessage;

/**
 * Created by zhy on 16/6/22.
 */
public class MsgComingItemDelagate implements ItemViewDelegate<ChatMessage>
{

    @Override
    public int getItemViewLayoutId()
    {
        return R.layout.main_chat_from_msg;
    }

    @Override
    public boolean isForViewType(ChatMessage item, int position)
    {
        return item.isComMeg();
    }

    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position)
    {
        holder.setText(R.id.chat_from_content, chatMessage.getContent());
        holder.setText(R.id.chat_from_name, chatMessage.getName());
        holder.setImageResource(R.id.chat_from_icon, chatMessage.getIcon());
    }
}
