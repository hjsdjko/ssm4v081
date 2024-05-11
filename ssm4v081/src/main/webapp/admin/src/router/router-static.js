import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import fangyichaxun from '@/views/modules/fangyichaxun/list'
    import jingdiantuijian from '@/views/modules/jingdiantuijian/list'
    import discussjiudiantuijian from '@/views/modules/discussjiudiantuijian/list'
    import discussmeishituijian from '@/views/modules/discussmeishituijian/list'
    import discusszhoubiantuijian from '@/views/modules/discusszhoubiantuijian/list'
    import discussjingdiantuijian from '@/views/modules/discussjingdiantuijian/list'
    import meiriqiandao from '@/views/modules/meiriqiandao/list'
    import storeup from '@/views/modules/storeup/list'
    import jingdianfenlei from '@/views/modules/jingdianfenlei/list'
    import zhoubiantuijian from '@/views/modules/zhoubiantuijian/list'
    import yonghu from '@/views/modules/yonghu/list'
    import meishituijian from '@/views/modules/meishituijian/list'
    import jiudiantuijian from '@/views/modules/jiudiantuijian/list'
    import discussfenxiangquan from '@/views/modules/discussfenxiangquan/list'
    import fenxiangquan from '@/views/modules/fenxiangquan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/fangyichaxun',
        name: '防疫查询',
        component: fangyichaxun
      }
      ,{
	path: '/jingdiantuijian',
        name: '景点推荐',
        component: jingdiantuijian
      }
      ,{
	path: '/discussjiudiantuijian',
        name: '酒店推荐评论',
        component: discussjiudiantuijian
      }
      ,{
	path: '/discussmeishituijian',
        name: '美食推荐评论',
        component: discussmeishituijian
      }
      ,{
	path: '/discusszhoubiantuijian',
        name: '周边推荐评论',
        component: discusszhoubiantuijian
      }
      ,{
	path: '/discussjingdiantuijian',
        name: '景点推荐评论',
        component: discussjingdiantuijian
      }
      ,{
	path: '/meiriqiandao',
        name: '每日签到',
        component: meiriqiandao
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/jingdianfenlei',
        name: '景点分类',
        component: jingdianfenlei
      }
      ,{
	path: '/zhoubiantuijian',
        name: '周边推荐',
        component: zhoubiantuijian
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/meishituijian',
        name: '美食推荐',
        component: meishituijian
      }
      ,{
	path: '/jiudiantuijian',
        name: '酒店推荐',
        component: jiudiantuijian
      }
      ,{
	path: '/discussfenxiangquan',
        name: '分享圈评论',
        component: discussfenxiangquan
      }
      ,{
	path: '/fenxiangquan',
        name: '分享圈',
        component: fenxiangquan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
