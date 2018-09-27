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

  //类目接口
  //查询所有类目
  getAllKinds:function(){
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'/api/kind/getAllKinds',
      //data: Qs.stringify(data)

    });
  },

  //通过类目Id查询类目信息
  getOneKind:function(data){
    return axios({
      headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'api/kind/getOneKind',
      data: Qs.stringify(data)
    });
  },

  //插入（新增）类目
  addOneKind:function(data){
    console.log("add api");
    console.log(data.kindName);
    return axios({
      headers:{'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url: 'api/kind/addKind',
      data: Qs.stringify(data)
    });
  },

  //修改类目名称
  updateOneKind:function(data){
    console.log("update api");
    console.log(data.kindName);
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url: 'api/kind/update',
      data: Qs.stringify(data)
    });
  },

  //删除类目
  deleteOneKind:function(data){
    console.log("delete api");
    console.log(data.kindId);
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'api/kind/deleteKind',
      data: Qs.stringify(data)
    });
  },

  //订单接口
  //查询所有订单
  findAllOrder:function(){
    return axios({
      headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'},
      timeout: 3000,
      method: 'post',
      url:'/api/order',
      //data: Qs.stringify(data)

    });
  }

}
