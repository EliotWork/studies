package com.example.shoppinglist.presentation.rcView

import androidx.recyclerview.widget.DiffUtil
import com.example.shoppinglist.domain.entity.ShopItem

class ShopItemDiffCallback: DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return  oldItem == newItem
    }
}