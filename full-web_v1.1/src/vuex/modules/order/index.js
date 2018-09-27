import axios from 'axios';
import router from '@/router/index'
import api from '@/api/global'
export default {
  state:{ //这里面是要读取或者写入数据的地方
      orderDetails:[]
  },
  actions:{
    vx_orderDetail({commit}){
     api.orderDetail()
     .then((response) => {
        commit('vx_orderDetail_m',response);
     })
     .catch((error)=>{
        console.log(error);
       }
     );
    }
  },
  mutations:{
    vx_orderDetail_m(state,data){
      console.log("orderDetail_m");
      // state.orders.length=data.data.length;
      // for(var i=0;i<data.data.length;i++){
      //   state.orders[i]=data.data[i];
      //   // console.log(state.orders[i]);
      //   router.push({ path: '/order' });
      // }

    }
  }
}
