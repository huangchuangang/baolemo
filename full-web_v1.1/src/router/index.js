import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '@/components/Login'
import Home from '@/components/Home'
import Kind from '@/components/kind/Kind'
import Menu from '@/components/menu/Menu'
import Order from '@/components/order/Order'
import orderDetail from '@/components/order/OrderDetail'
import Report from '@/components/report/Report'
import Stock from '@/components/report/Stock'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/', redirect: '/login',
      hidden: true
    },
    {
      path: '/login',
      name: '登录',
      component: Login,
      hidden: true
    },

    {
      path: '/',
      component: Home,
      name: '',
      leaf: true,//只有一个节点
      iconCls: 'el-icon-menu',//图标样式class
      children: [
            { path: '/menu', component: Menu, name: '菜单管理' }
        ]
    },
    {
      path: '/',
      component: Home,
      name: '',
      leaf: true,//只有一个节点
      iconCls: 'el-icon-goods',//图标样式class
      children: [
            { path: '/kind', component: Kind, name: '类目管理' }
        ]
    },

    {
      path: '/',
      component: Home,
      name: '订单模块',
      // leaf: true,//只有一个节点
      iconCls: 'el-icon-tickets',//图标样式class
      children: [
            { path: '/order', component: Order, name: '订单管理' },
            { path: '/orderDetail', component: orderDetail, name: '订单详情',hidden: true }

        ]
    },
    {
      path: '/',
      component: Home,
      name: '报表模块',
      iconCls: 'el-icon-document',//图标样式class
      children: [

          { path: '/report', component: Report, name: '收入支出' },
          { path: '/stock', component: Stock, name: '库存' }

      ]
    }
  ]
})
