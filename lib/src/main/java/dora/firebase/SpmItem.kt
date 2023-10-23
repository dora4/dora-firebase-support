package dora.firebase

import android.os.Parcel
import android.os.Parcelable

class SpmItem() : Parcelable {

    var itemId : String = ""
    var itemName : String = ""
    var affiliation : String? = null
    var coupon : String? = null
    var creativeName : String? = null
    var creativeSlot : String? = null
    var discount : Number? = null
    var index : Number? = null
    var itemBrand : String? = null
    var itemCategory : String? = null
    var itemCategory2 : String? = null
    var itemCategory3 : String? = null
    var itemCategory4 : String? = null
    var itemCategory5 : String? = null
    var itemListId : String? = null
    var itemListName : String? = null
    var itemVariant : String? = null
    var locationId : String? = null
    var price : Number? = null
    var promotionId : String? = null
    var promotionName : String? = null
    var quantity : Number? = null

    constructor(parcel: Parcel) : this() {
        itemId = parcel.readString().toString()
        itemName = parcel.readString().toString()
        affiliation = parcel.readString().toString()
        coupon = parcel.readString().toString()
        creativeName = parcel.readString().toString()
        creativeSlot = parcel.readString().toString()
        discount = parcel.readDouble()
        index = parcel.readInt()
        itemBrand = parcel.readString().toString()
        itemCategory = parcel.readString().toString()
        itemCategory2 = parcel.readString().toString()
        itemCategory3 = parcel.readString().toString()
        itemCategory4 = parcel.readString().toString()
        itemCategory5 = parcel.readString().toString()
        itemListId = parcel.readString().toString()
        itemListName = parcel.readString().toString()
        itemVariant = parcel.readString().toString()
        locationId = parcel.readString().toString()
        price = parcel.readDouble()
        promotionId = parcel.readString().toString()
        promotionName = parcel.readString().toString()
        quantity = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(itemId)
        parcel.writeString(itemName)
        parcel.writeString(affiliation)
        parcel.writeString(coupon)
        parcel.writeString(creativeName)
        parcel.writeString(creativeSlot)
        parcel.writeDouble(discount?.toDouble() ?: 0.0)
        parcel.writeInt(index?.toInt() ?: 0)
        parcel.writeString(itemBrand)
        parcel.writeString(itemCategory)
        parcel.writeString(itemCategory2)
        parcel.writeString(itemCategory3)
        parcel.writeString(itemCategory4)
        parcel.writeString(itemCategory5)
        parcel.writeString(itemListId)
        parcel.writeString(itemListName)
        parcel.writeString(itemVariant)
        parcel.writeString(locationId)
        parcel.writeDouble(price?.toDouble() ?: 0.0)
        parcel.writeString(promotionId)
        parcel.writeString(promotionName)
        parcel.writeInt(quantity?.toInt() ?: 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SpmItem> {
        override fun createFromParcel(parcel: Parcel): SpmItem {
            return SpmItem(parcel)
        }

        override fun newArray(size: Int): Array<SpmItem?> {
            return arrayOfNulls(size)
        }
    }
}