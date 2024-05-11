<template>
	<view class="uni-padding-wrap">
		<view class="header">
			<view class="headerb">
				<swiper class="swiper" :indicator-dots='".swiper-pagination"==null?false:true' :autoplay='autoplaySwiper' :circular='true' indicator-active-color='rgba(45, 234, 234, 1)' indicator-color='rgba(0, 0, 0, .3)' :duration='1000' :interval='intervalSwiper' :vertical='"vertical"=="horizontal"?false:true'>
					<swiper-item v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
						<image mode="aspectFill" :src="swiper.img"></image>
					</swiper-item>
				</swiper>
			</view>
		</view>

		<view class="cu-bar bg-white search" :style="[{top:CustomBar + 'px'}]">
			<picker v-if="queryList.length>1" mode="selector" :range="queryList" range-key="queryName" :value="queryIndex" @change="queryChange" style="padding-left: 20upx;">
				<view><image style="width: 20upx;height: 33upx;" src="../../static/center/to.png"></image></view>
			</picker>
			<view v-if="queryIndex==0" class="search-form round">
				<text class="cuIcon-search"></text>
				<input v-model="searchForm.jingdiantuijiandiqu" type="text" placeholder="地区" ></input>
			</view>
			<view v-if="queryIndex==0" class="action">
				<button @tap="onPageTap('jingdiantuijian')" :style="{width:'auto',borderRadius:'40rpx',height:'80rpx',fontSize:'28rpx',color:'#fff',backgroundColor:btnColor[2],borderColor:btnColor[2]}" class="cu-btn shadow-blur round">搜索</button>
			</view>
			<view v-if="queryIndex==1" class="search-form round">
				<text class="cuIcon-search"></text>
				<input v-model="searchForm.zhoubiantuijianjingdianmingcheng" type="text" placeholder="景点名称" ></input>
			</view>
			<view v-if="queryIndex==1" class="action">
				<button @tap="onPageTap('zhoubiantuijian')" :style="{width:'auto',borderRadius:'40rpx',height:'80rpx',fontSize:'28rpx',color:'#fff',backgroundColor:btnColor[2],borderColor:btnColor[2]}" class="cu-btn shadow-blur round">搜索</button>
			</view>
		</view>
		
																																																																
														<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(74, 209, 242, 1)","borderColor":"rgba(55, 186, 177, 0.5)","color":"rgba(255, 255, 255, 1)","borderRadius":0,"borderWidth":"2rpx","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				景点推荐
			</view>
			<view class="right-content" @tap="onPageTap('jingdiantuijian')" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view @tap="onDetailTap('jingdiantuijian',product.id)" :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homejingdiantuijianlist" :key="index">
				                				                				<view :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}' class="uni-product-title">{{product.jingdianmingcheng}}</view>
								                				                				                				<view class="image-view" :style='{"borderRadius":"20rpx","height":"320rpx"}'>
					<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="uni-product-image" :src="product.jingdiantupian?product.jingdiantupian.split(',')[0]:''"></image>
				</view>
                				                				                				                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' @tap="onDetailTap('jingdiantuijian',product.id)" v-for="(product,index) in homejingdiantuijianlist" :key="index" class="listm flex flex-between">
																																				<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}'>{{product.jingdianmingcheng}}</view>
				</view>
																																																																<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="listmpic" :src="product.jingdiantupian?product.jingdiantupian.split(',')[0]:''"></image>
																																																																																			</view>
		</view>
		<!--list end-->
																<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(74, 209, 242, 1)","borderColor":"rgba(55, 186, 177, 0.5)","color":"rgba(255, 255, 255, 1)","borderRadius":0,"borderWidth":"2rpx","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				美食推荐
			</view>
			<view class="right-content" @tap="onPageTap('meishituijian')" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view @tap="onDetailTap('meishituijian',product.id)" :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homemeishituijianlist" :key="index">
				                				                				<view :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}' class="uni-product-title">{{product.shiwumingcheng}}</view>
								                				                				<view class="image-view" :style='{"borderRadius":"20rpx","height":"320rpx"}'>
					<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="uni-product-image" :src="product.zhaopian?product.zhaopian.split(',')[0]:''"></image>
				</view>
                				                				                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' @tap="onDetailTap('meishituijian',product.id)" v-for="(product,index) in homemeishituijianlist" :key="index" class="listm flex flex-between">
																																				<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}'>{{product.shiwumingcheng}}</view>
				</view>
																																												<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="listmpic" :src="product.zhaopian?product.zhaopian.split(',')[0]:''"></image>
																																																															</view>
		</view>
		<!--list end-->
								<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(74, 209, 242, 1)","borderColor":"rgba(55, 186, 177, 0.5)","color":"rgba(255, 255, 255, 1)","borderRadius":0,"borderWidth":"2rpx","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				酒店推荐
			</view>
			<view class="right-content" @tap="onPageTap('jiudiantuijian')" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view @tap="onDetailTap('jiudiantuijian',product.id)" :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homejiudiantuijianlist" :key="index">
				                				                				<view :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}' class="uni-product-title">{{product.jiudianmingcheng}}</view>
								                				                				<view class="image-view" :style='{"borderRadius":"20rpx","height":"320rpx"}'>
					<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="uni-product-image" :src="product.zhaopian?product.zhaopian.split(',')[0]:''"></image>
				</view>
                				                				                				                				                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' @tap="onDetailTap('jiudiantuijian',product.id)" v-for="(product,index) in homejiudiantuijianlist" :key="index" class="listm flex flex-between">
																																				<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}'>{{product.jiudianmingcheng}}</view>
				</view>
																																												<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="listmpic" :src="product.zhaopian?product.zhaopian.split(',')[0]:''"></image>
																																																																																																							</view>
		</view>
		<!--list end-->
								<view class="pl15 col3 header-title" style="padding: 0 12px;box-sizing: border-box;" :style='{"backgroundColor":"rgba(74, 209, 242, 1)","borderColor":"rgba(55, 186, 177, 0.5)","color":"rgba(255, 255, 255, 1)","borderRadius":0,"borderWidth":"2rpx","fontSize":"32rpx","lineHeight":"72rpx","borderStyle":"solid"}'>
			<view class="left" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				周边推荐
			</view>
			<view class="right-content" @tap="onPageTap('zhoubiantuijian')" :style="{fontSize:'32rpx',color:'rgba(255, 255, 255, 1)'}">
				查看更多
			</view>
		</view>
		<view v-if='1 == 1 || 1 == 2' class="uni-product-list" :class="1 == 2 ? 'active' : ''" :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view @tap="onDetailTap('zhoubiantuijian',product.id)" :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' class="uni-product" v-for="(product,index) in homezhoubiantuijianlist" :key="index">
				                				                				                				<view :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}' class="uni-product-title">{{product.zhoubianmingcheng}}</view>
								                				<view class="image-view" :style='{"borderRadius":"20rpx","height":"320rpx"}'>
					<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="uni-product-image" :src="product.tupian?product.tupian.split(',')[0]:''"></image>
				</view>
                				                				                				                							</view>
		</view>
		<view class="list" v-if='1 == 3' :style='{"borderRadius":0,"backgroundColor":"rgba(135, 128, 128, 0.34)"}'>
			<view :style='{"borderRadius":"12rpx","backgroundColor":"#fff"}' @tap="onDetailTap('zhoubiantuijian',product.id)" v-for="(product,index) in homezhoubiantuijianlist" :key="index" class="listm flex flex-between">
																																																								<view class="listmr">
					<view class="col3 f30 elip mb15" :style='{"fontSize":"28rpx","lineHeight":"56rpx","color":"#333","textAlign":"center"}'>{{product.zhoubianmingcheng}}</view>
				</view>
																								<image :style='{"borderRadius":"20rpx","height":"320rpx"}' mode="aspectFill" class="listmpic" :src="product.tupian?product.tupian.split(',')[0]:''"></image>
																																																																																			</view>
		</view>
		<!--list end-->
																																
																																																														
	</view>
</template>

<script>
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				queryList:[
					{
						queryName:"地区",
					},
					{
						queryName:"景点名称",
					},
				],
				queryIndex: 0,
				searchForm:{
					jingdiantuijiandiqu:'',
					zhoubiantuijianjingdianmingcheng:'',
				},
				CustomBar: '0',

				autoplaySwiper: {"delay":"3000","disableOnInteraction":false} ? true : false,
				intervalSwiper: {"delay":"3000","disableOnInteraction":false} ? 3000 : 5000,
				//轮播
				swiperList: [],
																																																																																																																																																								homejingdiantuijianlist: [],
																																homemeishituijianlist: [],
																homejiudiantuijianlist: [],
																homezhoubiantuijianlist: [],
																																																																				news: [],
			}
		},
		async onShow() {
                        this.btnColor = this.btnColor.sort(()=> {
                                return (0.5-Math.random());
                        });
			// 轮播图
			let swiperList = []
			let res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
																																																																																																
																																																																																													
									res = await this.$api.list('jingdiantuijian', {
				page: 1,

				limit: 4
			});
			this.homejingdiantuijianlist = res.data.list
															res = await this.$api.list('meishituijian', {
				page: 1,

				limit: 4
			});
			this.homemeishituijianlist = res.data.list
									res = await this.$api.list('jiudiantuijian', {
				page: 1,

				limit: 4
			});
			this.homejiudiantuijianlist = res.data.list
									res = await this.$api.list('zhoubiantuijian', {
				page: 1,

				limit: 4
			});
			this.homezhoubiantuijianlist = res.data.list
																													},

		methods: {

			//查询条件切换
			queryChange(e) {
				this.queryIndex=e.detail.value;
				this.searchForm.jingdiantuijiandiqu="";
				this.searchForm.zhoubiantuijianjingdianmingcheng="";
			},
			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(this.queryIndex==0) {
					uni.setStorageSync('indexQueryCondition',this.searchForm.jingdiantuijiandiqu);
					this.searchForm.jingdiantuijiandiqu = '';
				}
				if(this.queryIndex==1) {
					uni.setStorageSync('indexQueryCondition',this.searchForm.zhoubiantuijianjingdianmingcheng);
					this.searchForm.zhoubiantuijianjingdianmingcheng = '';
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			}
		}
	}
</script>

<style>
	page {
		background: #F8F8F8;
	}
	
	.uni-padding-wrap:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	view {
		font-family: '\5FAE\8F6F\96C5\9ED1';
		font-size: 30upx;
	}

	.header {
		background: #EEEEEE;
		padding: 0 0 300upx 0;
		margin-bottom: 20upx;
		position: relative;
	}

	.ssbox {
		background: rgba(255, 255, 255, 0.35);
		width: 530upx;
		border-radius: 60rpx;
		padding: 10upx 15upx;
		box-sizing: border-box;
	}

	.ss_input {
		border: none;
		width: 450upx;
		font-size: 30upx;
		color: #fff;
		background: none;
		height: 45upx;
		line-break: 45upx;
	}

	.headerb {
		position: absolute;
		left: 0;
		width: 100%;
		box-sizing: border-box;
	}

	.headerb image {
		width: 100%;
		position: relative;
		z-index: 10;
	}
	
	.headerb .swiper {
		height: 300upx;
	}
	
		.swiper /deep/ .uni-swiper-dot {
		width: 16rpx;
		height: 16rpx;
		broder-radius: 50%;
	}
		

	.notice {
		position: relative;
		z-index: 5;
		padding: 0 50upx;
	}

	.noticem {
		background: #fff;
		padding: 55upx 30upx 15upx;
		border-radius: 10upx;
		margin-top: -45upx;
	}

	.noticer {
		width: 480upx;
		height: 50upx;
	}

	.noticer .swiper-item {
		white-space: nowrap;
		text-overflow: ellipsis;
		overflow: hidden;
		height: 50upx;
		line-height: 50upx;
		font-size: 24upx;
	}

	.list {
		padding: 20upx 20upx 20upx;
	}

	.listm {
		background: #fff;
		border-radius: 15upx;
		box-shadow: 0 0 2upx rgba(0, 0, 0, 0.1);
		margin-bottom: 20upx;
		padding: 30upx;
	}

	.listmpic {
		border-radius: 10upx;
		width: 166upx;
		margin-right: 20upx;
	}

	.listmr {
		// width: 460upx;
		display: inline-block;
		flex: 1;
		display: flex;
		justify-content: space-between;
		flex-direction: column;
	}

	/* #ifdef MP-WEIXIN */
	.noticer .swiper-item {
		margin-top: 5upx;
	}

	/* #endif */
	/* #ifdef MP-BAIDU */
	.noticer .swiper-item {
		margin-top: 3upx;
	}

	/* #endif */
	/* #ifdef MP-ALIPAY */
	.noticer .swiper-item {
		margin-top: 2upx;
	}

	/* #endif */
	/* #ifdef MP-QQ */
	.noticer .swiper-item {
		margin-top: 4upx;
	}

	/* #endif */
	/* #ifdef MP-TOUTIAO */
	.noticer .swiper-item {
		margin-top: 4upx;
	}

	/* #endif */

	.uni-product-list {
		display: flex;
		width: 100%;
		flex-wrap: wrap;
		flex-direction: row;
		margin-top: 0;
		padding: 0 14upx;
		box-sizing: border-box;
	}
	
	.uni-product-list.active {
		padding: 0 12upx;
	}

	.uni-product {
		padding: 10upx;
		margin: 10upx;
		width: 341upx;
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		background: #FFFFFF;
	}
	
	.uni-product-list.active .uni-product {
		width: 222upx;
	}

	.image-view {
		height: 321upx;
		width: 321upx;
		// margin: 12upx 0;
		display: flex;
		align-items: center;
		overflow: hidden;
	}
	
	.uni-product-list.active .image-view {
		height: 202upx;
		width: 202upx;
		overflow: hidden;
	}

	.uni-product-image {
		height: 100%;
		width: 100%;
		margin: 0 auto;
		display: block;
	}

	.uni-product-title {
		width: 100%;
		word-break: break-all;
		display: -webkit-box;
		overflow: hidden;
		line-height: 1.5;
		text-overflow: ellipsis;
		-webkit-box-orient: vertical;
		-webkit-line-clamp: 1;
	}

	.uni-product-price {
		width: 100%;
		margin-top: 10upx;
		font-size: 28upx;
		line-height: 1.5;
		position: relative;
	}

	.uni-product-price-original {
		color: #e80080;
	}

	.uni-product-price-favour {
		color: #888888;
		text-decoration: line-through;
		margin-left: 10upx;
	}

	.uni-product-tip {
		position: absolute;
		right: 10upx;
		background-color: #ff3333;
		color: #ffffff;
		padding: 0 10upx;
		border-radius: 5upx;
	}

	.header-title {
		display: flex;
		align-items: center;
		text-align: center;
		justify-content: space-between;
		padding: 0 40upx;
	}
</style>
