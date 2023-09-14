package dora.firebase

import android.os.Parcel
import android.os.Parcelable

class SpmItem() : Parcelable {

    val itemId : String = ""
    val itemName : String = ""
    val affiliation : String? = null
    val coupon : String? = null
    val creativeName : String? = null
    val creativeSlot : String? = null
    val discount : Number? = null
    val index : Number? = null
    val itemBrand : String? = null
    val itemCategory : String? = null
    val itemCategory2 : String? = null
    val itemCategory3 : String? = null
    val itemCategory4 : String? = null
    val itemCategory5 : String? = null
    val itemListId : String? = null
    val itemListName : String? = null
    val itemVariant : String? = null
    val locationId : String? = null
    val price : Number? = null
    val promotionId : String? = null
    val promotionName : String? = null
    val quantity : Number? = null

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
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