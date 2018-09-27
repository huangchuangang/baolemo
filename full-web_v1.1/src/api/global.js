import Vue from 'vue'
import axios from 'axios'
import Qs from 'qs'

export default{
  //登录接口
  login:function(data){
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'/api/login',
      data: Qs.stringify(data)

    });
  },
  //查找所有订单
  findAllOrder:function(){
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'/api/orderlist'
    });
  },
  //按订单号查找订单
  selOrderById:function(data){
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'/api/selectorder',
      data: Qs.stringify(data)
    });
  },
  // 订单详情
  orderDetail:function(data){
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'/api/orderDetail',
      data: Qs.stringify(data)

    });
  }

  //
}
