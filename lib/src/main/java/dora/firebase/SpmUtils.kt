package dora.firebase

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.firebase.analytics.FirebaseAnalytics
import dora.util.RomUtils

object SpmUtils {

    /**
     * 所有媒体资源推荐，看到广告（仅限应用）。
     */
    const val EVENT_AD_IMPRESSION = FirebaseAnalytics.Event.AD_IMPRESSION

    /**
     * 线上销售推荐，在结账过程中提交付款信息。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_COUPON
     * @see PARAM_PAYMENT_TYPE
     * @see PARAM_ITEMS
     */
    const val EVENT_ADD_PAYMENT_INFO = FirebaseAnalytics.Event.ADD_PAYMENT_INFO

    /**
     * 线上销售推荐，将商品添加到购物车。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_ITEMS
     */
    const val EVENT_ADD_TO_CART = FirebaseAnalytics.Event.ADD_TO_CART

    /**
     * 线上销售推荐，将商品添加到心愿单。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_ITEMS
     */
    const val EVENT_ADD_TO_WISHLIST = FirebaseAnalytics.Event.ADD_TO_WISHLIST

    /**
     * 应用打开。
     */
    const val EVENT_APP_OPEN = FirebaseAnalytics.Event.APP_OPEN

    /**
     * 线上销售推荐，开始结账。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_COUPON
     * @see PARAM_ITEMS
     */
    const val EVENT_BEGIN_CHECKOUT = FirebaseAnalytics.Event.BEGIN_CHECKOUT

    /**
     * 活动详情。
     */
    const val EVENT_CAMPAIGN_DETAILS = FirebaseAnalytics.Event.CAMPAIGN_DETAILS

    /**
     * 所有媒体资源推荐，提交表单或信息请求。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     */
    const val EVENT_GENERATE_LEAD = FirebaseAnalytics.Event.GENERATE_LEAD

    /**
     * 所有媒体资源和游戏推荐，加入群组。
     *
     * @see PARAM_GROUP_ID
     */
    const val EVENT_JOIN_GROUP = FirebaseAnalytics.Event.JOIN_GROUP

    /**
     * 游戏推荐，在游戏中完成关卡。
     *
     * @see PARAM_LEVEL_NAME
     * @see PARAM_SUCCESS
     */
    const val EVENT_LEVEL_END = FirebaseAnalytics.Event.LEVEL_END

    /**
     * 游戏推荐，在游戏中开始新关卡。
     *
     * @see PARAM_LEVEL_NAME
     */
    const val EVENT_LEVEL_START = FirebaseAnalytics.Event.LEVEL_START

    /**
     * 游戏推荐，在游戏中升级。
     *
     * @see PARAM_LEVEL
     * @see PARAM_CHARACTER
     */
    const val EVENT_LEVEL_UP = FirebaseAnalytics.Event.LEVEL_UP

    /**
     * 所有媒体资源推荐，登录。
     *
     * @see PARAM_METHOD
     */
    const val EVENT_LOGIN = FirebaseAnalytics.Event.LOGIN

    /**
     * 游戏推荐，发布得分。
     *
     * @see PARAM_SCORE
     * @see PARAM_LEVEL
     * @see PARAM_CHARACTER
     */
    const val EVENT_POST_SCORE = FirebaseAnalytics.Event.POST_SCORE

    /**
     * 所有媒体资源推荐，搜索您的网站或应用。
     *
     * @see PARAM_SEARCH_TERM
     */
    const val EVENT_SEARCH = FirebaseAnalytics.Event.SEARCH

    /**
     * 所有媒体资源和游戏推荐，选择您网站或应用中的内容。
     *
     * @see PARAM_CONTENT_TYPE
     */
    const val EVENT_SELECT_CONTENT = FirebaseAnalytics.Event.SELECT_CONTENT

    /**
     * 所有媒体资源推荐，共享您网站或应用中的内容。
     *
     * @see PARAM_METHOD
     * @see PARAM_CONTENT_TYPE
     * @see PARAM_ITEM_ID
     */
    const val EVENT_SHARE = FirebaseAnalytics.Event.SHARE

    /**
     * 所有媒体资源推荐，在您的网站或应用中注册帐号。
     *
     * @see PARAM_METHOD
     */
    const val EVENT_SIGN_UP = FirebaseAnalytics.Event.SIGN_UP

    /**
     * 所有媒体资源和游戏推荐，支出虚拟货币（金币、宝石、代币等）。
     *
     * @see PARAM_VALUE
     * @see PARAM_VIRTUAL_CURRENCY_NAME
     * @see PARAM_ITEM_NAME
     */
    const val EVENT_SPEND_VIRTUAL_CURRENCY = FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY

    /**
     * 所有媒体资源和游戏推荐，在新手入门流程中开始教程。
     */
    const val EVENT_TUTORIAL_BEGIN = FirebaseAnalytics.Event.TUTORIAL_BEGIN

    /**
     * 所有媒体资源和游戏推荐，在新手入门流程中完成教程。
     */
    const val EVENT_TUTORIAL_COMPLETE = FirebaseAnalytics.Event.TUTORIAL_COMPLETE

    /**
     * 游戏推荐，解锁成就。
     *
     * @see PARAM_ACHIEVEMENT_ID
     */
    const val EVENT_UNLOCK_ACHIEVEMENT = FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT

    /**
     * 线上销售推荐，查看商品。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_ITEMS
     */
    const val EVENT_VIEW_ITEM = FirebaseAnalytics.Event.VIEW_ITEM

    /**
     * 线上销售推荐，查看商品或服务清单。
     *
     * @see PARAM_ITEM_LIST_ID
     * @see PARAM_ITEM_LIST_NAME
     * @see PARAM_ITEMS
     */
    const val EVENT_VIEW_ITEM_LIST = FirebaseAnalytics.Event.VIEW_ITEM_LIST

    /**
     * 每当用户看到搜索结果网页时触发，此类事件以网址查询参数表示
     *
     * 默认情况下，如果网址中存在以下 5 个查询参数之一，此类事件便会触发：
     * q
     * s
     * search
     * query
     * keyword
     * 您可以视情况配置此事件，以查找其他网址查询参数。
     *
     * search_term 参数会填充搜索字词维度。
     */
    const val EVENT_VIEW_SEARCH_RESULTS = FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS

    /**
     * 所有媒体资源和游戏推荐，获得虚拟货币（金币、宝石、代币等）。
     *
     * @see PARAM_VIRTUAL_CURRENCY_NAME
     * @see PARAM_VALUE
     */
    const val EVENT_EARN_VIRTUAL_CURRENCY = FirebaseAnalytics.Event.EARN_VIRTUAL_CURRENCY

    /**
     * 当发生屏幕转换且符合以下任一条件时触发：
     * 之前没有设置屏幕
     * 新的屏幕名称与以前的屏幕名称不同
     * 新的屏幕类名称与以前的屏幕类名称不同
     * 新的屏幕 ID 与以前的屏幕 ID 不同
     */
    const val EVENT_SCREEN_VIEW = FirebaseAnalytics.Event.SCREEN_VIEW

    /**
     * 线上销售推荐，从购物车中移除商品。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_ITEMS
     */
    const val EVENT_REMOVE_FROM_CART = FirebaseAnalytics.Event.REMOVE_FROM_CART

    /**
     * 线上销售推荐，在结账过程中提交配送信息。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_COUPON
     * @see PARAM_SHIPPING_TIER
     * @see PARAM_ITEMS
     */
    const val EVENT_ADD_SHIPPING_INFO = FirebaseAnalytics.Event.ADD_SHIPPING_INFO

    /**
     * 所有媒体资源和线上销售推荐，完成购买。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_TRANSACTION_ID
     * @see PARAM_VALUE
     * @see PARAM_COUPON
     * @see PARAM_SHIPPING
     * @see PARAM_TAX
     * @see PARAM_ITEMS
     */
    const val EVENT_PURCHASE = FirebaseAnalytics.Event.PURCHASE

    /**
     * 所有媒体资源和线上销售推荐，收到退款。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_TRANSACTION_ID
     * @see PARAM_VALUE
     * @see PARAM_COUPON
     * @see PARAM_SHIPPING
     * @see PARAM_TAX
     * @see PARAM_ITEMS
     */
    const val EVENT_REFUND = FirebaseAnalytics.Event.REFUND

    /**
     * 线上销售推荐，从商品或服务清单中选择商品。
     *
     * @see PARAM_ITEM_LIST_ID
     * @see PARAM_ITEM_LIST_NAME
     * @see PARAM_ITEMS
     */
    const val EVENT_SELECT_ITEM = FirebaseAnalytics.Event.SELECT_ITEM

    /**
     * 线上销售推荐，选择促销活动。
     *
     * @see PARAM_CREATIVE_NAME
     * @see PARAM_CREATIVE_SLOT
     * @see PARAM_PROMOTION_ID
     * @see PARAM_PROMOTION_NAME
     * @see PARAM_ITEMS
     */
    const val EVENT_SELECT_PROMOTION = FirebaseAnalytics.Event.SELECT_PROMOTION

    /**
     * 线上销售推荐，查看购物车。
     *
     * @see PARAM_CURRENCY
     * @see PARAM_VALUE
     * @see PARAM_ITEMS
     */
    const val EVENT_VIEW_CART = FirebaseAnalytics.Event.VIEW_CART

    /**
     * 线上销售推荐，在您的网站或应用中查看促销活动。
     *
     * @see PARAM_CREATIVE_NAME
     * @see PARAM_CREATIVE_SLOT
     * @see PARAM_PROMOTION_ID
     * @see PARAM_PROMOTION_NAME
     * @see PARAM_ITEMS
     */
    const val EVENT_VIEW_PROMOTION = FirebaseAnalytics.Event.VIEW_PROMOTION

    const val PARAM_DEVICE_ID = "device_id"

    /**
     * 已解锁成就的 ID。
     *
     * 数据类型：string
     * 是否必须提供：是
     * 示例：A_12345
     */
    const val PARAM_ACHIEVEMENT_ID = FirebaseAnalytics.Param.ACHIEVEMENT_ID
    const val PARAM_AD_FORMAT = FirebaseAnalytics.Param.AD_FORMAT
    const val PARAM_AD_PLATFORM = FirebaseAnalytics.Param.AD_PLATFORM
    const val PARAM_AD_SOURCE = FirebaseAnalytics.Param.AD_SOURCE
    const val PARAM_AD_UNIT_NAME = FirebaseAnalytics.Param.AD_UNIT_NAME

    /**
     * 升级的角色或获得相应得分的角色。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：玩家 1
     */
    const val PARAM_CHARACTER = FirebaseAnalytics.Param.CHARACTER
    const val PARAM_TRAVEL_CLASS = FirebaseAnalytics.Param.TRAVEL_CLASS

    /**
     * 所选内容的类型。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：产品
     */
    const val PARAM_CONTENT_TYPE = FirebaseAnalytics.Param.CONTENT_TYPE

    /**
     * 与事件相关的商品所用的币种（采用由 3 个字母表示的 ISO 4217 格式）。
     * 如果设置 value，则必须提供 currency，这样才能准确计算收入指标。
     *
     * 数据类型：string
     * 是否必须提供：是
     * 示例：USD
     */
    const val PARAM_CURRENCY = FirebaseAnalytics.Param.CURRENCY

    /**
     * Event和Item的参数，与事件相关的优惠券名称/代码。
     * 事件级和商品级 coupon 参数彼此独立。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：SUMMER_FUN
     */
    const val PARAM_COUPON = FirebaseAnalytics.Param.COUPON
    const val PARAM_START_DATE = FirebaseAnalytics.Param.START_DATE
    const val PARAM_END_DATE = FirebaseAnalytics.Param.END_DATE
    const val PARAM_EXTEND_SESSION = FirebaseAnalytics.Param.EXTEND_SESSION
    const val PARAM_FLIGHT_NUMBER = FirebaseAnalytics.Param.FLIGHT_NUMBER

    /**
     * 群组的 ID。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：G_12345
     */
    const val PARAM_GROUP_ID = FirebaseAnalytics.Param.GROUP_ID

    /**
     * Item的参数，商品所属类别。如果将其用作类别层级或类目的一部分，则为第一个类别。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：服饰
     */
    const val PARAM_ITEM_CATEGORY = FirebaseAnalytics.Param.ITEM_CATEGORY

    /**
     * Item的参数，商品的 ID。
     * 必须提供 item_id 或 item_name 中的一个。
     *
     * 数据类型：string
     * 是否必须提供：是
     * 示例：SKU_12345
     */
    const val PARAM_ITEM_ID = FirebaseAnalytics.Param.ITEM_ID

    /**
     * Item的参数，商品的名称。
     * 必须提供 item_id 或 item_name 中的一个。
     */
    const val PARAM_ITEM_NAME = FirebaseAnalytics.Param.ITEM_NAME
    const val PARAM_LOCATION = FirebaseAnalytics.Param.LOCATION

    /**
     * 角色的等级或得分对应的关卡。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：5
     */
    const val PARAM_LEVEL = FirebaseAnalytics.Param.LEVEL

    /**
     * 关卡的名称。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：踏上征途…
     */
    const val PARAM_LEVEL_NAME = FirebaseAnalytics.Param.LEVEL_NAME

    /**
     * 登录时所用的方法或共享内容的方法。。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：Google
     */
    const val PARAM_METHOD = FirebaseAnalytics.Param.METHOD
    const val PARAM_NUMBER_OF_NIGHTS = FirebaseAnalytics.Param.NUMBER_OF_NIGHTS
    const val PARAM_NUMBER_OF_PASSENGERS = FirebaseAnalytics.Param.NUMBER_OF_PASSENGERS
    const val PARAM_NUMBER_OF_ROOMS = FirebaseAnalytics.Param.NUMBER_OF_ROOMS
    const val PARAM_DESTINATION = FirebaseAnalytics.Param.DESTINATION
    const val PARAM_ORIGIN = FirebaseAnalytics.Param.ORIGIN

    /**
     * Item的参数，商品的货币价格（以指定的 currency 参数为单位）。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：9.99
     */
    const val PARAM_PRICE = FirebaseAnalytics.Param.PRICE

    /**
     * 商品数量。
     * 如果未设置，quantity 将设置为 1。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：1
     */
    const val PARAM_QUANTITY = FirebaseAnalytics.Param.QUANTITY

    /**
     * 要发布的得分。
     *
     * 数据类型：number
     * 是否必须提供：是
     * 示例：10000
     */
    const val PARAM_SCORE = FirebaseAnalytics.Param.SCORE

    /**
     * 与交易相关的运费。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：3.33
     */
    const val PARAM_SHIPPING = FirebaseAnalytics.Param.SHIPPING

    /**
     * 交易的唯一标识符。
     * transaction_id 参数有助于避免出现重复的购买事件。
     *
     * 数据类型：string
     * 是否必须提供：是
     * 示例：T_12345
     */
    const val PARAM_TRANSACTION_ID = FirebaseAnalytics.Param.TRANSACTION_ID

    /**
     * 搜索的字词。
     *
     * 数据类型：string
     * 是否必须提供：是
     * 示例：T 恤
     */
    const val PARAM_SEARCH_TERM = FirebaseAnalytics.Param.SEARCH_TERM

    /**
     * 如果成功通关，则设为 true。
     *
     * 数据类型：boolean
     * 是否必须提供：否
     * 示例：true
     */
    const val PARAM_SUCCESS = FirebaseAnalytics.Param.SUCCESS

    /**
     * 与交易相关的税费。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：1.11
     */
    const val PARAM_TAX = FirebaseAnalytics.Param.TAX

    /**
     * 与事件相关的货币价值。
     * 为了生成有意义的报告，通常必须提供 value。如果您将事件标记为转化，则建议您设置 value。
     * 如果设置 value，则必须提供 currency。
     *
     * 数据类型：number
     * 是否必须提供：是
     * 示例：7.77
     */
    const val PARAM_VALUE = FirebaseAnalytics.Param.VALUE

    /**
     * 虚拟货币的名称。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：宝石
     */
    const val PARAM_VIRTUAL_CURRENCY_NAME = FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME
    const val PARAM_CAMPAIGN = FirebaseAnalytics.Param.CAMPAIGN
    const val PARAM_SOURCE = FirebaseAnalytics.Param.SOURCE
    const val PARAM_MEDIUM = FirebaseAnalytics.Param.MEDIUM
    const val PARAM_TERM = FirebaseAnalytics.Param.TERM
    const val PARAM_CONTENT = FirebaseAnalytics.Param.CONTENT
    const val PARAM_ACLID = FirebaseAnalytics.Param.ACLID
    const val PARAM_CP1 = FirebaseAnalytics.Param.CP1
    const val PARAM_CAMPAIGN_ID = FirebaseAnalytics.Param.CAMPAIGN_ID
    const val PARAM_SOURCE_PLATFORM = FirebaseAnalytics.Param.SOURCE_PLATFORM
    const val PARAM_CREATIVE_FORMAT = FirebaseAnalytics.Param.CREATIVE_FORMAT
    const val PARAM_MARKETING_TACTIC = FirebaseAnalytics.Param.MARKETING_TACTIC

    /**
     * Item的参数，商品所属品牌。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：Google
     */
    const val PARAM_ITEM_BRAND = FirebaseAnalytics.Param.ITEM_BRAND

    /**
     * Item的参数，用于提供其他商品详情/选项的商品款式/规格、唯一代码或说明。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：绿色
     */
    const val PARAM_ITEM_VARIANT = FirebaseAnalytics.Param.ITEM_VARIANT

    /**
     * Item的参数，促销广告素材的名称。
     * 如果设置此参数，系统会忽略事件级 creative_name。
     * 如果未设置此参数，系统会使用事件级 creative_name（如果存在）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：summer_banner2
     */
    const val PARAM_CREATIVE_NAME = FirebaseAnalytics.Param.CREATIVE_NAME

    /**
     * Item的参数，与商品相关的促销广告素材投放到的广告位的名称。
     * 如果设置此参数，系统会忽略事件级 creative_slot。
     * 如果未设置此参数，系统会使用事件级 creative_slot（如果存在）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：featured_app_1
     */
    const val PARAM_CREATIVE_SLOT = FirebaseAnalytics.Param.CREATIVE_SLOT

    /**
     * Item的参数，用于指定供应公司或实体店面的商品关联商户。
     * 注意：`affiliation` 仅适用于商品级范围。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：Google 商店
     */
    const val PARAM_AFFILIATION = FirebaseAnalytics.Param.AFFILIATION

    /**
     * Item的参数，列表中商品的索引/商品在列表中的位置。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：5
     */
    const val PARAM_INDEX = FirebaseAnalytics.Param.INDEX

    /**
     * Item的参数，与商品相关的折扣货币价值。
     *
     * 数据类型：number
     * 是否必须提供：否
     * 示例：2.22
     */
    const val PARAM_DISCOUNT = FirebaseAnalytics.Param.DISCOUNT

    /**
     * Item的参数，商品的第二个类别层级或其他类目。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：成人
     */
    const val PARAM_ITEM_CATEGORY2 = FirebaseAnalytics.Param.ITEM_CATEGORY2

    /**
     * Item的参数，商品的第三个类别层级或其他类目。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：衬衫
     */
    const val PARAM_ITEM_CATEGORY3 = FirebaseAnalytics.Param.ITEM_CATEGORY3

    /**
     * Item的参数，商品的第四个类别层级或其他类目。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：圆领
     */
    const val PARAM_ITEM_CATEGORY4 = FirebaseAnalytics.Param.ITEM_CATEGORY4

    /**
     * Item的参数，商品的第五个类别层级或其他类目。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：短袖
     */
    const val PARAM_ITEM_CATEGORY5 = FirebaseAnalytics.Param.ITEM_CATEGORY5

    /**
     * Item的参数，商品向用户展示时所在列表的 ID。
     * 如果设置此参数，系统会忽略事件级 item_list_id。
     * 如果未设置此参数，系统会使用事件级 item_list_id（如果存在）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：related_products
     */
    const val PARAM_ITEM_LIST_ID = FirebaseAnalytics.Param.ITEM_LIST_ID

    /**
     * Item的参数，商品向用户展示时所在列表的名称。
     * 如果设置此参数，系统会忽略事件级 item_list_name。
     * 如果未设置此参数，系统会使用事件级 item_list_name（如果存在）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：相关产品
     */
    const val PARAM_ITEM_LIST_NAME = FirebaseAnalytics.Param.ITEM_LIST_NAME

    /**
     * 与事件相关的商品。
     *
     * 数据类型：Array<Item>
     * 是否必须提供：是
     *
     * @see PARAM_ITEM_ID
     * @see PARAM_ITEM_NAME
     * @see PARAM_AFFILIATION
     * @see PARAM_COUPON
     * @see PARAM_CREATIVE_NAME
     * @see PARAM_CREATIVE_SLOT
     * @see PARAM_DISCOUNT
     * @see PARAM_INDEX
     * @see PARAM_ITEM_BRAND
     * @see PARAM_ITEM_CATEGORY
     * @see PARAM_ITEM_CATEGORY2
     * @see PARAM_ITEM_CATEGORY3
     * @see PARAM_ITEM_CATEGORY4
     * @see PARAM_ITEM_CATEGORY5
     * @see PARAM_ITEM_LIST_ID
     * @see PARAM_ITEM_LIST_NAME
     * @see PARAM_ITEM_VARIANT
     * @see PARAM_LOCATION_ID
     * @see PARAM_PRICE
     * @see PARAM_PROMOTION_ID
     * @see PARAM_PROMOTION_NAME
     * @see PARAM_QUANTITY
     */
    const val PARAM_ITEMS = FirebaseAnalytics.Param.ITEMS

    /**
     * Item的参数，与商品关联的实际位置（例如实体店）。建议使用与相关商品对应的 Google 地点 ID，也可使用自定义地
     * 理位置 ID。
     * 注意：`location id` 仅适用于商品级范围。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：ChIJIQBpAG2ahYAR_6128GcTUEo（旧金山对应的 Google 地点 ID）
     */
    const val PARAM_LOCATION_ID = FirebaseAnalytics.Param.LOCATION_ID

    /**
     * 选定的付款方式。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：信用卡
     */
    const val PARAM_PAYMENT_TYPE = FirebaseAnalytics.Param.PAYMENT_TYPE

    /**
     * Item的参数，与商品相关的促销活动的 ID。
     * 如果设置此参数，系统会忽略事件级 promotion_id。
     * 如果未设置此参数，系统会使用事件级 promotion_id（如果存在）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：P_12345
     */
    const val PARAM_PROMOTION_ID = FirebaseAnalytics.Param.PROMOTION_ID

    /**
     * Item的参数，与商品相关的促销活动的名称。
     * 如果设置此参数，系统会忽略事件级 promotion_name。
     * 如果未设置此参数，系统会使用事件级 promotion_name（如果存在）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：夏季促销
     */
    const val PARAM_PROMOTION_NAME = FirebaseAnalytics.Param.PROMOTION_NAME
    const val PARAM_SCREEN_CLASS = FirebaseAnalytics.Param.SCREEN_CLASS
    const val PARAM_SCREEN_NAME = FirebaseAnalytics.Param.SCREEN_NAME

    /**
     * 用户为所购商品选择的配送级别（例如 Ground、Air 和 Next-day）。
     *
     * 数据类型：string
     * 是否必须提供：否
     * 示例：Ground
     */
    const val PARAM_SHIPPING_TIER = FirebaseAnalytics.Param.SHIPPING_TIER

    /**
     * 此事件表示用户在电子商务结账过程中提交了付款信息。
     */
    fun addPaymentInfo(context: Context, currency: String, value: Double, coupon: String? = null,
                       paymentType: String? = null, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putString(PARAM_COUPON, coupon)
        params.putString(PARAM_PAYMENT_TYPE, paymentType)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_ADD_PAYMENT_INFO, params)
    }

    /**
     * 此事件表示用户在电子商务结账过程中提交了付款信息。
     */
    fun Activity.spmAddPaymentInfo(currency: String, value: Double, coupon: String? = null,
                                   paymentType: String? = null, items: Array<SpmItem>?) {
        addPaymentInfo(this, currency, value, coupon, paymentType, items)
    }

    /**
     * 此事件表示用户在电子商务结账过程中提交了付款信息。
     */
    fun Fragment.spmAddPaymentInfo(currency: String, value: Double, coupon: String? = null,
                                   paymentType: String? = null, items: Array<SpmItem>?) {
        addPaymentInfo(requireActivity(), currency, value, coupon, paymentType, items)
    }

    /**
     * 此事件表示用户在电子商务结账过程中提交了运费信息。
     */
    fun addShippingInfo(context: Context, currency: String, value: Double, coupon: String? = null,
                        shippingTier: String? = null, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putString(PARAM_COUPON, coupon)
        params.putString(PARAM_SHIPPING_TIER, shippingTier)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_ADD_SHIPPING_INFO, params)
    }

    /**
     * 此事件表示用户在电子商务结账过程中提交了运费信息。
     */
    fun Activity.spmAddShippingInfo(currency: String, value: Double, coupon: String? = null,
                        shippingTier: String? = null, items: Array<SpmItem>?) {
        addShippingInfo(this, currency, value, coupon, shippingTier, items)
    }

    /**
     * 此事件表示用户在电子商务结账过程中提交了运费信息。
     */
    fun Fragment.spmAddShippingInfo(currency: String, value: Double, coupon: String? = null,
                        shippingTier: String? = null, items: Array<SpmItem>?) {
        addShippingInfo(requireActivity(), currency, value, coupon, shippingTier, items)
    }

    /**
     * 此事件表示商品已添加到购物车，可供购买。
     */
    fun addToCart(context: Context, currency: String, value: Double, items: Array<SpmItem>) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_ADD_TO_CART, params)
    }

    /**
     * 此事件表示商品已添加到购物车，可供购买。
     */
    fun Activity.spmAddToCart(currency: String, value: Double, items: Array<SpmItem>) {
        addToCart(this, currency, value, items)
    }

    /**
     * 此事件表示商品已添加到购物车，可供购买。
     */
    fun Fragment.spmAddToCart(currency: String, value: Double, items: Array<SpmItem>) {
        addToCart(requireActivity(), currency, value, items)
    }

    /**
     * 此事件表示商品已添加到心愿单。使用此事件可找出您应用中的热门礼品。
     */
    fun addToWishlist(context: Context, currency: String, value: Double, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_ADD_TO_WISHLIST, params)
    }

    /**
     * 此事件表示商品已添加到心愿单。使用此事件可找出您应用中的热门礼品。
     */
    fun Activity.spmAddToWishlist(currency: String, value: Double, items: Array<SpmItem>?) {
        addToWishlist(this, currency, value, items)
    }

    /**
     * 此事件表示商品已添加到心愿单。使用此事件可找出您应用中的热门礼品。
     */
    fun Fragment.spmAddToWishlist(currency: String, value: Double, items: Array<SpmItem>?) {
        addToWishlist(requireActivity(), currency, value, items)
    }

    /**
     * 此事件表示用户已开始结账流程。
     */
    fun beginCheckout(context: Context, currency: String, value: Double, coupon: String? = null,
                      items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putString(PARAM_COUPON, coupon)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_BEGIN_CHECKOUT, params)
    }

    /**
     * 此事件表示用户已开始结账流程。
     */
    fun Activity.spmBeginCheckout(currency: String, value: Double, coupon: String? = null,
                      items: Array<SpmItem>?) {
        beginCheckout(this, currency, value, coupon, items)
    }

    /**
     * 此事件表示用户已开始结账流程。
     */
    fun Fragment.spmBeginCheckout(currency: String, value: Double, coupon: String? = null,
                      items: Array<SpmItem>?) {
        beginCheckout(requireActivity(), currency, value, coupon, items)
    }

    /**
     * 此事件用于衡量用户在游戏中获得的虚拟货币奖励。 将其与 spend_virtual_currency 一起记录，以更好地了解您的
     * 虚拟经济。
     */
    fun earnVirtualCurrency(context: Context, virtualCurrencyName: String, value: Double?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_VIRTUAL_CURRENCY_NAME, virtualCurrencyName)
        if (value != null) {
            params.putDouble(PARAM_VALUE, value)
        }
        firebaseAnalytics.logEvent(EVENT_EARN_VIRTUAL_CURRENCY, params)
    }

    /**
     * 此事件用于衡量用户在游戏中获得的虚拟货币奖励。 将其与 spend_virtual_currency 一起记录，以更好地了解您的
     * 虚拟经济。
     */
    fun Activity.spmEarnVirtualCurrency(virtualCurrencyName: String, value: Double?) {
        earnVirtualCurrency(this, virtualCurrencyName, value)
    }

    /**
     * 此事件用于衡量用户在游戏中获得的虚拟货币奖励。 将其与 spend_virtual_currency 一起记录，以更好地了解您的
     * 虚拟经济。
     */
    fun Fragment.spmEarnVirtualCurrency(virtualCurrencyName: String, value: Double?) {
        earnVirtualCurrency(requireActivity(), virtualCurrencyName, value)
    }

    /**
     * 此事件会衡量潜在客户的发掘时间（例如，通过表单衡量）。记录此信息，了解营销广告系列的效果，以及有多少客户在向
     * 客户进行再营销后与您的商家再次互动。
     */
    fun generateLead(context: Context, currency: String, value: Double) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        firebaseAnalytics.logEvent(EVENT_GENERATE_LEAD, params)
    }

    /**
     * 此事件会衡量潜在客户的发掘时间（例如，通过表单衡量）。记录此信息，了解营销广告系列的效果，以及有多少客户在向
     * 客户进行再营销后与您的商家再次互动。
     */
    fun Activity.spmGenerateLead(currency: String, value: Double) {
        generateLead(this, currency, value)
    }

    /**
     * 此事件会衡量潜在客户的发掘时间（例如，通过表单衡量）。记录此信息，了解营销广告系列的效果，以及有多少客户在向
     * 客户进行再营销后与您的商家再次互动。
     */
    fun Fragment.spmGenerateLead(currency: String, value: Double) {
        generateLead(requireActivity(), currency, value)
    }

    /**
     * 在用户加入群组（例如公会、团队或家庭）时记录此事件。使用此事件可分析特定群组或社交功能的受欢迎程度。
     */
    fun joinGroup(context: Context, groupId: String) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_GROUP_ID, groupId)
        firebaseAnalytics.logEvent(EVENT_JOIN_GROUP, params)
    }

    /**
     * 在用户加入群组（例如公会、团队或家庭）时记录此事件。使用此事件可分析特定群组或社交功能的受欢迎程度。
     */
    fun Activity.spmJoinGroup(groupId: String) {
        joinGroup(this, groupId)
    }

    /**
     * 在用户加入群组（例如公会、团队或家庭）时记录此事件。使用此事件可分析特定群组或社交功能的受欢迎程度。
     */
    fun Fragment.spmJoinGroup(groupId: String) {
        joinGroup(requireActivity(), groupId)
    }

    /**
     * 此事件表示玩家已达到游戏关卡。
     */
    fun levelEnd(context: Context, levelName: String, success: Boolean?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_LEVEL_NAME, levelName)
        if (success != null) {
            params.putBoolean(PARAM_SUCCESS, success)
        }
        firebaseAnalytics.logEvent(EVENT_LEVEL_END, params)
    }

    /**
     * 此事件表示玩家已达到游戏关卡。
     */
    fun Activity.spmLevelEnd(levelName: String, success: Boolean?) {
        levelEnd(this, levelName, success)
    }

    /**
     * 此事件表示玩家已达到游戏关卡。
     */
    fun Fragment.spmLevelEnd(levelName: String, success: Boolean?) {
        levelEnd(requireActivity(), levelName, success)
    }

    /**
     * 此事件表示玩家已在游戏中开始一个关卡。
     */
    fun levelStart(context: Context, levelName: String) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_LEVEL_NAME, levelName)
        firebaseAnalytics.logEvent(EVENT_LEVEL_START, params)
    }

    /**
     * 此事件表示玩家已在游戏中开始一个关卡。
     */
    fun Activity.spmLevelStart(levelName: String) {
        levelStart(this, levelName)
    }

    /**
     * 此事件表示玩家已在游戏中开始一个关卡。
     */
    fun Fragment.spmLevelStart(levelName: String) {
        levelStart(requireActivity(), levelName)
    }

    /**
     * 此事件表示玩家在游戏中已升级。您可以用它来衡量用户群的层级分布，并确定难以完成的层级。
     */
    fun levelUp(context: Context, level: Int, character: String?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        if (level != null) {
            params.putInt(PARAM_LEVEL, level)
        }
        params.putString(PARAM_CHARACTER, character)
        firebaseAnalytics.logEvent(EVENT_LEVEL_UP, params)
    }

    /**
     * 此事件表示玩家在游戏中已升级。您可以用它来衡量用户群的层级分布，并确定难以完成的层级。
     */
    fun Activity.spmLevelUp(level: Int, character: String?) {
        levelUp(this, level, character)
    }

    /**
     * 此事件表示玩家在游戏中已升级。您可以用它来衡量用户群的层级分布，并确定难以完成的层级。
     */
    fun Fragment.spmLevelUp(level: Int, character: String?) {
        levelUp(requireActivity(), level, character)
    }

    /**
     * 发送此事件表示用户已登录您的网站或应用。
     */
    fun login(context: Context, method: String?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_METHOD, method)
        firebaseAnalytics.logEvent(EVENT_LOGIN, params)
    }

    /**
     * 发送此事件表示用户已登录您的网站或应用。
     */
    fun Activity.spmLogin(method: String?) {
        login(this, method)
    }

    /**
     * 发送此事件表示用户已登录您的网站或应用。
     */
    fun Fragment.spmLogin(method: String?) {
        login(requireActivity(), method)
    }

    /**
     * 在用户发布得分时发送此事件。使用此事件可了解用户在您游戏中的表现，并将最高得分与受众群体或行为关联起来。
     */
    fun postScore(context: Context, score: Long, level: Int?, character: String?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putLong(PARAM_SCORE, score)
        if (level != null) {
            params.putInt(PARAM_LEVEL, level)
        }
        params.putString(PARAM_CHARACTER, character)
        firebaseAnalytics.logEvent(EVENT_POST_SCORE, params)
    }

    /**
     * 在用户发布得分时发送此事件。使用此事件可了解用户在您游戏中的表现，并将最高得分与受众群体或行为关联起来。
     */
    fun Activity.spmPostScore(score: Long, level: Int?, character: String?) {
        postScore(this, score, level, character)
    }

    /**
     * 在用户发布得分时发送此事件。使用此事件可了解用户在您游戏中的表现，并将最高得分与受众群体或行为关联起来。
     */
    fun Fragment.spmPostScore(score: Long, level: Int?, character: String?) {
        postScore(requireActivity(), score, level, character)
    }

    /**
     * 此事件表示用户已购买一件或多件商品。
     */
    fun purchase(context: Context, currency: String, transactionId: String?, value: Double,
                 coupon: String?, shipping: Double?, tax: Double?, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putString(PARAM_TRANSACTION_ID, transactionId)
        params.putDouble(PARAM_VALUE, value)
        params.putString(PARAM_COUPON, coupon)
        if (shipping != null) {
            params.putDouble(PARAM_SHIPPING, shipping)
        }
        if (tax != null) {
            params.putDouble(PARAM_TAX, tax)
        }
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_PURCHASE, params)
    }

    /**
     * 此事件表示用户已购买一件或多件商品。
     */
    fun Activity.spmPurchase(currency: String, transactionId: String?, value: Double,
                 coupon: String?, shipping: Double?, tax: Double?, items: Array<SpmItem>?) {
        purchase(this, currency, transactionId, value, coupon, shipping, tax, items)
    }

    /**
     * 此事件表示用户已购买一件或多件商品。
     */
    fun Fragment.spmPurchase(currency: String, transactionId: String?, value: Double,
                 coupon: String?, shipping: Double?, tax: Double?, items: Array<SpmItem>?) {
        purchase(requireActivity(), currency, transactionId, value, coupon, shipping, tax, items)
    }

    /**
     * 此事件表示向用户退回一件或多件商品的款项。
     */
    fun refund(context: Context, currency: String, transactionId: String?, value: Double,
                 coupon: String?, shipping: Double?, tax: Double?, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putString(PARAM_TRANSACTION_ID, transactionId)
        params.putDouble(PARAM_VALUE, value)
        params.putString(PARAM_COUPON, coupon)
        if (shipping != null) {
            params.putDouble(PARAM_SHIPPING, shipping)
        }
        if (tax != null) {
            params.putDouble(PARAM_TAX, tax)
        }
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_REFUND, params)
    }

    /**
     * 此事件表示向用户退回一件或多件商品的款项。
     */
    fun Activity.spmRefund(currency: String, transactionId: String?, value: Double,
               coupon: String?, shipping: Double?, tax: Double?, items: Array<SpmItem>?) {
        refund(this, currency, transactionId, value, coupon, shipping, tax, items)
    }

    /**
     * 此事件表示向用户退回一件或多件商品的款项。
     */
    fun Fragment.spmRefund(currency: String, transactionId: String?, value: Double,
               coupon: String?, shipping: Double?, tax: Double?, items: Array<SpmItem>?) {
        refund(requireActivity(), currency, transactionId, value, coupon, shipping, tax, items)
    }

    /**
     * 此事件表示商品已从购物车中移除。
     */
    fun removeFromCart(context: Context, currency: String, value: Double, items: Array<SpmItem>) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_REMOVE_FROM_CART, params)
    }

    /**
     * 此事件表示商品已从购物车中移除。
     */
    fun Activity.spmRemoveFromCart(currency: String, value: Double, items: Array<SpmItem>) {
        removeFromCart(this, currency, value, items)
    }

    /**
     * 此事件表示商品已从购物车中移除。
     */
    fun Fragment.spmRemoveFromCart(currency: String, value: Double, items: Array<SpmItem>) {
        removeFromCart(requireActivity(), currency, value, items)
    }

    /**
     * 记录此事件，以表明用户何时执行了搜索。您可以使用此事件来识别用户在您的网站或应用中搜索的内容。例如，您可以在
     * 用户执行搜索后查看搜索结果页时发送此事件。
     */
    fun search(context: Context, searchTerm: String) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_SEARCH_TERM, searchTerm)
        firebaseAnalytics.logEvent(EVENT_SEARCH, params)
    }

    /**
     * 记录此事件，以表明用户何时执行了搜索。您可以使用此事件来识别用户在您的网站或应用中搜索的内容。例如，您可以在
     * 用户执行搜索后查看搜索结果页时发送此事件。
     */
    fun Activity.spmSearch(searchTerm: String) {
        search(this, searchTerm)
    }

    /**
     * 记录此事件，以表明用户何时执行了搜索。您可以使用此事件来识别用户在您的网站或应用中搜索的内容。例如，您可以在
     * 用户执行搜索后查看搜索结果页时发送此事件。
     */
    fun Fragment.spmSearch(searchTerm: String) {
        search(requireActivity(), searchTerm)
    }

    /**
     * 此事件表示用户选择了某个类型的某些内容。此事件有助于您了解您网站或应用中的热门内容和内容类别。
     */
    fun selectContent(context: Context, contentType: String) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CONTENT_TYPE, contentType)
        firebaseAnalytics.logEvent(EVENT_SELECT_CONTENT, params)
    }

    /**
     * 此事件表示用户选择了某个类型的某些内容。此事件有助于您了解您网站或应用中的热门内容和内容类别。
     */
    fun Activity.spmSelectContent(contentType: String) {
        selectContent(this, contentType)
    }

    /**
     * 此事件表示用户选择了某个类型的某些内容。此事件有助于您了解您网站或应用中的热门内容和内容类别。
     */
    fun Fragment.spmSelectContent(contentType: String) {
        selectContent(requireActivity(), contentType)
    }

    /**
     * 此事件表示从列表中选择了商品。
     */
    fun selectItem(context: Context, itemListId: String?, itemListName: String, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_ITEM_LIST_ID, itemListId)
        params.putString(PARAM_ITEM_LIST_NAME, itemListName)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_SELECT_ITEM, params)
    }

    /**
     * 此事件表示从列表中选择了商品。
     */
    fun Activity.spmSelectItem(itemListId: String?, itemListName: String, items: Array<SpmItem>?) {
        selectItem(this, itemListId, itemListName, items)
    }

    /**
     * 此事件表示从列表中选择了商品。
     */
    fun Fragment.spmSelectItem(itemListId: String?, itemListName: String, items: Array<SpmItem>?) {
        selectItem(requireActivity(), itemListId, itemListName, items)
    }

    /**
     * 此事件表示从列表中选择了推广活动。
     */
    fun selectPromotion(context: Context, creativeName: String?, creativeSlot: String?,
                        promotionId: String?, promotionName: String, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CREATIVE_NAME, creativeName)
        params.putString(PARAM_CREATIVE_SLOT, creativeSlot)
        params.putString(PARAM_PROMOTION_ID, promotionId)
        params.putString(PARAM_PROMOTION_NAME, promotionName)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_SELECT_PROMOTION, params)
    }

    /**
     * 此事件表示从列表中选择了推广活动。
     */
    fun Activity.spmSelectPromotion(creativeName: String?, creativeSlot: String?,
                        promotionId: String?, promotionName: String, items: Array<SpmItem>?) {
        selectPromotion(this, creativeName, creativeSlot, promotionId, promotionName, items)
    }

    /**
     * 此事件表示从列表中选择了推广活动。
     */
    fun Fragment.spmSelectPromotion(creativeName: String?, creativeSlot: String?,
                        promotionId: String?, promotionName: String, items: Array<SpmItem>?) {
        selectPromotion(requireActivity(), creativeName, creativeSlot, promotionId, promotionName,
            items)
    }

    /**
     * 在用户分享了内容时使用此事件。
     */
    fun share(context: Context, method: String?, contentType: String?, itemId: String?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_METHOD, method)
        params.putString(PARAM_CONTENT_TYPE, contentType)
        params.putString(PARAM_ITEM_ID, itemId)
        firebaseAnalytics.logEvent(EVENT_SHARE, params)
    }

    /**
     * 在用户分享了内容时使用此事件。
     */
    fun Activity.spmShare(method: String?, contentType: String?, itemId: String?) {
        share(this, method, contentType, itemId)
    }

    /**
     * 在用户分享了内容时使用此事件。
     */
    fun Fragment.spmShare(method: String?, contentType: String?, itemId: String?) {
        share(requireActivity(), method, contentType, itemId)
    }

    /**
     * 此事件表示用户已注册帐号。使用此事件可了解登录用户和退出用户的不同行为。
     */
    fun signUp(context: Context, method: String?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_METHOD, method)
        firebaseAnalytics.logEvent(EVENT_SIGN_UP, params)
    }

    /**
     * 此事件表示用户已注册帐号。使用此事件可了解登录用户和退出用户的不同行为。
     */
    fun Activity.spmSignUp(method: String?) {
        signUp(this, method)
    }

    /**
     * 此事件表示用户已注册帐号。使用此事件可了解登录用户和退出用户的不同行为。
     */
    fun Fragment.spmSignUp(method: String?) {
        signUp(requireActivity(), method)
    }

    /**
     * 此事件衡量的是应用内虚拟商品的销售情况，有助于您确定哪些虚拟商品最受欢迎。
     */
    fun spendVirtualCurrency(context: Context, value: Double, virtualCurrencyName: String, itemName: String?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putDouble(PARAM_VALUE, value)
        params.putString(PARAM_VIRTUAL_CURRENCY_NAME, virtualCurrencyName)
        params.putString(PARAM_ITEM_NAME, itemName)
        firebaseAnalytics.logEvent(EVENT_SPEND_VIRTUAL_CURRENCY, params)
    }

    /**
     * 此事件衡量的是应用内虚拟商品的销售情况，有助于您确定哪些虚拟商品最受欢迎。
     */
    fun Activity.spmSpendVirtualCurrency(value: Double, virtualCurrencyName: String, itemName: String?) {
        spendVirtualCurrency(this, value, virtualCurrencyName, itemName)
    }

    /**
     * 此事件衡量的是应用内虚拟商品的销售情况，有助于您确定哪些虚拟商品最受欢迎。
     */
    fun Fragment.spmSpendVirtualCurrency(value: Double, virtualCurrencyName: String, itemName: String?) {
        spendVirtualCurrency(requireActivity(), value, virtualCurrencyName, itemName)
    }

    /**
     * 此事件表示新手入门流程已开始。在包含 tutorial_complete 的漏斗中使用此事件可了解有多少用户完成了教程。
     */
    fun tutorialBegin(context: Context) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        firebaseAnalytics.logEvent(EVENT_TUTORIAL_BEGIN, params)
    }

    /**
     * 此事件表示新手入门流程已开始。在包含 tutorial_complete 的漏斗中使用此事件可了解有多少用户完成了教程。
     */
    fun Activity.spmTutorialBegin() {
        tutorialBegin(this)
    }

    /**
     * 此事件表示新手入门流程已开始。在包含 tutorial_complete 的漏斗中使用此事件可了解有多少用户完成了教程。
     */
    fun Fragment.spmTutorialBegin() {
        tutorialBegin(requireActivity())
    }

    /**
     * 此事件表示用户已完成新手入门流程。在包含 tutorial_begin 的漏斗中使用此事件可了解有多少用户完成了教程。
     */
    fun tutorialComplete(context: Context) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        firebaseAnalytics.logEvent(EVENT_TUTORIAL_COMPLETE, params)
    }

    /**
     * 此事件表示用户已完成新手入门流程。在包含 tutorial_begin 的漏斗中使用此事件可了解有多少用户完成了教程。
     */
    fun Activity.spmTutorialComplete() {
        tutorialComplete(this)
    }

    /**
     * 此事件表示用户已完成新手入门流程。在包含 tutorial_begin 的漏斗中使用此事件可了解有多少用户完成了教程。
     */
    fun Fragment.spmTutorialComplete() {
        tutorialComplete(requireActivity())
    }

    /**
     * 在用户解锁成就时记录此事件。此事件有助于您了解用户在您游戏中的体验。
     */
    fun unlockAchievement(context: Context, achievementId: String) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_ACHIEVEMENT_ID, achievementId)
        firebaseAnalytics.logEvent(EVENT_UNLOCK_ACHIEVEMENT, params)
    }

    /**
     * 在用户解锁成就时记录此事件。此事件有助于您了解用户在您游戏中的体验。
     */
    fun Activity.spmUnlockAchievement(achievementId: String) {
        unlockAchievement(this, achievementId)
    }

    /**
     * 在用户解锁成就时记录此事件。此事件有助于您了解用户在您游戏中的体验。
     */
    fun Fragment.spmUnlockAchievement(achievementId: String) {
        unlockAchievement(requireActivity(), achievementId)
    }

    /**
     * 此事件表示用户查看了购物车。
     */
    fun viewCart(context: Context, currency: String, value: Double, items: Array<SpmItem>) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_VIEW_CART, params)
    }

    /**
     * 此事件表示用户查看了购物车。
     */
    fun Activity.spmViewCart(currency: String, value: Double, items: Array<SpmItem>) {
        viewCart(this, currency, value, items)
    }

    /**
     * 此事件表示用户查看了购物车。
     */
    fun Fragment.spmViewCart(currency: String, value: Double, items: Array<SpmItem>) {
        viewCart(requireActivity(), currency, value, items)
    }

    /**
     * 此事件表示向用户展示了某些内容。使用此事件可了解用户查看了哪些最热门商品。
     */
    fun viewItem(context: Context, currency: String, value: Double, items: Array<SpmItem>) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CURRENCY, currency)
        params.putDouble(PARAM_VALUE, value)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_VIEW_ITEM, params)
    }

    /**
     * 此事件表示向用户展示了某些内容。使用此事件可了解用户查看了哪些最热门商品。
     */
    fun Activity.spmViewItem(currency: String, value: Double, items: Array<SpmItem>) {
        viewItem(this, currency, value, items)
    }

    /**
     * 此事件表示向用户展示了某些内容。使用此事件可了解用户查看了哪些最热门商品。
     */
    fun Fragment.spmViewItem(currency: String, value: Double, items: Array<SpmItem>) {
        viewItem(requireActivity(), currency, value, items)
    }

    /**
     * 向用户展示某类商品的列表时记录此事件。
     */
    fun viewItemList(context: Context, itemListId: String?, itemListName: String, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_ITEM_LIST_ID, itemListId)
        params.putString(PARAM_ITEM_LIST_NAME, itemListName)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_VIEW_ITEM_LIST, params)
    }

    /**
     * 向用户展示某类商品的列表时记录此事件。
     */
    fun Activity.spmViewItemList(itemListId: String?, itemListName: String, items: Array<SpmItem>?) {
        viewItemList(this, itemListId, itemListName, items)
    }

    /**
     * 向用户展示某类商品的列表时记录此事件。
     */
    fun Fragment.spmViewItemList(itemListId: String?, itemListName: String, items: Array<SpmItem>?) {
        viewItemList(requireActivity(), itemListId, itemListName, items)
    }

    /**
     * 此事件表示从列表查看了推广活动。
     */
    fun viewPromotion(context: Context, creativeName: String?, creativeSlot: String?,
                      promotionId: String?, promotionName: String, items: Array<SpmItem>?) {
        val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
        val params = Bundle()
        params.putString(PARAM_DEVICE_ID, RomUtils.getDeviceId())
        params.putString(PARAM_CREATIVE_NAME, creativeName)
        params.putString(PARAM_CREATIVE_SLOT, creativeSlot)
        params.putString(PARAM_PROMOTION_ID, promotionId)
        params.putString(PARAM_PROMOTION_NAME, promotionName)
        params.putParcelableArray(PARAM_ITEMS, items)
        firebaseAnalytics.logEvent(EVENT_VIEW_PROMOTION, params)
    }

    /**
     * 此事件表示从列表查看了推广活动。
     */
    fun Activity.spmViewPromotion(creativeName: String?, creativeSlot: String?,
                      promotionId: String?, promotionName: String, items: Array<SpmItem>?) {
        viewPromotion(this, creativeName, creativeSlot, promotionId, promotionName, items)
    }

    /**
     * 此事件表示从列表查看了推广活动。
     */
    fun Fragment.spmViewPromotion(creativeName: String?, creativeSlot: String?,
                      promotionId: String?, promotionName: String, items: Array<SpmItem>?) {
        viewPromotion(requireActivity(), creativeName, creativeSlot, promotionId, promotionName, items)
    }
}